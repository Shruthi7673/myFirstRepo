Feature: Electronics on the Home page

  Background:
    Given I navigate to the url "https://demo.nopcommerce.com"
    Then I should be navigated to the url


    @register
    Scenario: Successfully register to the application
      When I click on register link on the Home page
      Then I should be navigated to the register page
      When I enter all valid mandatory data in the fields
      |first name    |last name      |email                       |password     |confirm password  |
      |test          |testtest       |test1123@gmail.com          |qazwsx       |qazwsx            |
      And I click on register button
      Then I should be successfully registered.

    @login
    Scenario: Login to the application
      When I click on login link from nav bar
      Then I should be navigated to login page
      When I enter valid email as "test1123@gmail.com" and valid password as "qazwsx"
      And I click on login button
      Then I should be successfully logged in to the application

    @addtocart
  Scenario: Add Leica T Mirror less Digital Camara to cart successfully and get the message.
    When I perform mouse hover on electronics link
    When I select camara and photos link under Electronics on the home page
    Then I should be navigated to camara and photos page successfully
    When I click on Leica T Mirrorless Digital Camara link
    Then I should be navigated to Leica T Mirrorless Digital camara page successfully
    And  I click on Add to cart button for the Leica T Mirrorless Digital camara product.
    Then I should be able to add the product successfully to the shopping cart page.


    @placeorder
  Scenario: The product should be placed successfully
    When I click on login link from nav bar
    When I enter valid email as "test1123@gmail.com" and valid password as "qazwsx"
    And  I click on login button
    When I perform mouse hover on electronics link and select cell phones link
    Then I should be navigated to cell phones  page successfully
    When I click on htc one mini blue product link
    Then I should be navigated to that product page
    When I click on add to cart button for the htc one mini blue product
    Then I should be successfully adding the product to cart and i should be navigated to shopping cart page
    When I click on terms of service check box and click on check out button
    Then I should be navigated to the billing address check out page where i can edit the address and click on Continue button
      |first name    |last name   |email               |city        |address1        |zip/postalcode |phone number   |
      |test          |testtest    |test1123@gmail.com  |test        |test address    |12345          |7865423987     |
    Then I should be navigated to shipping method page and click on continue
    Then I should be navigated to payment page and click on continue
    Then I should be navigated to payment information page and click on continue
    Then i should be navigated to confirm order page and click on confirm button
    Then I should be successful in placing my order.

   @review
  Scenario:review product successful
    When I click on login link from nav bar
    When I enter valid email as "test1123@gmail.com" and valid password as "qazwsx"
    And  I click on login button
    When I perform mouse hover on electronics link and select cell phones link
    Then I should be navigated to cell phones  page successfully
    When I click on Nokia lumia1020 product link
    Then I should be navigated to nokia lumia product page
    When I click on add review to this product link and i should be navigated to product review page where i enter review title "test title" and review text "test text" and click on submit review
    Then I should be successful in adding the product under existing reviews

    @reviewError
  Scenario:review product error messages
    When I click on login link from nav bar
    When I enter valid email as "test1123@gmail.com" and valid password as "qazwsx"
    And  I click on login button
    When I perform mouse hover on electronics link and select cell phones link
    Then I should be navigated to cell phones  page successfully
    When I click on Nokia lumia1020 product link
    Then I should be navigated to nokia lumia product page
    When I click on add review to this product link
    And  I click on submit button without entering the mandatory details
    Then I should get the error messages.

  @compareList
  Scenario: successfully adding products to compare list
    When I click on login link from nav bar
    When I enter valid email as "test1123@gmail.com" and valid password as "qazwsx"
    And  I click on login button
    When I perform mouse hover on electronics link and select cell phones link
    Then I should be navigated to cell phones  page successfully
    When I click on htc one mini blue product link
    Then I should be navigated to that product page
    When I click on add to compare list link
    Then I should be successful in adding the product to compare list


  @clearCompareList
  Scenario: successfully clearing products from compare list
    When I click on login link from nav bar
    When I enter valid email as "test1123@gmail.com" and valid password as "qazwsx"
    And  I click on login button
    When I perform mouse hover on electronics link and select cell phones link
    Then I should be navigated to cell phones  page successfully
    When I click on htc one mini blue product link
    Then I should be navigated to that product page
    When I click on add to compare list link
    Then I should be successful in adding the product to compare list
    When I click on the product comparision message link
    Then I should be navigated to compare product page
    When I click on clear list button
    Then I should be successful in emptying the list

  @emailFriendErrorMessage
  Scenario: email a friend error messages
    When I click on login link from nav bar
    When I enter valid email as "test1123@gmail.com" and valid password as "qazwsx"
    And  I click on login button
    When I perform mouse hover on electronics link
    When I select camara and photos link under Electronics on the home page
    Then I should be navigated to camara and photos page successfully
    When I click on NikonD5500DSLR product link
    Then I should be navigated to nikon dslr product page
    When I click on email a friend button
    Then I should be navigated to email product page
    When I click on send email button without inputing mandatory fields
    Then I should get the error messages saying Enter friend's email.


  @emailFriend
  Scenario: email a product to a friend
    When I click on login link from nav bar
    When I enter valid email as "test1123@gmail.com" and valid password as "qazwsx"
    And  I click on login button
    When I perform mouse hover on electronics link
    When I select camara and photos link under Electronics on the home page
    Then I should be navigated to camara and photos page successfully
    When I click on NikonD5500DSLR product link
    Then I should be navigated to nikon dslr product page
    When I click on email a friend button
    Then I should be navigated to email product page
    When I enter a valid email "test1123@gmail.com"
    And click on submit button
    Then I should see the successful message sent text

  @addToWishList
  Scenario: Successfully adding product to WishList
    When I perform mouse hover on electronics link
    When I select camara and photos link under Electronics on the home page
    Then I should be navigated to camara and photos page successfully
    When I click on Leica T Mirrorless Digital Camara link
    Then I should be navigated to Leica T Mirrorless Digital camara page successfully
    And  I click on Add to WishList button for the Leica T Mirrorless Digital camara product.
    Then I should be able to add the product successfully to the WishList page.














