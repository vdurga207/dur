Feature: Testhrmlogin
Scenario: login
Given open the browser
Given navigate to the app
When enter username
And enter password
And click on login
Then click on logout
And verify home page


@tag1
Scenario: vtiger
Given url vtiger
And verify title
When enter un
And enter pwd
And click on submit
Then click on logt

And verfy page

@addeemp
Scenario: hrmaddemp
Given login
When add emp
And verify amp
And editemp
And verfy amp
Then clck on logt

@EditEmp
Scenario: hrmEditemp
Given login
When add emp
And verify amp
And editemp
Then clck on logt
@para
Scenario Outline: loginhrm
Given go to url
When enter ur "<username>"
And enter pwdd "<password>"
And sign in
Then logout

Examples:
 |username	|password	|
 |qaplanet1	|lab1	|
 |qaplanet2	|lab2	|
 |qaplanet3	|lab3	|