Feature: Testhrmlogin
Scenario: login
Given open the browser
Given navigate to the app
When enter username
And enter password
And click on login
Then click on logout
And verify home page