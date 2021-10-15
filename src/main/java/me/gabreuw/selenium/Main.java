package me.gabreuw.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.util.concurrent.TimeUnit.SECONDS;

public class Main {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, SECONDS);

        driver.get("https://www.casasbahia.com.br");

        WebElement caixaDeBusca = driver.findElement(By.id("strBusca"));
        caixaDeBusca.sendKeys("Panela");

        WebElement botaoBusca = driver.findElement(By.id("btnOK"));
        botaoBusca.click();

        WebElement resultadoPesquisa = driver.findElement(By.className("nm-product-name"));
        String resultado = resultadoPesquisa.getText().toLowerCase();

        if (!(resultado.contains("panela") || resultado.contains("pressão"))) {
            System.out.println("Erro na pesquisa");
        }

        System.out.println(resultado);

    }

}
