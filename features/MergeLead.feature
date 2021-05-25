Feature: Merge Lead To Leaftaps Application

Background:
When Launch Chrome Browser
Then Load Url 'http://leaftaps.com/opentaps/control/main'
And Enter as Username 'DemoSalesManager'
And Enter as Password 'crmsfa'
When Click Login Button
And Click crmsfa Link
Then Click Lead Button

Scenario Outline: Fill Mandatory Steps
When Click Merge Lead Button
Then Click And Enter From Lead Icon
And Window Handling to FromLead SubWindow
And Click And Enter Search First Name <firstname>
Then Click From Lead Search Button
And Click First One Match To From Lead
Then To Lead Sub Window Again Comes To Parent Window
Then Click And Enter To Lead Icon
And Window Handling to ToLead SubWindow
And Type And Enter Search To Lead Second Name <secondname>
Then Click Search For To Lead Button
And Click First One Match For To Lead
And Window Handling to ParentWindow
Then Click And Submit Merge Lead Tab
Then Switch To Alert Box
And Close The Browser

Examples:

|firstname|secondname|
|prakash|arulraj|
|prakash|kumar|
