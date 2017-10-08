import React from 'react';
import styles from '../../css/Header.css'

class Header extends React.Component {
   render() {
      return (
         <div className={styles.header}>
            <div className={styles.logo}>Logo</div>
            <div className={styles.otherContent}>
                <div className={styles.signin}>Sign in</div>
                <div className={styles.signup}>Sign up</div>
            </div>
         </div>
      );
   }
}

export default Header;