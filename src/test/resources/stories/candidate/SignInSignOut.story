Narrative:
As a new candidate
I want to be able to sign in and then sign out
So that I can be signed out

Scenario: Existing candidate signs in and then signs out
Given I am on the login page
When I sign in and then sign out
Then I am no longer logged in