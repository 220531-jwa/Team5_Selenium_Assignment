#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Add/Remove Items
	Background: 
		Given The user is on the products page

	  @tag1
	  Scenario: One
	    When an Item is added to the cart and then removed with the Remove button
	    Then the Item is successfully removed and the Add button shows
	
	  @tag2
	  Scenario: Two
	  	When an Item is added to the cart and then removed with the Reset App State button
	    Then the Item is successfully removed but the Remove button still shows
	  
	  @tag3
	  Scenario: Three
	  	When multiple Items are added to the cart and then removed with the Remove button
	    Then the Items are successfully removed and the Add button shows
	  
	  @tag4
	  Scenario: Four
	 		When multiple Items are added to the cart and then removed with the Reset App State button
	    Then the Items are successfully removed but the Remove button still shows
	  
	  @tag5
	  Scenario: Five
	  	When multiple Items are added to the cart and then some Items are removed with the Remove button and some Items are removed with the Reset App State button
	    Then the Items are successfully removed but the Remove button still shows for Items removed with the Reset App State Button
	  
	  @tag6
	  Scenario: Six
	  	When an Item is added to the cart and then removed with the Remove button and then the Reset App State button is clicked and then the item is added again
	    Then the Item is succesfully added back to cart but the Add button is still there
	
	  @tag7
	  Scenario: Seven
	  	When an Item is added to the cart and then removed with the Remove button and then the Reset App State button is clicked and then the item is added and removed again with Remove button
	    Then the Item is succesfully added and removed again
	  
	  @tag8
	  Scenario: Eight
	  	When multiple Items are added to the cart and then removed with the Remove button and then the Reset App State button is clicked and then the items are added again
	    Then the Items are succesfully added back to cart
	  
	  @tag9
	  Scenario: Nine
	  	When multiple Items are added to the cart and then removed with the Remove button and then the Reset App State button is clicked and then the items are added and removed again with Remove button
	    Then the Items are succesfully added and removed
	  
	  @tag10
	  Scenario: Ten
	  	When multiple Items are added to the cart and then removed with the Remove button and then the Reset App State button is clicked and then the items are added and removed again with Reset App State button
	    Then the Items are added and removed from cart but Remove buttons still show
	  
	  @tag11
	  Scenario: Eleven
	  	When an Item is added to the cart and then removed with the Remove button and then the Reset App State button is clicked and then the item is added and removed again with Reset App State button and then added and removed with the Remove button
	    Then the Item is added and removed from cart but Remove button still shows again
	  
	  @tag12
	  Scenario: Twelve
	  	When an Item is added to cart and then removed with the Remove button, then added and removed again with the Remove button
	  	Then the Item is succesfully added and removed both times