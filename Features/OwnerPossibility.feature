Feature: OwnerPossibility

Scenario:  Add photo
Given Owner wants "Add photo"
And AID id is "1"
Then added succesfully

Scenario:  Available services
Given Owner wants2 "Available services"
And AID id is "1"
Then printed succesfully

Scenario: change Apartment price
Given Owner wants3 "change price"
And aId is "1"
Then price is changed succesfully

Scenario: change phone number
Given Owner wants4 "change phone number"
And Owner id is "1"
Then phone number is changed succesfully

