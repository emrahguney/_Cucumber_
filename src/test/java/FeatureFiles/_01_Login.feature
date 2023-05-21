#FeatureFiles->Senaryolari yazdigimiz bolum(package)

#Senaryo
  #siteye git-> test case ->adim
  #login bilgilerini gir
  #siteye girdigini dogrula

  #Feature-> senaryoda ilk bunu yazariz.Feature burda bu sayfanin  basligi test case in basligi gibi
Feature: Login Functionality

  @SmokeTest
  Scenario: Login with valid username and password
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully

     #Given, When, Then,And,* ... bunlar nerden geliyor nedir bunlar ->
    #kodlari featuredan calistircaz

  #Given: set up the input for the action under test (test data) . Setup: Hazırlık bölümü, başlangıç ayar kısmı
  #When: execute the action you want to test. Action: linki, uygun yöntem ile çağırma
  #Then: check the output with assertions. Test : Sonucu test etme kısmı(Assertion)