package com.mycompany.ambiente_pruebas;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Karina Madrigal
 */
public class Pruebas {
    
    public static void main(String[] args){
        String url = "https://www.nacion.com/gnfactory/especiales/2020/landing/index.html?utm_source=home&utm_medium=button&utm_campaign=suscribase_footer_ln";
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Usuario\\Documents\\Sistemas\\2022\\Cuatri III\\Calidad Software\\Proyecto\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get(url);
        
        driver.findElement(By.id("name")).sendKeys("Nombre");
        driver.findElement(By.id("idCard")).sendKeys("123456789");
//        driver.findElement(By.xpath("//*[@id=\'contact-subs-form\']/div[3]/div")).click();
//        driver.findElement(By.xpath("/html/body/div[4]/div[1]/section[4]/div/form/div[3]/div/div[3]/div/ul/li[3]")).click();
        driver.findElement(By.id("email")).sendKeys("prueba@prueba.com");
        driver.findElement(By.id("phone")).sendKeys("11112222");
        driver.findElement(By.xpath("//*[@id=\'contact-subs-form\']/div[6]/label/span[1]")).click();
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/section[4]/div/form/div[6]/label/span[1]")).click();
        
        
    }

}
