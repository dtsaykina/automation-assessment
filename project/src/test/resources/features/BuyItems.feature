Feature: BuyItems
  Scenario Outline: Buy items scenario
    Given User is on login page
    When User enters "<username>" and "<password>"
    Then User is redirected to Home Page
    And User adds items to basket
    And User proceeds to Checkout
    And User fills in "First", "Last" and "1000"
    Then User finishes transaction

    Examples: Credentials
      | username | password |
      | standard_user | secret_sauce |
      | locked_out_user | secret_sauce |
      | problem_user | secret_sauce |
      | performance_glitch_user | secret_sauce |