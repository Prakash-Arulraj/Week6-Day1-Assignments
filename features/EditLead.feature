Feature: Edit Lead To Leaftaps Application

Background:
When Launch Chrome Browser
Then Load Url 'http://leaftaps.com/opentaps/control/main'
And Enter as Username 'DemoSalesManager'
And Enter as Password 'crmsfa'
When Click Login Button
And Click crmsfa Link
Then Click Lead Button

Scenario Outline: Fill Mandatory Steps
When Click Find Leads Button
And Click And Type First Name Button <firstname>
And Click And Type Last Name Button <lastname>
And Click Submit Find Leads Button
Then Click On First Match
And Click Edit Button
Then Update Industry Button
And Click Update Button

Examples:

|firstname|lastname|
|prakash|arulraj|
|preethi|prakash|