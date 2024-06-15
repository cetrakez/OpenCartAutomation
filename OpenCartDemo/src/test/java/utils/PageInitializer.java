package utils;

import pages.LoginPage;
import pages.ProductPage;

public class PageInitializer {
    public static LoginPage loginPage;
    public static ProductPage productPage;


    public static void initializePageObjects() {
        loginPage = new LoginPage();
        productPage = new ProductPage();
    }
}
