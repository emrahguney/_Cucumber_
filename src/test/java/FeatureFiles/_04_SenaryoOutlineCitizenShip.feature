#Senaryo
  #CitizenShip sayfasina gidiniz
  #Create islemini dogrulayiniz
  #Daha sonra ayni bilgilerle tekrar Create yapilamadigini dogrulayiniz(negatif test)




Feature: Citizenship with scenario Outline

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully
    And Navigate to CitizenShip Page

  Scenario Outline: Create CitizenShip


    When User a CitizenShip name as "<name>" short name as "<short>"
    Then Success message should be displayed

    When User a CitizenShip name as "<name>" short name as "<short>"
    Then Already exist message should be displayed

    When User delete the "<name>"
    Then Success message should be displayed

    Examples:
      |name     | short |
      | iseD3132 | iDD11 |
      | iseD2134  | iDD12 |
      | iseD3143 | iDD31 |
      | iseD3146 | iDD14 |
  #TestNG dataProvide burada Scenario Outline olarak karsimiza cikiyor
    #tum senaryo  ilgili-> Scenario Outline in her bir ornek satiri icin senaryo tumu bir kez calisir.5 satir var ise 5 kez calisir
    # bir adimla ilgili-> parametre ilgili adim calisirken butun parametreleri icine alip oyle calisir.

 #TestNG dataprovideri Cucumberda nasil yapabilirsin
  #Once Scenario kismina Outline ekleyeceksin. Alti kirmizi renkte olcak uzerine gelip
  #Create diyeceksin sonra asagida Examples cikacak
  #kim nereye gitcegini ilk basta yukarda tirnak icindekilere bir isim ver sonra
  #asagida Examples da ilk basa o isimleri yaz sonra alta/altlarina hangi parametre gonderecegini yaz
  #o tek tek o parametreleri kime gondermek istediysen tek tek yollar
