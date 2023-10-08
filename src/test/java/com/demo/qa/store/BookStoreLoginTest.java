//package com.demo.qa.store;
//
//import com.demo.qa.BaseTest;
//import com.demo.qa.data.Names;
//import com.demo.qa.pages.HomePage;
//import com.demo.qa.pages.SidePanelPage;
//import com.demo.qa.pages.bookstore.BookStoreLoginPage;
//import com.demo.qa.pages.bookstore.BookStoreProfilePage;
//import org.testng.Assert;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//public class BookStoreLoginTest extends BaseTest {
//    @BeforeMethod
//    public void prepare() {
//        new HomePage(driver).getBookStore();
//        new SidePanelPage(driver).selectBookStoreLogin();
//    }
//
//    @Test
//    public void loginPositiveTest() {
//        new BookStoreLoginPage(driver).login(Names.USER_NAME_BOOK_STORE, Names.PASSWORD_BOOK_STORE);
//        new BookStoreProfilePage(driver).verifyLoginUserName(Names.USER_NAME_BOOK_STORE).logOut();
//    }
//
//    @Test
//    public void loginNegativeTest() {
//        new BookStoreLoginPage(driver)
//                .login(Names.USER_NAME_BOOK_STORE, Names.USER_NAME_BOOK_STORE)
//                .invalidUserPasswordDisplayed();
//    }
//
//    @Test
//    public void loginEmptyUserNegativeTest() {
//        new BookStoreLoginPage(driver)
//                .login("", Names.USER_NAME_BOOK_STORE)
//                .isValidateUserNameInput();
//    }
//
//    @Test
//    public void loginEmptyPasswordNegativeTest() {
//        new BookStoreLoginPage(driver)
//                .login(Names.USER_NAME_BOOK_STORE, "")
//                .isValidatePasswordNameInput();
//    }
//
//    @Test
//    public void loginEmptyUserAndPasswordNegativeTest() {
//        new BookStoreLoginPage(driver).login("", "");
//        Assert.assertTrue(new BookStoreLoginPage(driver).isValidateUserNameInput());
//        Assert.assertTrue(new BookStoreLoginPage(driver).isValidatePasswordNameInput());
//    }
//}
//
