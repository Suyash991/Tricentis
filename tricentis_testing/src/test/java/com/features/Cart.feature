Feature: Tricentis Cart Page

Background:
Given User is already on homepage
Scenario: Verification after entering the item in the cart
Given User selected a product
When User is click the add to cart button
Then message displayed "The product has been added to your"
