import React from 'react';
import {Link} from 'react-router-dom';
import EventStore from './EventStore.jsx';
import EventItem from './EventItem.jsx';
import * as EventActions from './EventAction.jsx';
import styles from '../../css/Event.css'

export default class EventsList extends React.Component {

    componentWillMount() {
        EventStore.on("change", () => {
            this.setState({
                eventsList: EventStore.getAllEvents(),
            })
        })
    }
    
    constructor(){
        super();

        this.state = {
                eventsList: EventStore.loadAllEvents(),
        };
    }
    
    addEvent(eventEntity) {
        EventActions.addEvent(eventEntity);
    }
    
    render() {
        const { eventsList } = this.state;
        
        const eventComponents = eventsList.map((eventItem,i) => {
            return <Link to={`/${eventItem.id}`} key={eventItem.id + "_LINK"}>
                        <EventItem key={eventItem.id} {...eventItem} />
                   </Link>;
        });
        
        return (
                
            <div className={styles.eventListGeneral}>
                <div>{eventComponents}</div>
            </div>
            
        )
    }
    
    
}