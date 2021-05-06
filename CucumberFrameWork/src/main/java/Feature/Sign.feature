Feature: Sign-in
  I want to verify the sign in functionality with different scenarios

  @Adhoc
  Scenario Outline: Verify the sign-in function
    When hover mouse pointer to signin
    And clicks on sign-in button
    Then user will see sign-in page
    When I enters userid "<username>"
    And clicks on continue button
    

    Examples: 
      | username       | 
      | John@gmail.com | 
