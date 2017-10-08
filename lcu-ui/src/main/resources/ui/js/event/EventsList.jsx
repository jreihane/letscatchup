import React from 'react';
import EventStore from './EventStore.jsx';
import EventItem from './EventItem.jsx';
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
                eventsList: EventStore.getAllEvents(),
        };
    }
    
    render() {
        const { eventsList } = this.state;
        
        const eventComponents = eventsList.map((eventItem) => {
            return <EventItem key={eventItem.id} {...eventItem} />;
        });
        
        return (
            <div className={styles.eventListGeneral}>
                <div>{eventComponents}</div>
            </div>
            
        )
    }
    
    
}