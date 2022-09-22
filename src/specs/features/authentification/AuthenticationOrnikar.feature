Feature: Authentication-ornikar
  En tant que utilisateur je souhaite m'authentifier au site ornikar

  @OrtikarConnection
  Scenario: Connection sur site ornikar
    Given je me connecte sur l'application ornikar
    When je click sur le bouton connection 
    And je saisie username1 "khawlabenalayaa24@gmail.com"
    And je saisie le mot de passe1 "123456789Aa@"
    And je click sur le bouton connecte
    Then je verifie l'authentification

 