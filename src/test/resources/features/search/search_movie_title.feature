Feature:  Select Game of Thrones from Top rated Shows
  
  Scenario: Navigate to Toprated shows and search Game of Thrones
    Given Navigate to IMDB and click menu title
    When user is on menu page, click TV Shows Category and check Top rated shows option
    When user is on Top rated shows page
    And Enter Game of Thrones in Search box
    And user select Game of Thrones last watch from the list
    Then Last Watch page should be retrieved
    
