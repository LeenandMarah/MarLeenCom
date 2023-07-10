Feature: ApartmentforAdmin

Scenario: add Apartment
Given admin wants "AddApartment"
And building id is "1"
Then add succesfully

Scenario: change Apartment photo
Given admin wants2 "change Apartment photo"
And aId is "1"
Then changed succesfully

Scenario: change Apartment price
Given admin wants3 "change Apartment price"
And aId is "1"
Then price changed succesfully

Scenario: change Apartment max
Given admin wants4 "change Apartment max"
And aId is "1"
Then max changed succesfully

Scenario: change Apartment student Type
Given admin wants5 "change Apartment student Type"
And aId is "1"
Then student Type changed succesfully




    
 