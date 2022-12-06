package com.mycompany.ambiente_pruebas;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Karina Madrigal
 */
public class Pruebas {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Usuario\\Documents\\Sistemas\\2022\\Cuatri III\\Calidad Software\\Proyecto\\chromedriver.exe");
        

        //INICIO CASO DE PRUEBA 3
        //Boton de inicio
        
        WebDriver driver3 = new ChromeDriver();
        
        String url3 = "https://www.nacion.com/economia/finanzas/cual-entidad-financiera-paga-las-tasas-mas-altas/XRAWRVFASFAI3GCXGPSD3Q2PDY/story/";
        String xpath3 = "//*[@id=\"main-nav\"]/div[1]/div[2]/a";

        driver3.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver3.get(url3);

        try {
            Thread.sleep(15 * 1000);
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            driver3.findElement(By.id("onesignal-slidedown-cancel-button")).click();
        } catch (Exception x) {
            System.out.println(x.getMessage());
        }
        driver3.findElement(By.xpath(xpath3)).click();
        
        try {
            Thread.sleep(3 * 1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        driver3.quit();
        //FIN CASO DE PRUEBA 3
        
        
        //INICIO CASO DE PRUEBA 6
        //Mostrar notificaciones
        
        WebDriver driver6 = new ChromeDriver();
        
        String url6 = "https://www.nacion.com/";
        String xpath_Notif = "//*[@id=\"main-nav\"]/div[1]/div[3]/div[2]/div[1]/div/div/div/button";
        String xpath_Enlace = "//*[@id=\"vf-feed__panel_4\"]/div/div/section[2]/ol/li[1]/a/div[2]/div[3]/p[1]";

        driver6.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver6.get(url6);

        try {
            Thread.sleep(15 * 1000);
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            driver6.findElement(By.id("onesignal-slidedown-cancel-button")).click();
        } catch (Exception x) {
            System.out.println(x.getMessage());
        }

        driver6.findElement(By.xpath(xpath_Notif)).click();

        try {
            Thread.sleep(2 * 1000);
        } catch (Exception e) {
            System.out.println(e);
        }

        driver6.findElement(By.xpath(xpath_Enlace)).click();

        try {
            Thread.sleep(3 * 1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        driver6.quit();

        //FIN CASO DE PRUEBA 6
        
        
        //INICIO CASO DE PRUEBA 8
        //Mostrar beneficios
        
        WebDriver driver8 = new ChromeDriver();
        
        String url8 = "https://www.nacion.com/";
        String xpath8_Benef = "//*[@id=\"main-nav\"]/div[1]/nav/span[1]/a";
        String xpath8_VerMas = "//*[@id=\"main\"]/div/div[2]/div/div[13]/div[6]/button";
        
        //Ultimas Noticias
        driver8.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver8.get(url8);
        try {
            Thread.sleep(15 * 1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        //Da click al elemento correspondiente
        try {
            driver8.findElement(By.id("onesignal-slidedown-cancel-button")).click();
        } catch (Exception x) {
            System.out.println(x.getMessage());
        }
        
        driver8.findElement(By.xpath(xpath8_Benef)).click();
        
        try {
            Thread.sleep(5 * 1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        
        driver8.findElement(By.xpath(xpath8_VerMas)).click();
        

        try {
            Thread.sleep(3 * 1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        driver8.quit();
        
        
        //FIN CASO DE PRUEBA 8
        
        
        //INICIO CASO DE PRUEBA 11
        //Búsqueda por texto
        
        WebDriver driver11 = new ChromeDriver();
        
        String url11 = "https://www.nacion.com/";
        String xpath11_sr = "//*[@id=\"main-nav\"]/div[1]/div[1]/div[2]/div[1]/div/button";
        String xpath11_type = "//*[@id=\"main-nav\"]/div[1]/div[1]/div[2]/div[1]/div/input";
        
        driver11.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver11.get(url11);
        
        try {
            Thread.sleep(15 * 1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        
        //Da click al elemento correspondiente
        try {
            driver11.findElement(By.id("onesignal-slidedown-cancel-button")).click();
        } catch (Exception x) {
            System.out.println(x.getMessage());
        }
        
        driver11.findElement(By.xpath(xpath11_sr)).click();
        driver11.findElement(By.xpath(xpath11_type)).sendKeys("Costa Rica");
        driver11.findElement(By.xpath(xpath11_type)).sendKeys(Keys.ENTER);
        

        try {
            Thread.sleep(3 * 1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        driver11.quit();
        
        //FIN CASO DE PRUEBA 11
    }

}
