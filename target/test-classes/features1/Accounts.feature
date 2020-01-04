Feature: Application Login
@sanityTest
Scenario: Home page default Login
Given User is on net banking landing page
When User login into application with "john" and password "1234"
Then Home page is populated
And Cards displayed are "true"
