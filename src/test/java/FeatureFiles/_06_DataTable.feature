Feature: DataTable Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully


  Scenario: Create Country
    And Click on the element in LeftNav
      | setup      |
      | parameters |
      | countries  |

    And Click on the element in Dialog

      | addButton |

    And User sending the keys in Dialog Content
      | nameInput | qwe123456781 |
      | codeInput | a2345622     |


    And Click on the element in Dialog
      | saveButton |

    Then Success message should be displayed

    And User delete item from Dialog Content
      | qwe123456781 |
    Then Success message should be displayed

  @Regression
  Scenario: Create Nationality

    And Click on the element in LeftNav
      | setup         |
      | parameters    |
      | nationalities |

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput | QeC765521 |

    And Click on the element in Dialog
      | saveButton |

    Then Success message should be displayed
    And User delete item from Dialog Content
      | QeC765521 |
    Then Success message should be displayed

  @Regression
  Scenario: Fee Functionality
    And Click on the element in LeftNav
      | setup      |
      | parameters |
      | fees       |
    And Click on the element in Dialog
      | addButton |
    And User sending the keys in Dialog Content
      | nameInput       | eeqqS43 |
      | codeInput       | 267|
      | integrationCode | 678    |
      | PriorityInput   | 76083 |

    And Click on the element in Dialog
      | feeActive |
    And Click on the element in Dialog
      | saveButton |
    Then Success message should be displayed
    And User delete item from Dialog Content
      | eeqqS43 |
    Then Success message should be displayed










    



