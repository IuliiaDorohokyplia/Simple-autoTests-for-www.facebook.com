package com.company;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class reg extends page {

    public reg(WebDriver driver) {
        super(driver);
    }

    private WebElement email; //Search box
    private WebElement pass; //Search button
    private WebElement u_0_l;

    private WebElement leftCol;
    private WebElement login_form;

    public vkR enter(String name, String family) throws InterruptedException {

        email.clear();
        email.sendKeys(name);
        pass.clear();
        pass.sendKeys(family);
        u_0_l.click();
        WebDriverWait wait = new WebDriverWait(_driver, 15);
        WebElement next = null;
        try {
            next = _driver.findElement(By.id("leftCol"));
        }catch (Exception e) {}

        if (next != null){
            wait.until(ExpectedConditions.elementToBeClickable(By.id("leftCol")));
            System.out.println("reg ok"+leftCol.getText());

        }else {
            wait.until(ExpectedConditions.elementToBeClickable(By.id("login_form")));
            System.out.println("error pass"+login_form.getText());
        }

        return PageFactory.initElements(_driver, vkR.class);
    }
}

