package com.company;
import java.io.File;
        import java.io.FileNotFoundException;
        import java.util.ArrayList;
        import java.util.List;
        import java.util.Scanner;

        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;

public class vkR extends page {


    public vkR(WebDriver driver) {
        super(driver);
    }

    private WebElement leftCol;
    private WebElement login_form;


    public String getPagesReturned() {
        //return leftCol.getText();
        return leftCol.getText();
    }
    public String getPagesReturnedInval() {

        return login_form.getText();
    }
}
