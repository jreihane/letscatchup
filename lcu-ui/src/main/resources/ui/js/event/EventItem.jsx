import React from 'react';
import styles from '../../css/Event.css';

export default class EventItem extends React.Component {
   //{this.props.organiser.firstName}
        
    render() {
        
       let imgAddress = this.props.imgAddress != null ? this.props.imgAddress : '1.png';
       let style = {
           backgroundImage: 'url("/ui/img/' + imgAddress + '")',
           backgroundSize: 'cover',
           overflow: 'hidden'
         };
       

       let hDate = new Date(this.props.date).toString();
       return (
            <div className={styles.eventGeneral}>
                <div style={style} className={styles.eventImg}>&nbsp;</div>
                
                <div className={styles.eventTitleContainer}>
                    <div className={styles.eventTitle}>{this.props.name}</div>
                    <div className={styles.eventDate}>{hDate}</div>
                </div>
                <div className={styles.otherContent}>
                    {/*<div className={styles.signin}>Organiser</div>*/}
                    <div className={styles.eventGroupOrOrganiser}></div>
                    <div className={styles.eventSponsor}>{this.props.sponsorName}</div>
                </div>
            </div>
      );
   }
}