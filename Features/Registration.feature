Feature: Register of feature
  Scenario Outline: Register of scenario
 
    Given user launch correct url
    When user enter username and password from sheetname"<SheetName>" and rownumber <RowNumber>
    And user click on login button
   
    Examples:
      |SheetName|RowNumber|
      |data|0|
      |data|1|






