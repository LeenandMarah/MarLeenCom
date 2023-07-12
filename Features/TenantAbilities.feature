Feature: view housing


Scenario: view avilable apartments corectly
Given tentant choose "view" 
Then view done


Scenario: view info for an apartment correctly 
Given tenant wants "show info"
And   gives apartmentID is "1"
Then view correctly

Scenario: view info for an apartment failed
Given tenant wants "show info"
And   gives apartmentID is0 "0"
Then view faild