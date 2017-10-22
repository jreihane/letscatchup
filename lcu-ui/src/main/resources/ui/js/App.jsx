import React from 'react';
import Header from './shared/Header.jsx';
import Footer from './shared/Footer.jsx';
import EventsList from './event/EventsList.jsx';
import EventDetail from './event/EventDetail.jsx';
import {Route, BrowserRouter, Switch} from 'react-router-dom';

class App extends React.Component {
   render() {
      return (
              <BrowserRouter>
                  <div>
                      <Route path="/" component={Header} ></Route>
                      <Route name="eventsList" component={EventsList} path="/"/>
                      <Route name="eventDetail" component={EventDetail} path="/:eventId" />
                          {/*<Header/>
                          <EventsList/>*/}
                          {/*<Footer/>*/}
                  </div>
              </BrowserRouter>
      );
   }
}

export default App;