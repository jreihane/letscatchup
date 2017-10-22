import React from 'react';
import styles from '../../css/Event.css'
import EventStore from './EventStore.jsx';
import * as EventActions from './EventAction.jsx';
import Moment from 'react-moment';
import ReactStars from 'react-stars';

export default class EventDetail extends React.Component {

    constructor(){
        super();
        
        this.state = {
            eventDetail: {},
        }
    }
    
    componentWillMount() {
        this.setState({
            eventDetail: EventStore.loadEvent(this.props.match.params.eventId),
        })
                
        EventStore.on("change", () => {

            this.setState({
                eventDetail: EventStore.getEventDetail(this.props.match.params.eventId),
            });
            
        });
        
    }
    
    closeEventDetailWindow() {
        EventActions.closeEventDetailWindow(this);
    }
    
    eventContainerClicked(ev){
        EventActions.eventContainerClicked(this, ev);
    }
    
    render() {

        let eventDetail = this.state.eventDetail;
        if(eventDetail == null)
            eventDetail = {};
        
        let imgAddress = eventDetail.imgAddress != null ? eventDetail.imgAddress : '1.png';
        let style = {
            backgroundImage: 'url("/ui/img/' + imgAddress + '")',
            backgroundSize: 'cover',
            overflow: 'hidden'
          };
                
        let fType = styles.foodServed;
        
        if(eventDetail.foodType == 'BRING_YOUR_OWN')
            fType=styles.bringYourFood;
        else if(eventDetail.foodType == 'NO_FOOD')
            fType=styles.noFood;
        
        let attendeesComponents = null;
        
        if(eventDetail.attendees != undefined) {
            attendeesComponents = eventDetail.attendees.map((attendee,i) => {

                let usrPic = attendee.picture != null ? attendee.picture : '1.png';
                let attendeeStyle = {
                        backgroundImage: 'url("/ui/img/' + usrPic + '")',
                        backgroundSize: 'cover',
                        overflow: 'hidden'
                      };
                return <div className={styles.attendee} style={attendeeStyle} key={'ATT_' + attendee.id}>&nbsp;</div>;
            });
        }
        
        return(
                <div className={styles.detailBackground} 
                        onClick={this.closeEventDetailWindow.bind(this)} >
                
                    <div className={styles.detailContainer} onClick={this.eventContainerClicked.bind(this)}>
                        <div style={style} className={styles.eventImg + ' ' + styles.imgContainer}>&nbsp;</div>
                        
                        <div className={styles.eventDetailContainer}>
                            <div className={styles.eventRating}>
                                <ReactStars count={5} size={24} color2={'#ffd700'} edit={false} half={true} value={eventDetail.rate}/>
                            </div>
                            <div className={styles.eventTitleContainer}>
                                <div className={styles.eventTitle}>{eventDetail.name}</div>
                                <Moment format="YYYY-MM-DD HH:mm" className={styles.eventDate}>
                                    {eventDetail.date}
                                </Moment>
                                <div className={styles.eventAddress}>{eventDetail.address}</div>
                                {/*<div className={styles.signin}>Organiser</div>
                                <div className={styles.eventGroupOrOrganiser}>&nbsp;</div>
                                <div className={styles.eventSponsor}>{eventDetail.sponsorName}&nbsp;</div>*/}
                                <div>
                                    <div className={fType} >&nbsp;</div>
                                </div>
                                <div className={styles.attendeesContainer}>
                                    {attendeesComponents}
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
           )
    }
    
}