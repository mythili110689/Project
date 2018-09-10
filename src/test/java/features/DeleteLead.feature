Feature: Leaftaps 

#Background:
#Given Launching browser
#And Maximizing browser
#And Timeout
#And Load the URL

Scenario Outline: Deleting the Lead

And Enter userName <uName>
And Enter Password <password>
And Login
And Click CRMSFA
And Click the Leads
And Click Find Leads
And Enter First Name <firstName>
And Click FindLeads Button 
And Click Id
And Click Delete
And Click Find Leads  
And Enter Id
When Click FindLeads Button 
Then verify the message

Examples:
|uName|password|firstName|
|DemoSalesManager|crmsfa|Mythili|