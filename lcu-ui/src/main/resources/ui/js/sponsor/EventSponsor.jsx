import React from 'react';
export default class EventSponsor extends React.Component {
    
    render() {

        let imgAddress = this.props.logo != null ? this.props.logo : '1.png';
        let style = {
            backgroundImage: 'url("/ui/img/' + imgAddress + '")',
            backgroundSize: 'contain',
            backgroundRepeat: 'no-repeat',
            overflow: 'hidden',
            width: 'inherit',
            height: '80px',
            position: 'absolute',
            top: '20px'
          };
             
        return(
                <div style={style}>
                    &nbsp;
                </div>
           )
    }
    
}