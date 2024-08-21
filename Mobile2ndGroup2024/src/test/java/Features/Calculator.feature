Feature: Calculator

  Scenario Outline: verify that 1 + 1 is equal 2
    Given app is launched
    And The user click one
    And The user click the plus button
    And The user click one
    When The user click equal button
    Then The correct Answer is displayed "<answer>"
    Examples:
      | answer |
      | 2      |

  Scenario Outline: verify that 2 + 1 is equal 3
    Given app is launched
    And The user click one
    And The user click the plus button
    And The user click one
    When The user click equal button
    Then The correct Answer is displayed "<answer>"
    Examples:
      | answer |
      | 3      |

