Add items to the shopping cart
Narrative:
In order to buy multiple items at the same time
As a buyer
I want to be able to add multiple items to the shopping cart, delete or add more items or clean up cart

Scenario: Should add item into shopping cart
Given I have opened home page
When I click on Add to Shopping Cart for '1984' book
And I click on Add to Shopping Cart butoon for 'The Code Da Vinci' book
Then Chosen items should appear in cart
