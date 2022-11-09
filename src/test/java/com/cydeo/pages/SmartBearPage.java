package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartBearPage {

    public SmartBearPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "ctl00$MainContent$username")
    public WebElement login;

    @FindBy(name = "ctl00$MainContent$password")
    public WebElement password;

    @FindBy(id = "ctl00_MainContent_login_button")
    public WebElement loginBtn;

    @FindBy(xpath = "//a[@href='Process.aspx']")
    public WebElement orderBtn;

    @FindBy(name = "ctl00$MainContent$fmwOrder$ddlProduct")
    public WebElement productSelect;

    @FindBy(xpath = "//option[@value='FamilyAlbum']")
    public WebElement familyAlbum;

    @FindBy(name = "ctl00$MainContent$fmwOrder$txtQuantity")
    public WebElement txtQuantity;

    @FindBy(name = "ctl00$MainContent$fmwOrder$txtName")
    public WebElement txtName;

    @FindBy(name = "ctl00$MainContent$fmwOrder$TextBox2")
    public WebElement street;

    @FindBy(name = "ctl00$MainContent$fmwOrder$TextBox3")
    public WebElement city;

    @FindBy(name = "ctl00$MainContent$fmwOrder$TextBox4")
    public WebElement state;

    @FindBy(name = "ctl00$MainContent$fmwOrder$TextBox5")
    public WebElement zipCode;

    @FindBy(xpath = "//*[@id='ctl00_MainContent_fmwOrder_cardList_0']")
    public WebElement cardType;

    @FindBy(name = "ctl00$MainContent$fmwOrder$TextBox6")
    public WebElement cardNum;

    @FindBy(name = "ctl00$MainContent$fmwOrder$TextBox1")
    public WebElement expireDate;

    @FindBy(id = "ctl00_MainContent_fmwOrder_InsertButton")
    public WebElement processBtn;

    @FindBy(xpath = "//a[@href='Default.aspx']")
    public WebElement allOrders;

    @FindBy(xpath = "//*[@id='ctl00_MainContent_orderGrid']/tbody/tr[2]/td[2]")
    public WebElement JohnWick;



}
