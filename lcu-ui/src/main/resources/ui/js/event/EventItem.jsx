import React from 'react';
import styles from '../../css/Event.css'

export default class EventItem extends React.Component {
   
        
    render() {
       let style = {
           backgroundImage: 'url("/ui/img/1.png")',
           backgroundSize: 'cover',
           overflow: 'hidden'
         };
      return (
         <div className={styles.eventGeneral}>
            <div style={style} className={styles.eventImg}>&nbsp;</div>
            
            <div className={styles.eventTitleContainer}>
                <div className={styles.eventTitle}>Event Name</div>
                <div className={styles.eventDate}>2017-10-03</div>
            </div>
            <div className={styles.otherContent}>
                {/*<div className={styles.signin}>Organiser</div>*/}
                <div className={styles.eventGroupOrOrganiser}>Group Name</div>
                <div className={styles.eventSponsor}>Sponsor Name</div>
            </div>
         </div>
      );
   }
}