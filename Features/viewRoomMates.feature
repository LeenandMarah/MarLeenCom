
Feature: show roomMates for students

Scenario: tenant student wants info about roomMates
Given tenant  booked correctly 
And tenant choosed "y"
Then show his roomMates done


Scenario: tenant student wants info about roomMates succesfully 
Given tenant  booked correctly 
And tenant choosed "y"
Then show his roomMates done

Scenario: tenant student dont want info about roomMates 
Given tenant  booked correctly 
And tenant choosedn "n"
Then dont show


Scenario: tenant student want info about roomMates failed
Given tenant  booked correctlyyy
And apart is not studentType
Then  show failed




