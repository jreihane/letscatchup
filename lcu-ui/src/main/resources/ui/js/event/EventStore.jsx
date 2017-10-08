import React from 'react';
import { EventEmitter } from 'events';
import eventDispatcher from "../dispatcher/Dispatcher.jsx";


class EventStore extends EventEmitter {
   constructor() {
       super();
        
       this.events = [{
           id: 1111222,
           eventName: '11',
           eventDate: new Date(),
           groupName: 'dfgdfgf',
           sponsorName: 'dfgfhfgh'
       },{
           id: 1111223,
           eventName: '22',
           eventDate: new Date(),
           groupName: 'juyhujtuj',
           sponsorName: 'ertbnm'
       }];
   
   }
   
   addEventItem() {
       
       this.emit("change");
   }
   
   getAllEvents() {
       return this.events;
   }
   
   handleAction(action){
       console.log("rec " + action.type);
       switch (action.type) {
           case 'LOAD_ALL' : {
               
           }
       }
   }
   
}

const eventStore = new EventStore;

eventDispatcher.register(eventStore.handleAction.bind(eventStore));
window.eventDispatcher = eventDispatcher;
export default eventStore;