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

Scenario: Verify the User is able to upload a file 
When Mouseover to the Components tab
And Click on monitors and Click on"Apple Cinema 30"
And Enter all the required fields and upload file  in available options
And Click on Add to cart button and the item should be added to the cart
Then If the file is not uploaded then it should throw an error message 

Scenario: Verify if the user is able to check the product availabilty and checkout 
When Enter Iphone in the search option and click on the search button
And Select Iphone and Enter the quantity as two
And Click the Add to Cart button and Select item cart on the right corner
Then Click Checkout Option

Scenario: Verify if the user is able to remove item from the cart
When Mouseover to Laptop & Notebook and select Show all Laptops & Notebooks
And Select HP LP3065 and click on the add to cart button
And Go to Shopping cart tab and click on the Shopping Cart 
And Remove the item from the cart 
Then Click on continue

Scenario: Verify if the user is able to apply coupon code
When Mouseover to Laptop & Notebooks Select Show all Laptops And Notebooks
And Select HP LP3065
And Change the delivery date and quantity
And Click on "Add to cart"
And Click on "Shopping Cart"
Then Enter the Coupon Code and click on the "apply coupon" button


