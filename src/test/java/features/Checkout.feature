Feature: Add Items to Cart and proceed to Checkout
@PlaceOrder
Scenario Outline: Add items to the cart and then proceed with checkout
Given User is on GreenKart landing Page
When user searched with shortname <Name> and extracted the actual name of product
And added "3" items to the cart 
Then user proceed to checkout and validated the <Name> items in checkout page
And verify whether user has access to enter the promocode and place order

Examples: 
|Name|
|Tom |