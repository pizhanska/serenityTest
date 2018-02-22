Reduce and increase quantity of already added items in shopping cart
Narrative:
In order to edit quantity of items in shopping car
As a buyer
I want to be able to add one more already added item to the shopping cart, remove one already added item

Scenario: Should manipulate items in shopping cart
Given I have opened home page
And I add three items to shopping cart, two are similar
And I go to the shopping cart
When I choose in dropdown Action item Reduce by one for The Code Da Vinci book
And I choose in dropdown Action item Add for 1984 book
Then The Da Vinci Code in shopping cart quantity should be equal '1'
And 1984 quantity in shopping cart should be equal '2'
