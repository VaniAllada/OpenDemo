Feature: Register of feature
  Scenario Outline: Register of scenario
 
    Given user launch correct url
    When user enter username and password from sheetname"<SheetName>" and rownumber <RowNumber>
    And user click on login button
   
    Examples:
      |SheetName|RowNumber|
      |data|0|
      |data|1|


#Feature: This is to varify register the account in opencart page 
#
#Background: 
#Given open chrome browser and entering opencart url
#
#Scenario: Validating the register page with correct credentials
#Given open chrome browser and entering opencart url
#When entering the firstname "durga" and last name "allada"
#And enter the email "dasarikanakad@hcl.com"
#And enter the telephone number "9384632662"
#And enter the password "vani@123" and confirm password "vani@123"
#Then click the privacy checkbox and click on continue
#
#
#Scenario: Varify the user not able to create an account if any required fields missed
#Given open chrome browser and entering opencart url
#When entering the firstname and last name 
#|durga|allada|
#And enter the email 
#|dasarikanakad@hcl.com|
#And enter the password and confirm password
#|vani@123|vani@123|
#Then click the checkbox and click on continue 




