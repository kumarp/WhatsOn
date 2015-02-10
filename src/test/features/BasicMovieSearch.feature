@wip
Feature: Basic Movie Search on Streaming Services

  Description:
    - When looking for a movie online, I want to be able to search for sites where it is available using this website.

  Assumptions:
    - Scope is limited to searching by movie title and only the below services

    - Results state whether or not movie matching title is available on:
        - Netflix
        - Amazon
        - Hulu

    - Search on title are 'contains' searches. Any result that includes the search string will be shown.    
    
    - Search is case-insensitive
    
    
  Scenario: A movie I search for is available
    
    Given the following movie titles are available on Hulu:
    | Movie Title                                       |
    | The Lord of the Rings: The Fellowship of the Ring |
    | The Lord of the Rings: The Two Towers             |
    | The Lord of the Rings: The Return of the King     |
    | Babe: Pig in the City                             |
    
    And the following movie titles are available on Netflix:
    | Movie Title                                         |
    | The Lord of the Rings: The Fellowship of the Ring   |
    | The Lord of the Rings: The Return of the King       |
    | The Lord of the Blings: The Return of the Bling     |
    
    And the following movie titles are available on Amazon:
    | Movie Title                                         |
    | The Hobbit: An Unexpected Journey                   |
    | Lord of the Flies                                   |
    | Riverdance: Lord of the Dance                       |

    
    When I search for "Lord of the Rings"
    
    
    Then ...
