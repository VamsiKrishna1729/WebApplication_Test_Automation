Feature: Application Login

Scenario: Home page default login
Given User is on Netbanking landing page
When User login into application with username "vamsi" and password "123vamsi"
Then Home page is populated
And Cards displayed are "true"

Scenario: Home page default login
Given User is on Netbanking landing page
When User login into application with username "revanth" and password "123revanth"
Then Home page is populated
And Cards displayed are "false"