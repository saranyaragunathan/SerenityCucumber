Feature: User Account creation in IMBD website

Scenario Outline: User Account creation in IMBD website    
    Given Navigate to IMDB and click Signin button
    When user is on sign in page click Create account button
    When user is on create account page, enter <name>,<email>,<password>,<reenterpassword>
    And click create account
    Then I verify the captcha screen

    Examples: 
      | name  | email | password  |reenterpassword
      | name | test@gmail.com | success |success |
     | nameone | test1@gmail.com | success |success |
