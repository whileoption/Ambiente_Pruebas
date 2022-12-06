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
        //Precondicion: Ingresar a un periodico digital
        
        WebDriver driver3 = new ChromeDriver();
        
        String url3 = "https://www.nacion.com/economia/finanzas/cual-entidad-financiera-paga-las-tasas-mas-altas/XRAWRVFASFAI3GCXGPSD3Q2PDY/story/";
        String xpath3 = "//*[@id=\"main-nav\"]/div[1]/div[2]/a";

        driver3.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver3.get(url3);

        try {
            //Ponemos a "Dormir" el programa durante los ms que queremos
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
            //Ponemos a "Dormir" el programa durante los ms que queremos
            Thread.sleep(3 * 1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        driver3.quit();
        //FIN CASO DE PRUEBA 3
        
        
        //INICIO CASO DE PRUEBA 8
        //Mostrar notificaciones
        
        WebDriver driver8 = new ChromeDriver();
        
        String url8 = "https://www.nacion.com/";
        String xpath_Notif = "//*[@id=\"main-nav\"]/div[1]/div[3]/div[2]/div[1]/div/div/div/button";
        String xpath_Enlace = "//*[@id=\"vf-feed__panel_4\"]/div/div/section[2]/ol/li[1]/a/div[2]/div[3]/p[1]";

        driver8.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver8.get(url8);

        try {
            //Ponemos a "Dormir" el programa durante los ms que queremos
            Thread.sleep(15 * 1000);
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            driver8.findElement(By.id("onesignal-slidedown-cancel-button")).click();
        } catch (Exception x) {
            System.out.println(x.getMessage());
        }

        driver8.findElement(By.xpath(xpath_Notif)).click();

        try {
            //Ponemos a "Dormir" el programa durante los ms que queremos
            Thread.sleep(2 * 1000);
        } catch (Exception e) {
            System.out.println(e);
        }

        driver8.findElement(By.xpath(xpath_Enlace)).click();

        try {
            //Ponemos a "Dormir" el programa durante los ms que queremos
            Thread.sleep(3 * 1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        driver8.quit();

        //FIN CASO DE PRUEBA 8
        
        
        //INICIO CASO DE PRUEBA 10
        //Mostrar beneficios
        //Precondicion: Ingresar a la página
        
        WebDriver driver10 = new ChromeDriver();
        
        String url10 = "https://www.nacion.com/";
        String xpath10_Benef = "//*[@id=\"main-nav\"]/div[1]/nav/span[1]/a";
        String xpath10_VerMas = "//*[@id=\"main\"]/div/div[2]/div/div[13]/div[6]/button";
        
        //Ultimas Noticias
        driver10.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver10.get(url10);
        try {
            //Ponemos a "Dormir" el programa durante los ms que queremos
            Thread.sleep(15 * 1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        //Da click al elemento correspondiente
        try {
            driver10.findElement(By.id("onesignal-slidedown-cancel-button")).click();
        } catch (Exception x) {
            System.out.println(x.getMessage());
        }
        
        driver10.findElement(By.xpath(xpath10_Benef)).click();
        
        try {
            //Ponemos a "Dormir" el programa durante los ms que queremos
            Thread.sleep(5 * 1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        
        driver10.findElement(By.xpath(xpath10_VerMas)).click();
        

        try {
            //Ponemos a "Dormir" el programa durante los ms que queremos
            Thread.sleep(3 * 1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        driver10.quit();
        
        
        //FIN CASO DE PRUEBA 10
        
        
        //INICIO CASO DE PRUEBA 13
        //Búsqueda por texto
        //Precondicion: Ingresar a la página
        
        WebDriver driver13 = new ChromeDriver();
        
        String url13 = "https://www.nacion.com/";
        String xpath13_sr = "//*[@id=\"main-nav\"]/div[1]/div[1]/div[2]/div[1]/div/button";
        String xpath13_type = "//*[@id=\"main-nav\"]/div[1]/div[1]/div[2]/div[1]/div/input";
        
        driver13.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver13.get(url13);
        
        try {
            //Ponemos a "Dormir" el programa durante los ms que queremos
            Thread.sleep(15 * 1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        
        //Da click al elemento correspondiente
        try {
            driver13.findElement(By.id("onesignal-slidedown-cancel-button")).click();
        } catch (Exception x) {
            System.out.println(x.getMessage());
        }
        
        driver13.findElement(By.xpath(xpath13_sr)).click();
        driver13.findElement(By.xpath(xpath13_type)).sendKeys("Costa Rica");
        driver13.findElement(By.xpath(xpath13_type)).sendKeys(Keys.ENTER);
        

        try {
            //Ponemos a "Dormir" el programa durante los ms que queremos
            Thread.sleep(3 * 1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        driver13.quit();
        
        //FIN CASO DE PRUEBA 13
    }

}
