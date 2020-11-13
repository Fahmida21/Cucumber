Feature: login

Scenario: verification 

Given LAUNCH URL 
Then Enter nexttechitc on search page
Then Click on search button 


@Sanity
Scenario Outline: verification 

Given Launch "<url>" 
Then Enter XPS "<productname>" on search field
Then Click search button 
Then verify user in seach page

Examples:
|url|productname|
|https://www.dell.com/en-us?~ck=mn|XPS|