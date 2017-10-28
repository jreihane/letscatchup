import React from 'react';
import { EventEmitter } from 'events';
import eventDispatcher from "../dispatcher/Dispatcher.jsx";
import axios from 'axios';
import {Router, Redirect} from 'react-router-dom';


class EventStore extends EventEmitter {
   constructor() {
       super();
        
       this.events = [];
       this.selectedEvent = null;
       this.eventComments = [];
   
   }
   
   addEventItem(eventEntity) {
       
       this.events.push(eventEntity);
       
       this.emit("change");
   }
   
   loadAllEvents() {
       axios.get('http://localhost:8087/event/').then(response => {
         this.events = (response.data);
         this.emit("change");
       })
       
       return this.events;
   }
   
   loadEvent(eventId) {
       axios.get('http://localhost:8087/event/' + eventId).then(response => {
         this.selectedEvent = response.data[0];
         this.emit("change");
       })
       
       return this.selectedEvent;
   }
   
   loadEventComments(eventId) {
       
       if(eventId > 0) {
           axios.get('http://localhost:8087/event/' + eventId + '/comments').then(response => {
               this.eventComments = response.data;
    
               this.emit("changeComments");
             })
       }
         
      return this.eventComments;
   }
   
   getEventDetail(){
       return this.selectedEvent;
   }

   getEventComments(){
       return this.eventComments;
   }
   
   getAllEvents() {
       return this.events;
   }
   
   handleAction(action){
       
       switch (action.type) {
           case 'ADD_EVENT' : {
               this.addEventItem(action.eventEntity);
           }
           case 'CLOSE_EVENT' : {
               this.closeEventDetailWindow(action.obj);
           }
           case 'DO_NOTHING': {
               this.eventContainerClicked(action.obj,action.ev);
           }
       }
   }
   
   closeEventDetailWindow(obj){
       obj.props.history.goBack();
   }
   
   eventContainerClicked(obj, ev){
       ev.stopPropagation();
   }
}

const eventStore = new EventStore;

eventDispatcher.register(eventStore.handleAction.bind(eventStore));

export default eventStore;