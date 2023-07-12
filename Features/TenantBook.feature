
 Feature: tenant book apartment
  Scenario: tenant book apartment correctly
  Given tenant wants1 "book"
  And apartment id is "2"
  Then booked done
  And bill is showed
  
   Scenario: tenant book apartment failed 
  Given tenant wants1 "book"
  And apartment id is1 "1"
  Then booked falied
 
 