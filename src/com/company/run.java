package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class run {


    public static void main(String[] args) throws InterruptedException, FileNotFoundException {
        WebDriver driver = new FirefoxDriver();

        //driver.get("https://vk.com/");
        driver.get("https://www.facebook.com");


        reg bingHome = PageFactory.initElements(driver, reg.class);

        Scanner st = new Scanner(new File("login.txt"));
        String login = new String();
        String pasword = new String();
        login = st.nextLine();
        pasword = st.nextLine();

        vkR data = bingHome.enter(login,pasword);

       // System.out.println(data.getPagesReturned());

        //System.out.println(data.getPagesReturned());
        //System.out.println(data.getPagesReturnedInval());
        driver.close();
    }
}