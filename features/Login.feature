Feature: Login To Testleaf Application

Scenario: Login Possitive
When Launch Chrome Browser
Then Load Url 'http://leaftaps.com/opentaps/control/main'
And Enter as Username 'DemoSalesManager'
And Enter as Password 'crmsfa'
When Click Login Button
Then Verify Home Page 

