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
        WebDriver driver = new ChromeDriver();

//        //INICIO CASO DE PRUEBA 3
//        //Boton de inicio
//        //Precondicion: Ingresar a un periodico digital
//        String url3 = "https://www.nacion.com/economia/finanzas/cual-entidad-financiera-paga-las-tasas-mas-altas/XRAWRVFASFAI3GCXGPSD3Q2PDY/story/";
//        String xpath3 = "//*[@id=\"main-nav\"]/div[1]/div[2]/a";
//
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        driver.get(url3);
//
//        try {
//            //Ponemos a "Dormir" el programa durante los ms que queremos
//            Thread.sleep(15 * 1000);
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//
//        //Da click al boton de inicio desde periodico digital
//        driver.findElement(By.id("onesignal-slidedown-cancel-button")).click();
//        driver.findElement(By.xpath(xpath3)).click();
//        
//        //FIN CASO DE PRUEBA 3


        //Caso de prueba 4
        //Abrir calendario
        
        
        //INICIO CASO DE PRUEBA 10
        //Mostrar beneficios
        //Precondicion: Ingresar a la página
        String url10 = "https://www.nacion.com/";
        String xpath10_Benef = "//*[@id=\"main-nav\"]/div[1]/nav/span[1]/a";
        String xpath10_VerMas = "//*[@id=\"main\"]/div/div[2]/div/div[13]/div[6]/button";
        
        //Ultimas Noticias
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get(url10);
        try {
            //Ponemos a "Dormir" el programa durante los ms que queremos
            Thread.sleep(15 * 1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        //Da click al elemento correspondiente
        driver.findElement(By.id("onesignal-slidedown-cancel-button")).click();
        driver.findElement(By.xpath(xpath10_Benef)).click();
        
        try {
            //Ponemos a "Dormir" el programa durante los ms que queremos
            Thread.sleep(5 * 1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        
        driver.findElement(By.xpath(xpath10_VerMas)).click();
        
       
        
        //FIN CASO DE PRUEBA 9
        
        
//        //INICIO CASO DE PRUEBA 13
//        //Búsqueda por texto
//        //Precondicion: Ingresar a la página
//        String url13 = "https://www.nacion.com/";
//        String xpath13_sr = "//*[@id=\"main-nav\"]/div[1]/div[1]/div[2]/div[1]/div/button";
//        String xpath13_type = "//*[@id=\"main-nav\"]/div[1]/div[1]/div[2]/div[1]/div/input";
//        
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        driver.get(url11);
//        
//        try {
//            //Ponemos a "Dormir" el programa durante los ms que queremos
//            Thread.sleep(15 * 1000);
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        
//        //Da click al elemento correspondiente
//        driver.findElement(By.id("onesignal-slidedown-cancel-button")).click();
//        driver.findElement(By.xpath(xpath11_sr)).click();
//        driver.findElement(By.xpath(xpath11_type)).sendKeys("Sucesos");
//        driver.findElement(By.xpath(xpath11_type)).sendKeys(Keys.ENTER);
//        
//        //FIN CASO DE PRUEBA 13
    }

}
