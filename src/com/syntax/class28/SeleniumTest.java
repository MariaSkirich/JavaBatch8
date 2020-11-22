package com.syntax.class28;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Syntax\\chromedriver.exe");
        WebDriver chromeDriver=new ChromeDriver();
        chromeDriver.get("https://www.amazon.com/Apple-MWP22AM-A-AirPods-Pro/dp/B07ZPC9QD4/ref=sr_1_1?dchild=1&fst=as%3Aoff&pf_rd_i=16225009011&pf_rd_m=ATVPDKIKX0DER&pf_rd_p=82d03e2f-30e3-48bf-a811-d3d2a6628949&pf_rd_r=NQCJH5AV3RRHDSYJR8PB&pf_rd_s=merchandised-search-4&pf_rd_t=101&qid=1486423355&refinements=p_n_shipping_option-bin%3A3242350011&rnid=493964&s=electronics&sr=1-1");
    }
}
