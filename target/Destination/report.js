$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/narah/eclipse-workspace/AutomationTest/src/test/java/Features/BpdtsTest.Feature");
formatter.feature({
  "line": 1,
  "name": "Select Summer Dress",
  "description": "",
  "id": "select-summer-dress",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Add to Cart(Bpdts Test)",
  "description": "",
  "id": "select-summer-dress;add-to-cart(bpdts-test)",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Website is Open",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Go to Women section",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Navigate to summer dresses",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Sort the items by price(Low to High)",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Add a random dress to basket",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Ensure that dress is added to cart",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Clear the cart",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Add another dress to cart which is not same as the one which is added before",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Ensure that dress is added to cart",
  "keyword": "And "
});
formatter.match({
  "location": "AddToCart.website_is_Open()"
});
formatter.result({
  "duration": 27272472201,
  "status": "passed"
});
formatter.match({
  "location": "AddToCart.go_to_Women_section()"
});
formatter.result({
  "duration": 467629700,
  "status": "passed"
});
formatter.match({
  "location": "AddToCart.navigate_to_summer_dresses()"
});
formatter.result({
  "duration": 1150191301,
  "status": "passed"
});
formatter.match({
  "location": "AddToCart.sort_the_items_by_price_Low_to_High()"
});
formatter.result({
  "duration": 2400952000,
  "status": "passed"
});
formatter.match({
  "location": "AddToCart.add_a_random_dress_to_basket()"
});
formatter.result({
  "duration": 1331918099,
  "status": "passed"
});
formatter.match({
  "location": "AddToCart.ensure_that_dress_is_added_to_cart()"
});
formatter.result({
  "duration": 268058500,
  "status": "passed"
});
formatter.match({
  "location": "AddToCart.clear_the_cart()"
});
formatter.result({
  "duration": 432907300,
  "status": "passed"
});
formatter.match({
  "location": "AddToCart.add_another_dress_to_cart_which_is_not_same_as_the_one_which_is_added_before()"
});
formatter.result({
  "duration": 1464975800,
  "status": "passed"
});
formatter.match({
  "location": "AddToCart.ensure_that_dress_is_added_to_cart()"
});
formatter.result({
  "duration": 227527499,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Add to Cart",
  "description": "",
  "id": "select-summer-dress;add-to-cart",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 18,
  "name": "Website is Open",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "Go to Women section",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "Navigate to summer dresses",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Sort the items by price(Low to High)",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Add a dress \"Printed Summer Dress\" of price \"$30.50\" to basket",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Ensure that dress \"Printed Summer Dress\" of price \"$30.50\" is added to the cart",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Clear the cart",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Add a dress \"Printed Chiffon Dress\" of price \"$16.40\" to basket",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "Ensure that dress \"Printed Chiffon Dress\" of price \"$16.40\" is added to the cart",
  "keyword": "And "
});
formatter.match({
  "location": "AddToCart.website_is_Open()"
});
formatter.result({
  "duration": 22670023299,
  "status": "passed"
});
formatter.match({
  "location": "AddToCart.go_to_Women_section()"
});
formatter.result({
  "duration": 161050500,
  "status": "passed"
});
formatter.match({
  "location": "AddToCart.navigate_to_summer_dresses()"
});
formatter.result({
  "duration": 3113792500,
  "status": "passed"
});
formatter.match({
  "location": "AddToCart.sort_the_items_by_price_Low_to_High()"
});
formatter.result({
  "duration": 631072500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Printed Summer Dress",
      "offset": 13
    },
    {
      "val": "$30.50",
      "offset": 45
    }
  ],
  "location": "AddToCart.add_a_dress_of_price_to_basket(String,String)"
});
formatter.result({
  "duration": 1350769600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Printed Summer Dress",
      "offset": 19
    },
    {
      "val": "$30.50",
      "offset": 51
    }
  ],
  "location": "AddToCart.ensure_that_dress_of_price_is_added_to_the_cart(String,String)"
});
formatter.result({
  "duration": 287443199,
  "status": "passed"
});
formatter.match({
  "location": "AddToCart.clear_the_cart()"
});
formatter.result({
  "duration": 706568000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Printed Chiffon Dress",
      "offset": 13
    },
    {
      "val": "$16.40",
      "offset": 46
    }
  ],
  "location": "AddToCart.add_a_dress_of_price_to_basket(String,String)"
});
formatter.result({
  "duration": 2097659401,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Printed Chiffon Dress",
      "offset": 19
    },
    {
      "val": "$16.40",
      "offset": 52
    }
  ],
  "location": "AddToCart.ensure_that_dress_of_price_is_added_to_the_cart(String,String)"
});
formatter.result({
  "duration": 229053600,
  "status": "passed"
});
});