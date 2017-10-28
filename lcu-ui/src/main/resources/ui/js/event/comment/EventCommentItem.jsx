import React from 'react';
import styles from '../../../css/Event.css';

export default class EventCommentItem extends React.Component {
    
    render() {
        const imgAddress = "/ui/img/" + this.props.user.picture;
        
        return (
            <div className={styles.commentsContainer} >
                <img src={imgAddress}className={styles.commentsAuthor} />
                <div className={styles.commentText}>{this.props.content}</div>
            </div>
        )
    }
    
}