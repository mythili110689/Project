Feature: LeafTaps 
#Background:
#Given Launch the browser
#And Maximize the browser
#And Set timeout
#And Load URL


Scenario Outline: Creating Lead

And Enter Username <userName>
And Enter password <password>
And Click Login
And Click Crmsfa
And Click Leads
And Click Create Lead
And Enter CompanyName <cName>
And Enter FirstName <fName>
And Enter LastName <lName>
When Click CreateLead Button
#Then Verify PageTitle
Examples:
|userName|password|cName|fName|lName|
|DemoSalesManager|crmsfa|TestLeaf|Mythili|M|
|DemoSalesManager|crmsfa|TestLeaf|Kumar|S|


