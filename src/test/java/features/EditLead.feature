Feature: LeafTaps Automation
#Background:
#Given Launching browser
#And Maximizing browser
#And Timeout
#And Load the URL
@sanity
Scenario Outline: Editing the Lead

And Enter userName <UserName>
And Enter Password <Password>
And Login
And Click CRMSFA
And Click the Leads
And Click Find Leads
And Enter First Name <firstName>
And Click FindLeads Button 
And Click Id
And Click Edit
And Enter companyName <Cname>
When Click Update
Then Verify Updated Cname <UpdtCname>
Examples:
|UserName|Password|firstName|Cname|UpdtCname|
|DemoSalesManager|crmsfa|Mythili|TestLeaf|Infosys|
|DemoSalesManager|crmsfa|Kumar|TestLeaf|TCS|