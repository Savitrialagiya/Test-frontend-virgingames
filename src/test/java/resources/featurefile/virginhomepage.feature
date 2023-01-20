Feature:  Virgin games Test
  As a user I would like to check online slots tab is clickable in virgin games website

  Scenario: verify that Online slots tab is clickable
    Given I am on Homepage
    When I accept cookies
    And I click on online slots tab from top tab menu
    Then I verify 'Play Online Slots at Virgin Games' text

    Scenario: verify that Online Bingo tab is clickable
      Given I am on Homepage
      When I accept cookies
      And I click on online Bingo tab from top tab menu
      Then I verify 'What is the best online bingo site?' text


