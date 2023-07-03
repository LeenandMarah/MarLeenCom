Feature: LogIn feature 


Scenario: login successfully as admin
    Given that user is not logged in
    When username is "leen" which type is admin
    And password is correct "123marah"
    Then  logged in successfully
    
Scenario: login faild as admin due to password
    Given that user is not logged in
    When username is "leen" which type is admin
    And password is false "wrong"
    Then  log in faild
    
    
    
Scenario: login faild as admin due to username
    Given that user is not logged in
    When username is not found which type is admin
    Then  log in faild
    
    
    
Scenario: login successfully as owner
    Given that user is not logged in
    When username is "marah" which type is admin
    And password is correct "123leen"
    Then  logged in successfully
    
Scenario: login faild as owner due to password
    Given that user is not logged in
    When username is "marah" which type is admin
    And password is false "llll"
    Then  logged in faild
    
Scenario: login faild as owner due to username
    Given that user is not logged in
    When username is not found which type is admin
    Then  log in faild
  
Scenario: login successfully as tenants
    Given that user is not logged in
    When username is "fuad" which type is admin
    And password is correct "123f"
    Then  logged in successfully
    
Scenario: login faild as tenants due to password
    Given that user is not logged in
    When username is "fuad" which type is admin
    And password is false "llll"
    Then  logged in faild
    
Scenario: login faild as tentnys due to username
    Given that user is not logged in
    When username is not found which type is admin
    Then  log in faild
    
    
    
    
    
    