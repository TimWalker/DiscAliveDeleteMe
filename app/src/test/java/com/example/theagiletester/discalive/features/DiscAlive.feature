Feature: DiscAlive

  Scenario: Read an NFC RFID Tag
    Given I can read an RFID Tag
    Then I can display the information on it


  Scenario: List an RFID Tag
    Given I my Android phone is in proximity of an NFC RFID
    Then I should see the RFID

