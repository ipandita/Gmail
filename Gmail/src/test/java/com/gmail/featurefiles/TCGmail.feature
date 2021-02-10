Feature: Gmail Login


Scenario: Login in Gmail with Correct credentails.
Given Validate user is on gmail home page
Then Enter Username and password
And Click on next button
Then Signoff from account




Scenario: Compose email and send it to another user.
Given Validate user is on gmail home page
Then Enter Username and password
And Click on next button
Then Validate user is on landing page
Then User compose email with to,cc and email text
And Click on send button
Then Signoff from account

