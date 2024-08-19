#Here we create the steps for testing which will be executed 1st,
# Once executed it outputs a code which is copied and pasted to the StepsDefination.java class
#So the execution of the below scenarios will then link this feature file and the StepDef class

Feature: ApI Demos
  Scenario: Verify that API demos heading is displayed
    Given App is launched
    And I verify that APi demos heading is displayed

#  Scenario: Click App
#    Given I am on the API Demos Main Menu page
#    And I click the App element