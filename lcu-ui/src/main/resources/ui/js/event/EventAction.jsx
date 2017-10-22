import dispatcher from "../dispatcher/Dispatcher.jsx";

export function loadAllEvents(eventEntity) {
    dispatcher.dispatch({
        type: 'LOAD_ALL_EVENTS',
        eventEntity
    });
}

export function addEvent(eventEntity) {
    dispatcher.dispatch({
        type: 'ADD_EVENT',
        eventEntity
    });
}

export function removeEvent(eventId) {
    dispatcher.dispatch({
        type: 'REMOVE_EVENT',
        eventId
    });
}

export function closeEventDetailWindow(obj){
    dispatcher.dispatch({
        type: 'CLOSE_EVENT',
        obj
    });
}

export function eventContainerClicked(obj, ev){
    dispatcher.dispatch({
        type: 'DO_NOTHING',
        obj,
        ev
    });
}