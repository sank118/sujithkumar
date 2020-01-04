$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("pickMyVeggi.feature");
formatter.feature({
  "line": 1,
  "name": "Landing into GreenCart and Search vegitable and select it",
  "description": "",
  "id": "landing-into-greencart-and-search-vegitable-and-select-it",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4919516,
  "status": "passed"
});
formatter.before({
  "duration": 292270,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Search for items and validate result",
  "description": "",
  "id": "landing-into-greencart-and-search-vegitable-and-select-it;search-for-items-and-validate-result",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "User is on Greencart landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User searched for Cucumber vegitable",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Cucumber result are displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "confirm the checkout item is Cucumber",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepDefinitions.user_is_on_greencart_landing_page()"
});
formatter.result({
  "duration": 37632460597,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cucumber",
      "offset": 18
    }
  ],
  "location": "MyStepDefinitions.user_searched_for_something_vegitable(String)"
});
formatter.result({
  "duration": 9876446293,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cucumber",
      "offset": 0
    }
  ],
  "location": "MyStepDefinitions.something_result_are_displayed(String)"
});
formatter.result({
  "duration": 6371733374,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cucumber",
      "offset": 29
    }
  ],
  "location": "MyStepDefinitions.confirm_the_checkout_item_is_something(String)"
});
formatter.result({
  "duration": 8622256561,
  "status": "passed"
});
formatter.after({
  "duration": 2793972444,
  "status": "passed"
});
});