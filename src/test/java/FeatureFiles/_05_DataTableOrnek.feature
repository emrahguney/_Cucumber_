Feature: DataTable Ornek

  Scenario: Users List
    When Write username "emrah"
    And Write username and password "emrah" and "1234"
    And Write username as DataTable
      | emrah |
      | erdem |
      | enes  |
      | ali   |
    And Write username and password as DataTable
      | emrah | 1234 |
      | erdem | 2345 |
      | enes  | 3456 |
      | ali   | 6789 |