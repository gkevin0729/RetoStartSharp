# Author: Kevin Gonzalez

Feature: Create a meeting
  As a user, I want to be able to create a meeting in StartSharp

  @scenery
  Scenario Outline: create a new meeting in StartSharp
    Given login page with my credentials
      | user   | password   |
      | <user> | <password> |

    When create a new organization business unit on the page
      | organization |
      | choucair    |

    And Create a new meeting
      | meeting | number |
      | choucair testing   | 548646 |

    Then verify that the meeting was created with the name of choucair testing


    Examples:
      | user  | password |
      | admin | serenity |






