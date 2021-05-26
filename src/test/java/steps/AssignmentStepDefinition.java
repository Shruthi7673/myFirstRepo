package steps;

import base.BasePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Interaction;
import org.openqa.selenium.interactions.SourceType;
import org.openqa.selenium.support.ui.Select;
import pageObjects.ElectronicsPage;
import utils.DriverFactory;


public class AssignmentStepDefinition
{
    String homePageExpectedTitle=DriverFactory.prop.getProperty("homePageExpectedTitle");
    String loginPageExpectedTitle=DriverFactory.prop.getProperty("loginPageExpectedTitle");
    String registerPageExpectedTitle=DriverFactory.prop.getProperty("registerPageExpectedTitle");
    String camaraAndPhotosExpectedTitle=DriverFactory.prop.getProperty("camaraAndPhotosExpectedTitle");
    String cellPhonesExpectedTitle=DriverFactory.prop.getProperty("cellPhonesExpectedTitle");
    String nikonD5500DSLRExpectedTitle=DriverFactory.prop.getProperty("nikonD5500DSLRExpectedTitle");
    String leicaTMirrorlessDigitalExpectedTitle=DriverFactory.prop.getProperty("leicaTMirrorlessDigitalExpectedTitle");
    String htcOneMiniBlueExpectedPageTitle=DriverFactory.prop.getProperty("htcOneMiniBlueExpectedPageTitle");
    String nokiaLumia1020ExpectedPageTitle=DriverFactory.prop.getProperty("nokiaLumia1020ExpectedPageTitle");
    String shoppingCartExpectedTitle=DriverFactory.prop.getProperty("shoppingCartExpectedTitle");
    String checkOutExpectedTitle=DriverFactory.prop.getProperty("checkOutExpectedTitle");
    String productReviewForNokiaLumiaExpTitle=DriverFactory.prop.getProperty("productReviewForNokiaLumiaExpTitle");
    String addYourReview=DriverFactory.prop.getProperty("addYourReview");
    String beTheFirstToReviw=DriverFactory.prop.getProperty("beTheFirstToReviw");
    String selecAddress=DriverFactory.prop.getProperty("selecAddress");
    String addAddressDetails=DriverFactory.prop.getProperty("addAddressDetails");
    String selectByIndexforCountryDropdown=DriverFactory.prop.getProperty("selectByIndexforCountryDropdowns");
    String compareProductExpectedPageTitle=DriverFactory.prop.getProperty("compareProductExpectedPageTitle");
    String nikonD5500DSLREmailFriendExpectedTitle=DriverFactory.prop.getProperty("nikonD5500DSLREmailFriendExpectedTitle");

    //for registration
    @Given("I navigate to the url {string}")
    public void i_navigate_to_the_url(String url) {
        BasePage.driverUtils.navigateToUrl(url);
    }
    @Then("I should be navigated to the url")
    public void i_should_be_navigated_to_the_url() {

        String homePageActualTitle=BasePage.driverUtils.getPageTitle();
        Assertions.assertEquals(homePageExpectedTitle,homePageActualTitle);
          System.out.println(homePageActualTitle);
    }
    @When("I click on register link on the Home page")
    public void i_click_on_register_link_on_the_home_page() {
      BasePage.homepage.clickONRegisterLink();
    }

    @Then("I should be navigated to the register page")
    public void i_should_be_navigated_to_the_register_page() throws InterruptedException {
        String registerPageActualTitle=BasePage.driverUtils.getPageTitle();
        Assertions.assertEquals(registerPageExpectedTitle,registerPageActualTitle);
        System.out.println(registerPageActualTitle);
    }
    @When("I enter all valid mandatory data in the fields")
    public void i_enter_all_valid_mandatory_data_in_the_fields(DataTable dataTable) {
        BasePage.registerPage.enterFirstName(dataTable.cell(1,0));
        BasePage.registerPage.enterLastName(dataTable.cell(1,1));
        BasePage.registerPage.enterEmailId(dataTable.cell(1,2));
        BasePage.registerPage.enterPassword(dataTable.cell(1,3));
        BasePage.registerPage.enterConfirmPassword(dataTable.cell(1,4));
    }
    @When("I click on register button")
    public void i_click_on_register_button() {
       BasePage.registerPage.clickRegisterButton();
    }
    @Then("I should be successfully registered.")
    public void i_should_be_successfully_registered() {
        System.out.println(BasePage.registerPage.getSuccessfulregistrationMessage());
    }

    //for login

    @When("I click on login link from nav bar")
    public void i_click_on_login_link_from_nav_bar() {
       BasePage.homepage.clickONLoginLink();
    }

    @Then("I should be navigated to login page")
    public void i_should_be_navigated_to_login_page() {
       String loginPageActualTitle=BasePage.driverUtils.getPageTitle();
       Assertions.assertEquals(loginPageExpectedTitle,loginPageActualTitle);
       System.out.println(loginPageActualTitle);
    }
    @When("I enter valid email as {string} and valid password as {string}")
    public void i_eneter_valid_email_as_and_valid_password_as(String email, String password) {
       BasePage.loginPage.enterEmailId(email);
       BasePage.loginPage.enterPassword(password);
    }
    @When("I click on login button")
    public void i_click_on_login_button() {
       BasePage.loginPage.clickLoginButton();
    }

    @Then("I should be successfully logged in to the application")
    public void i_should_be_successfully_logged_in_to_the_application() {
        String homePageActualTitle=BasePage.driverUtils.getPageTitle();
        Assertions.assertEquals(homePageExpectedTitle,homePageActualTitle);
        System.out.println(homePageActualTitle);
    }

    //for adding to cart
    @When("I perform mouse hover on electronics link")
    public void iPerformMouseHoverOnElectronicsLink() {
        BasePage.act.moveToElement(BasePage.electronicsPage.electronicsLink).perform();
    }
    @When("I select camara and photos link under Electronics on the home page")
    public void iSelectCamaraAndPhotosLinkUnderElectronicsOnTheHomePage() {
      //  BasePage.driverUtils.waitForWebElementToBeClickable(BasePage.electronicsPage.camaraAndPhotoLink);
          BasePage.electronicsPage.clickOnCamaraAndPhotosLink();
    }

    @Then("I should be navigated to camara and photos page successfully")
    public void i_should_be_navigated_to_camara_and_photos_page_successfully() {
        String camaraAndPhotosActualTitle=BasePage.driverUtils.getPageTitle();
        Assertions.assertEquals(camaraAndPhotosExpectedTitle,camaraAndPhotosActualTitle);
        System.out.println(camaraAndPhotosActualTitle);
    }
    @When("I click on Leica T Mirrorless Digital Camara link")
    public void i_click_on_leica_t_mirrorless_digital_camara_link() {
        BasePage.camaraAndPhotoPage.getLeicaTMirrorlessDigitalCamLink().click();
    }
    @Then("I should be navigated to Leica T Mirrorless Digital camara page successfully")
    public void i_should_be_navigated_to_leica_t_mirrorless_digital_camara_page_successfully() {
        String leicaTMirrorlessDigitalCamActualTitle=BasePage.driverUtils.getPageTitle();
        Assertions.assertEquals(leicaTMirrorlessDigitalExpectedTitle,leicaTMirrorlessDigitalCamActualTitle);
        System.out.println(leicaTMirrorlessDigitalCamActualTitle);
    }
    @Then("I click on Add to cart button for the Leica T Mirrorless Digital camara product.")
    public void i_click_on_add_to_cart_button_for_the_leica_t_mirrorless_digital_camara_product() {
        BasePage.leicaTMirrorlessDigitalCamPage.getLeicaTMirrorlessCamAddToCartButton().click();
    }
    @Then("I should be able to add the product successfully to the shopping cart page.")
    public void i_should_be_able_to_add_the_product_successfully_to_the_shopping_cart_page() {
        BasePage.driverUtils.waitForWebElementToBeClickable(BasePage.leicaTMirrorlessDigitalCamPage.addToCartMessage);
        BasePage.leicaTMirrorlessDigitalCamPage.getAddToCartMessage();
        BasePage.leicaTMirrorlessDigitalCamPage.getAddToShoppingCartMessage();
    }

    //placing order successfully
    @When("I perform mouse hover on electronics link and select cell phones link")
    public void i_perform_mouse_hover_on_electronics_link_and_select_cell_phones_link() {
        Actions act=new Actions(DriverFactory.driver);
        act.moveToElement(BasePage.electronicsPage.electronicsLink).perform();
        BasePage.electronicsPage.clickOnCellPhonesLink();
    }
    @Then("I should be navigated to cell phones  page successfully")
    public void i_should_be_navigated_to_cell_phones_page_successfully() {
        String cellPhonesActualTitle=BasePage.driverUtils.getPageTitle();
        Assertions.assertEquals(cellPhonesExpectedTitle,cellPhonesActualTitle);
        System.out.println(cellPhonesActualTitle);
    }
    @When("I click on htc one mini blue product link")
    public void i_click_on_htc_one_mini_blue_product_link() {
        BasePage.cellPhonesPage.getHtcOneMiniBlueLink().click();
    }

    @Then("I should be navigated to that product page")
    public void i_should_be_navigated_to_that_product_page() {
        String htcOneMiniBlueActualTitle=BasePage.driverUtils.getPageTitle();
        Assertions.assertEquals(htcOneMiniBlueExpectedPageTitle,htcOneMiniBlueActualTitle);
        System.out.println(htcOneMiniBlueActualTitle);
    }
    @When("I click on add to cart button for the htc one mini blue product")
    public void i_click_on_add_to_cart_button_for_the_htc_one_mini_blue_product() {
        BasePage.htcOneMiniBluePage.getHtcOneMiniBlueAddToCartButton().click();
    }
    @Then("I should be successfully adding the product to cart and i should be navigated to shopping cart page")
    public void i_should_be_successfully_adding_the_product_to_cart_and_i_should_be_navigated_to_shopping_cart_page() {
        BasePage.driverUtils.waitForVisibilityOfWebElement(BasePage.htcOneMiniBluePage.addToCartMessage);
        BasePage.htcOneMiniBluePage.getAddToCartMessage();
        BasePage.htcOneMiniBluePage.getAddToShoppingCartMessage();
        BasePage.htcOneMiniBluePage.clickOnShoppingCartMessageText();
        String shoppingCartActualTitle=BasePage.driverUtils.getPageTitle();
        Assertions.assertEquals(shoppingCartExpectedTitle,shoppingCartActualTitle);
        System.out.println(shoppingCartActualTitle);
    }
    @When("I click on terms of service check box and click on check out button")
    public void i_click_on_terms_of_service_check_box_and_click_on_check_out_button() {
       BasePage.shoppingCartPage.getTermsOfServiceCheckbox().click();
       BasePage.shoppingCartPage.getCheckOutButton().click();
    }

    @Then("I should be navigated to the billing address check out page where i can edit the address and click on Continue button")
    public void i_should_be_navigated_to_the_billing_address_check_out_page_where_i_can_edit_the_address_and_click_on_continue_button(DataTable dataTable) {
        String checkOutActualTitle=BasePage.driverUtils.getPageTitle();
        Assertions.assertEquals(checkOutActualTitle,checkOutExpectedTitle);
        System.out.println(checkOutActualTitle);
       if(BasePage.billingAddressPage.getSelectOrWriteAddress().equalsIgnoreCase(selecAddress))
       {
           System.out.println("entering if loop");
           BasePage.billingAddressPage.getContinueButton().click();
       }
       else if(BasePage.billingAddressPage.getSelectOrWriteAddress().equalsIgnoreCase(addAddressDetails))
       {
           System.out.println("entering else if loop");
         //  BasePage.billingAddressPage.getCityTextBox().sendKeys(dataTable.cell(1,0));
         //  BasePage.billingAddressPage.getCityTextBox().sendKeys(dataTable.cell(1,1));
         //  BasePage.billingAddressPage.getCityTextBox().sendKeys(dataTable.cell(1,2));
           Select sel=new Select(BasePage.billingAddressPage.getCountryDropDown());
           sel.selectByIndex(2);
           BasePage.billingAddressPage.getCityTextBox().sendKeys(dataTable.cell(1,3));
           BasePage.billingAddressPage.getAddress1TextBox().sendKeys(dataTable.cell(1,4));
           BasePage.billingAddressPage.getZipOrPostalextBox().sendKeys(dataTable.cell(1,5));
           BasePage.billingAddressPage.getPhoneNumberTextBox().sendKeys(dataTable.cell(1,6));


           BasePage.billingAddressPage.getContinueButton().click();

       }

       // System.out.println(BasePage.billingAddressPage.getAttributeValueOfBillingAddress());

    }

    @Then("I should be navigated to shipping method page and click on continue")
    public void i_should_be_navigated_to_shipping_method_page_and_click_on_continue() {
        String checkOutActualTitle=BasePage.driverUtils.getPageTitle();
        Assertions.assertEquals(checkOutActualTitle,checkOutExpectedTitle);
        System.out.println(checkOutActualTitle);
        BasePage.driverUtils.waitForWebElementToBeClickable(BasePage.shippingMethodPage.getContinueButton());
        BasePage.shippingMethodPage.getContinueButton().click();
    }
    @Then("I should be navigated to payment page and click on continue")
    public void i_should_be_navigated_to_payment_page_and_click_on_continue() {
        String checkOutActualTitle=BasePage.driverUtils.getPageTitle();
        Assertions.assertEquals(checkOutActualTitle,checkOutExpectedTitle);
        System.out.println(checkOutActualTitle);
        BasePage.driverUtils.waitForWebElementToBeClickable(BasePage.paymentMethodPage.getContinueButton());
        BasePage.paymentMethodPage.getContinueButton().click();
    }
    @Then("I should be navigated to payment information page and click on continue")
    public void i_should_be_navigated_to_payment_information_page_and_click_on_continue() {
        BasePage.driverUtils.waitForWebElementToBeClickable(BasePage.paymentInformationPage.getContinueButton());
        String checkOutActualTitle=BasePage.driverUtils.getPageTitle();
        Assertions.assertEquals(checkOutActualTitle,checkOutExpectedTitle);
        System.out.println(checkOutActualTitle);
        BasePage.paymentInformationPage.getContinueButton().click();
    }
    @Then("i should be navigated to confirm order page and click on confirm button")
    public void i_should_be_navigated_to_confirm_order_page_and_click_on_confirm_button() {
        BasePage.driverUtils.waitForWebElementToBeClickable(BasePage.confirmOrderPage.getConfirmorderButton());
        String checkOutActualTitle=BasePage.driverUtils.getPageTitle();
        Assertions.assertEquals(checkOutActualTitle,checkOutExpectedTitle);
        System.out.println(checkOutActualTitle);
        BasePage.confirmOrderPage.getConfirmorderButton().click();
    }
    @Then("I should be successful in placing my order.")
    public void i_should_be_successful_in_placing_my_order() {
        BasePage.driverUtils.waitForVisibilityOfWebElement(BasePage.completeOrderPage.getOrdermessageText());
        System.out.println(BasePage.completeOrderPage.getOrdermessageText().getText());
        System.out.println(BasePage.completeOrderPage.getOrderNumberText().getText());
    }


    //review product successful

    @When("I click on Nokia lumia1020 product link")
    public void i_click_on_nokia_lumia1020_product_link() {
      //  BasePage.driverUtils.waitForWebElementToBeClickable(BasePage.cellPhonesPage.getNokiaLumia1020Link());
          BasePage.cellPhonesPage.getNokiaLumia1020Link().click();
    }

    @Then("I should be navigated to nokia lumia product page")
    public void i_should_be_navigated_to_nokia_lumia_product_page() {
        String nokiaLumia1020ActualTitle=BasePage.driverUtils.getPageTitle();
        Assertions.assertEquals(nokiaLumia1020ExpectedPageTitle,nokiaLumia1020ActualTitle);
        System.out.println(nokiaLumia1020ActualTitle);
    }

    @When("I click on add review to this product link and i should be navigated to product review page where i enter review title {string} and review text {string} and click on submit review")
    public void i_click_on_add_review_to_this_product_link_and_i_should_be_navigated_to_product_review_page_where_i_enter_review_title_and_review_text_and_click_on_submit_review(String title, String text) {
         //BasePage.driverUtils.waitForWebElementToBeClickable(BasePage.nokiaLumia1020Page.getWriteReviewOnNokiaLumiaLink());

        if(BasePage.nokiaLumia1020Page.getTestele().equalsIgnoreCase(beTheFirstToReviw))
        {
            System.out.println("entering if else loop");
            BasePage.nokiaLumia1020Page.getAddReviewOnNokiaLumiaLink().click();
            String productReviewForNokiaLumiaActualTitle=BasePage.driverUtils.getPageTitle();
            Assertions.assertEquals(productReviewForNokiaLumiaExpTitle,productReviewForNokiaLumiaActualTitle);
            System.out.println(productReviewForNokiaLumiaActualTitle);
            BasePage.productReviewPage.getReviewTitleTextBox().sendKeys(title);
            BasePage.productReviewPage.getReviewTextTextBox().sendKeys(text);
            BasePage.productReviewPage.getSubmitButton().click();
        }
        else if(BasePage.nokiaLumia1020Page.getTestele().equalsIgnoreCase(addYourReview))
        {
            System.out.println("entering else if loop");
            BasePage.nokiaLumia1020Page.getWriteReviewOnNokiaLumiaLink().click();
            String productReviewForNokiaLumiaActualTitle=BasePage.driverUtils.getPageTitle();
            Assertions.assertEquals(productReviewForNokiaLumiaExpTitle,productReviewForNokiaLumiaActualTitle);
            System.out.println(productReviewForNokiaLumiaActualTitle);
            BasePage.productReviewPage.getReviewTitleTextBox().sendKeys(title);
            BasePage.productReviewPage.getReviewTextTextBox().sendKeys(text);
            BasePage.productReviewPage.getSubmitButton().click();
        }

    }
    @Then("I should be successful in adding the product under existing reviews")
    public void i_should_be_successful_in_adding_the_product_under_existing_reviews() throws InterruptedException {
        BasePage.driverUtils.waitForVisibilityOfWebElement(BasePage.productReviewPage.getExistingReview());
        System.out.println(BasePage.productReviewPage.getExistingReview().getText());
    }

    //reviw error messages
    @When("I click on add review to this product link")
    public void i_click_on_add_review_to_this_product_link() {
        if(BasePage.nokiaLumia1020Page.getTestele().equalsIgnoreCase(beTheFirstToReviw))
        {
            System.out.println("entering if else loop");
            BasePage.nokiaLumia1020Page.getAddReviewOnNokiaLumiaLink().click();

        }
        else if(BasePage.nokiaLumia1020Page.getTestele().equalsIgnoreCase(addYourReview))
        {
            System.out.println("entering else if loop");
            BasePage.nokiaLumia1020Page.getWriteReviewOnNokiaLumiaLink().click();

        }
        String productReviewForNokiaLumiaActualTitle=BasePage.driverUtils.getPageTitle();
        Assertions.assertEquals(productReviewForNokiaLumiaExpTitle,productReviewForNokiaLumiaActualTitle);
        System.out.println(productReviewForNokiaLumiaActualTitle);
    }

    @When("I click on submit button without entering the mandatory details")
    public void i_click_on_submit_button_without_entering_the_mandatory_details() {
       // BasePage.driverUtils.waitForPresenceOFElementLocatedBy(By.id("AddProductReview_Title"));
        BasePage.productReviewPage.getSubmitButton().click();

    }
    @Then("I should get the error messages.")
    public void i_should_get_the_error_messages() {
        BasePage.driverUtils.waitForVisibilityOfWebElement(BasePage.productReviewPage.getReviewTitleRequiredErrorMessage());
        System.out.println(BasePage.productReviewPage.getReviewTitleRequiredErrorMessage().getText());
        System.out.println(BasePage.productReviewPage.getReviewTextRequiredErrorMessage().getText());
    }

    //successfuly adding product to compare list
    @When("I click on add to compare list link")
    public void i_click_on_add_to_compare_list_link() {
        BasePage.driverUtils.waitForWebElementToBeClickable(BasePage.htcOneMiniBluePage.getHtcOneMiniBlueAddToCompareListButton());
        BasePage.htcOneMiniBluePage.getHtcOneMiniBlueAddToCompareListButton().click();
    }
    @Then("I should be successful in adding the product to compare list")
    public void i_should_be_successful_in_adding_the_product_to_compare_list() {
        BasePage.driverUtils.waitForVisibilityOfWebElement(BasePage.htcOneMiniBluePage.addToCartMessage);
        BasePage.htcOneMiniBluePage.getAddToCartMessage();
        //BasePage.htcOneMiniBluePage.getaddToCompareListMessage();
    }


    //validate message no items in compare list

    @When("I click on the product comparision message link")
    public void i_click_on_the_product_comparision_link() {
       BasePage.htcOneMiniBluePage.clickOnProductComparisionLink();
    }
    @Then("I should be navigated to compare product page")
    public void i_should_be_navigated_to_compare_product_page() {
        String compareProductActualTitle=BasePage.driverUtils.getPageTitle();
        Assertions.assertEquals(compareProductExpectedPageTitle,compareProductActualTitle);
        System.out.println(compareProductActualTitle);
    }
    @When("I click on clear list button")
    public void i_click_on_clear_list_link() {
       // BasePage.driverUtils.waitForWebElementToBeClickable(BasePage.compareProductsPage.getClearListButton());
        BasePage.compareProductsPage.getClearListButton().click();
    }
    @Then("I should be successful in emptying the list")
    public void i_should_be_successful_in_emptying_the_list() {
      // BasePage.driverUtils.waitForVisibilityOfWebElement(BasePage.compareProductsPage.getNoItemsToCompareText());
        System.out.println(BasePage.compareProductsPage.getNoItemsToCompareText().getText());
    }

    //email a friend error message
    @When("I click on NikonD5500DSLR product link")
    public void i_click_on_nikon_d5500dslr_product_link() {
        BasePage.camaraAndPhotoPage.getNikonD5500dslrLink().click();
    }
    @Then("I should be navigated to nikon dslr product page")
    public void i_should_be_navigated_to_nikon_dslr_product_page() {
        String nikonD5500DSLREActualTitle=BasePage.driverUtils.getPageTitle();
        Assertions.assertEquals(nikonD5500DSLRExpectedTitle,nikonD5500DSLREActualTitle);
        System.out.println(nikonD5500DSLREActualTitle);
    }
    @When("I click on email a friend button")
    public void i_click_on_email_a_friend_button() {
       // BasePage.driverUtils.waitForWebElementToBeClickable(BasePage.nikonD5500DSLRPage.nikonEmailAFriendButton);
        BasePage.nikonD5500DSLRPage.clickOnnikonEmailAFriendButton();
    }
    @Then("I should be navigated to email product page")
    public void i_should_be_navigated_to_email_product_page() {
        String nikonD5500DSLREmailFriendActualTitle=BasePage.driverUtils.getPageTitle();
        Assertions.assertEquals(nikonD5500DSLREmailFriendExpectedTitle,nikonD5500DSLREmailFriendActualTitle);
        System.out.println(nikonD5500DSLREmailFriendActualTitle);
    }
    @When("I click on send email button without inputing mandatory fields")
    public void i_click_on_send_email_button_without_inputing_mandatory_fields() {
      //  BasePage.driverUtils.waitForWebElementToBeClickable(BasePage.productEmailAfirendPage.getSendEmailButton());
        BasePage.productEmailAfirendPage.getSendEmailButton().click();

    }

    @Then("I should get the error messages saying Enter friend's email.")
    public void i_should_get_the_error_messages_saying_Enter_friends_email(){
        System.out.println(BasePage.productEmailAfirendPage.getFriendEmailErrorMessage());
    }

    //email a product to a friend
    @When("I enter a valid email {string}")
    public void i_enter_a_valid_email(String em) {
        BasePage.driverUtils.waitForPresenceOFElementLocatedBy(By.id("FriendEmail"));
        BasePage.productEmailAfirendPage.getFriendEmailTextBox().sendKeys(em);
    }
    @When("click on submit button")
    public void click_on_submit_button() {
        BasePage.productEmailAfirendPage.getSendEmailButton().click();
    }

    @Then("I should see the successful message sent text")
    public void i_should_see_the_successful_message_sent_text() {
        System.out.println(BasePage.productEmailAfirendPage.getMessageSentText());
    }

    //successfully adding product to wishlist
    @Then("I click on Add to WishList button for the Leica T Mirrorless Digital camara product.")
    public void i_click_on_add_to_wish_list_button_for_the_leica_t_mirrorless_digital_camara_product() {
        BasePage.driverUtils.waitForWebElementToBeClickable(BasePage.leicaTMirrorlessDigitalCamPage.getLeicaTMirrorlessCamAddToWishListButton());
        BasePage.leicaTMirrorlessDigitalCamPage.getLeicaTMirrorlessCamAddToWishListButton().click();
    }

    @Then("I should be able to add the product successfully to the WishList page.")
    public void i_should_be_able_to_add_the_product_successfully_to_the_wish_list_page() {
        BasePage.driverUtils.waitForVisibilityOfWebElement(BasePage.leicaTMirrorlessDigitalCamPage.getWishListMessageText());
        System.out.println(BasePage.leicaTMirrorlessDigitalCamPage.getWishListMessageText().getText());
    }

}
