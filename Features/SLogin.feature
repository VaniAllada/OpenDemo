Feature: Varifying the Login page of opencart
Background:
Given open chrome browser and entering opencart url
When user is selecting the myaccount and click on login
And entering the emailid
|dasarikanakad@hcl.com|
And user entering the password
|vani@123|
And click on the login button



Scenario: Varifying the title after successfull login
Then varify the title after login

Scenario: Validating User able to adding item to the cart
When mouse over the desktop and click the mac from dropdown
Then scrolldown and add cart to the item

Scenario: Varify user able to place an order
When mouse over on laptops and notebooks and click on show all laptops and notepads
And select HP3065 
And scrolldown the page and change the deliverydate to future date
And scrolldown the page and click on add to cart button
When Click on the Items basket on the top right corner and Click on the check out button
And Click on the Guest checkout button in the checkout page
And Enter all the mandatory fields in the billing details and click on continue button
And Add some comments in Delivery Methods field and continue
And Click on Term and Conditions checkbox and continue
Then Click on Confirm Order

Scenario: Verify the user is able to edit the existing login account
When Select the Edit Account from the right side corner
And update the Last Name and Click continue
And Log the success msg
And Scroll down and click on logout button
Then Click continue to return to homepage.


