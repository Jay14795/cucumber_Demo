Feature: Core prospect - Login page

  Scenario: Validate Successful Submission.
    Given : OpenURL
    When I enter an Email address name: superadmin@coreprospect.com
    And  I enter a Password : Core@123

    And I click on the Login button
    Then I should be presented with a successful contact us submission page.
