import React from 'react';
import ReactDOM from 'react-dom';
import EventCommentItem from './EventCommentItem.jsx';
import EventStore from '../EventStore.jsx';
import {Carousel} from 'react-responsive-carousel';
import eventStyles from '../../../css/Event.css';

export default class EventCommentsList extends React.Component {
    
    componentWillMount() {
        
        EventStore.on("changeComments", () => {
            this.setState({
                commentsList: EventStore.getEventComments(),
            })
        });
    }
    
    constructor(props){
        super(props);
        
        this.state = {
            commentsList: [],
        };
    }
    
    render() {
        const { commentsList } = this.state;

        const commentComponents = commentsList.map((commentItem,i) => {
            return <EventCommentItem key={commentItem.id} {...commentItem} />;
        });
        
        return (
            <div className={eventStyles.commentsListContainer}>
                <Carousel showThumbs={false} showArrows={true} showStatus={false} showIndicators={false}>
                    {commentComponents}
                </Carousel>
            </div>
        )
    }
    
}