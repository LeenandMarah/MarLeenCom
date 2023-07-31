Feature: apartInfo

  Scenario: user wants to dinf apartment done
    Given apartId is "1"
    Then foundis done

  Scenario: user wants to dinf apartment faild
    Given apartId iss "9"
    Then found faild

    
    Scenario: user wants to find It's apart faild
    Given apartId was "9"
    Then found will faild
    
     Scenario: user wants to find It's apart done
    Given apartId wass "1"
    Then found willl success
    
    
     Scenario: user wants to find building apartments
     
    Given apartId equal "1"
    And floor is "1"
    Then found is good
    
    
    