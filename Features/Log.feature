 Feature: Admin login
 		Description: when admin wants to enter the system
 		Actor:Leen
 		
 Scenario: Admin can login
 Given Adminstator is not logged in yet
 And password="123"
 And username="leen"

 Then login succeeds
 