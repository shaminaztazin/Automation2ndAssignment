package com.BrowserSetup;

import com.Base.TestBase;

public class OpenWebsite extends TestBase {

    public static void main(String[] args) {
        firefox_launch();
        openUrl("https://bbc.com");
        firefox_close();

    }
//    public static void openUrl(){
//        driver.get("https://google.com");
  //  }
}
