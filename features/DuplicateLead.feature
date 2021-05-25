Feature: Duplicate Lead To Leaftaps Application

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
And Click Duplicate Button
When Click And Enter Mail <mail>
And Click Update Duplicate Lead

Examples:

|firstname|lastname|mail|
|prakash|arulraj|12345@gmail.com|
|preethi|prakash|123456@gmail.com|