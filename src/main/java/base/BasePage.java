package base;

import org.openqa.selenium.interactions.Actions;
import pageObjects.*;
import utils.DriverFactory;
import utils.DriverUtils;

import java.util.Properties;

public class BasePage
{
    public static HomePage homepage;
    public static LoginPage loginPage;
    public static RegisterPage registerPage;

   // public static Assertions assertions;
    public static Actions act;
    public static DriverUtils driverUtils;
    public static ElectronicsPage electronicsPage;
    public static CamaraAndPhotoPage camaraAndPhotoPage;
    public static AppleICamPage appleICamPage;
    public static LeicaTMirrorlessDigitalCamPage leicaTMirrorlessDigitalCamPage;
    public static NikonD5500DSLRPage nikonD5500DSLRPage;
    public static CellPhonesPage cellPhonesPage;
    public static NokiaLumia1020Page nokiaLumia1020Page;
    public static BillingAddressPage billingAddressPage;
    public static ShoppingCartPage shoppingCartPage;
    public static ShippingMethodPage shippingMethodPage;
    public static PaymentMethodPage paymentMethodPage;
    public static PaymentInformationPage paymentInformationPage;
    public static ConfirmOrderPage confirmOrderPage;
    public static CompleteOrderPage completeOrderPage;
    public static HtcOneMiniBluePage htcOneMiniBluePage;
    public static ProductReviewPage productReviewPage;
    public static CompareProductsPage compareProductsPage;
    public static ProductEmailAfirendPage productEmailAfirendPage;

    public static void initPages(){
        homepage=new HomePage(DriverFactory.driver);
        registerPage=new RegisterPage(DriverFactory.driver);
        loginPage=new LoginPage(DriverFactory.driver);
        driverUtils=new DriverUtils();

        act=new Actions(DriverFactory.driver);
        electronicsPage=new ElectronicsPage(DriverFactory.driver);
        camaraAndPhotoPage=new CamaraAndPhotoPage(DriverFactory.driver);
        appleICamPage=new AppleICamPage(DriverFactory.driver);
        leicaTMirrorlessDigitalCamPage=new LeicaTMirrorlessDigitalCamPage(DriverFactory.driver);
        nikonD5500DSLRPage=new NikonD5500DSLRPage(DriverFactory.driver);
        cellPhonesPage=new CellPhonesPage(DriverFactory.driver);
        nokiaLumia1020Page=new NokiaLumia1020Page(DriverFactory.driver);
        billingAddressPage=new BillingAddressPage(DriverFactory.driver);
        shoppingCartPage=new ShoppingCartPage(DriverFactory.driver);
        shippingMethodPage=new ShippingMethodPage(DriverFactory.driver);
        paymentMethodPage=new PaymentMethodPage(DriverFactory.driver);
        paymentInformationPage=new PaymentInformationPage(DriverFactory.driver);
        confirmOrderPage=new ConfirmOrderPage(DriverFactory.driver);
        completeOrderPage=new CompleteOrderPage(DriverFactory.driver);
        htcOneMiniBluePage=new HtcOneMiniBluePage(DriverFactory.driver);
        productReviewPage=new ProductReviewPage(DriverFactory.driver);
        compareProductsPage=new CompareProductsPage(DriverFactory.driver);
        productEmailAfirendPage=new ProductEmailAfirendPage(DriverFactory.driver);

    }
}
