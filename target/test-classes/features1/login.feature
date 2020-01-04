Feature: Application Login

Background:
Given Validate browser
When Browser is triggered
Then Browser is opened
@RegTest
Scenario: Home page default Login
Given User is on net banking landing page
When User login into application with "john" and password "1234"
Then Home page is populated
And Cards displayed are "true"

@smokeTest
Scenario: Home page default Login
Given User is on net banking landing page
When User login into application with "Sam" and password "1534"
Then Home page is populated
And Cards displayed are "false"
@smokeTest
Scenario: Home page default Login
Given User is on net banking landing page
When User Sign up with following details
| john | smith | john.smith@gmail.com | 99345 | 
| sujith | kumar | suji118@gmail.com | 1234 |
Then Home page is populated
And Cards displayed are "false"
@sanityTest
Scenario Outline: Home page default Login
Given User is on net banking landing page
When User login to application with <username> and password <password>
Then Home page is populated
And Cards displayed are "true"

Examples:
|username|password|
|user1|pass1|
|user2|pass2|
|user3|pass3|
|user4|pass4|