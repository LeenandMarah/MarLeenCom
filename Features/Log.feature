Feature: LogIn feature 


Scenario: login successfully as admin
    Given that user is not logged in
    When username is "leen" 
    And password is "123marah"
    Then  logged in successfully as Admin
    
Scenario: login faild as user due to password
    Given that user is not logged in
    And password is "wrong"
    Then  log in faild
    
    
    
Scenario: login faild as user due to username
    Given that user is not logged in
    When username is "not found"
    Then  log in faild
    
    
  
Scenario: login successfully as owner
    Given that user is not logged in
    When username is "marah" 
    And password is "123leen"
    Then  logged in successfully as owner
    
    
  
Scenario: login successfully as tenants
    Given that user is not logged in
    When username is "fuad" 
    And password is "123f"
    Then  logged in successfully as tenant
    

    

    
    
    
    
    