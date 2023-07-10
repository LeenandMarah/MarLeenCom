Feature: Request


Scenario:  Request approved
Given Owner sent request "Send Request"
And Admin Accepted is "true"
Then offer added succesfully

Scenario:   Request rejected
Given Owner sent request "Send Request"
And Admin Accepted1 is "false"
Then offer is rejected
