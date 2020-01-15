Feature: Select Summer Dress

Scenario: Add to Cart(Bpdts Test)

Given Website is Open
When Go to Women section
And Navigate to summer dresses
And Sort the items by price(Low to High)
Then Add a random dress to basket
And Ensure that dress is added to cart
And Clear the cart
And Add another dress to cart which is not same as the one which is added before
And Ensure that dress is added to cart


Scenario: Add to Cart

Given Website is Open
When Go to Women section
And Navigate to summer dresses
And Sort the items by price(Low to High)
Then Add a dress "Printed Summer Dress" of price "$30.50" to basket
And Ensure that dress "Printed Summer Dress" of price "$30.50" is added to the cart
And Clear the cart
And Add a dress "Printed Chiffon Dress" of price "$16.40" to basket
And Ensure that dress "Printed Chiffon Dress" of price "$16.40" is added to the cart