Feature: Landing into GreenCart and Search vegitable and select it
@SmokeTest
Scenario: Search for items and validate result
Given User is on Greencart landing page
When User searched for Cucumber vegitable
Then Cucumber result are displayed
And confirm the checkout item is Cucumber

@SanityTest
Scenario: Search for items and validate result
Given User is on Greencart landing page
When User searched for Brocolli vegitable
Then Brocolli result are displayed
And confirm the checkout item is Brocolli

@RegressionTest
Scenario Outline: Search for items and validate result
Given User is on Greencart landing page
When User searched for <veggiName> vegitable
Then <veggiName> result are displayed
And confirm the checkout item is <veggiName>

Examples:
|veggiName|
|Beetroot|
|Carrot|
|Tomato|
