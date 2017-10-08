import React from 'react';
import Header from './shared/Header.jsx';
import Footer from './shared/Footer.jsx';
import EventsList from './event/EventsList.jsx';

class App extends React.Component {
   render() {
      return (
         <div>
              <Header/>
              <EventsList/>
              {/*<Footer/>*/}
         </div>
      );
   }
}

export default App;