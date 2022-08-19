Feature: Search and place the order for products
@SearchProduct
Scenario Outline: Search experience for product search in homepage and offer page
Given User is on GreenKart landing Page
When user searched with shortname <Name> and extracted the actual name of product
Then user searched for <Name> shortname in offers page to check if the product is exists

Examples: 
|Name|
|Tom |
|Beet|
|bea |