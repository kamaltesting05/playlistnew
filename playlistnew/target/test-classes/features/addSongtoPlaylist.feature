Feature: Verify play list

  Scenario: addition of song to the playlist
    Given my play list is empty
    When I add one new song to the play list
    Then my playlist should contain one song


