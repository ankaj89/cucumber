@search
Feature: Google Search

@selenium
Scenario: Search for selenium
Given I am able to access google search page
When I type the keyword as "selenium"
And I choose the first suggestion
And I click on the first result
Then I should have "selenium" as title

@mobile
Scenario: Search for mobile
Given I am able to access google search page
When I type the keyword as "mobile"
And I choose the first suggestion
And I click on the first result
Then I should have "mobile" as title
