Feature: buildingInfo

  Scenario: check if building is found done
    Given building id isss "1"
    Then building search done

  Scenario: check if building is found faild
    Given aId iss "9"
    Then building search faild

  Scenario: owner wants to find his buildings in system success
   Given aId was "1"
    Then found done
