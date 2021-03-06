Feature: Login into Application

Scenario Outline: Positive test validating login
Given Inintialize the browser with chrome
And Navigate to "http://www.qaclickacademy.com/" Site
And Click on Login link in home page to land on secure sign in page
When User enters <username> and <password> and logs in
Then Verify that user is successfully logged in 
And close browsers

Examples:
|username            |password  |
|test99@gmail.com    |123456    |
|test123@gmail.com   |12345     |