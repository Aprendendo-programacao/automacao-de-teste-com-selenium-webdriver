# Automação de testes - Introdução ao Selenium Webdriver

### Dependência

* Selenium Java

    ```xml
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>3.141.59</version>
    </dependency>
    ```
  
### Configurações iniciais

* Baixar o WebDriver da sua preferência

  * [Chrome WebDriver](https://chromedriver.chromium.org/downloads) (recomendado)

  * [FireFox WebDriver](https://github.com/mozilla/geckodriver/releases)

* Definir uma variável de ambiente com o caminho até o WebDriver (**APENAS** para Windows)

  ```java
  System.setProperty("webdriver.chrome.driver", "/caminho/para/o/driver/chromedriver.exe")
  ```
  
* Instanciar um objeto de `WebDriver`

  ```java
  WebDriver driver = new ChromeDriver();
  ```
  
* Navegar até um URL

  ```java
  driver.get("https://www.casasbahia.com.br");
  ```
  
  > **IMPORTANTE**: SEMPRE informar o protocolo (`HTTP` / `HTTPS`)

* **Interação com elementos da Web**
  
  > Elementos da Web: qualquer elemento HTML presente na página. Para visualizá-los, basta apertar `F12` (inspecionar) no browser > clicar na aba `Elements`
  
  * **Seletores**
    
    * **Função**: forma de obter um elemento de uma página Web com o Selenium

    * Por id (`ID`)
      
      > é o atributo `ID` de uma tag HTML

      * É a forma mais simples, porém nem todas as páginas o utiliza

      * **Exemplo**

        ```java
        WebElement caixaDeBusca = driver.findElement(By.id("strBusca"));
        ```

    * Por nome (`name`)

      > é o atributo `name` de uma tag HTML
      
      * **Exemplo**

        ```java
        driver.findElement(By.name("strBusca"));
        ```
    
    * Por nome da classe (`className`)
      
      > é o nome da classe de uma tag HTML
      
      * **Exemplo**
  
        ```java
        driver.findElement(By.className("mn-product-name"));
        ```

  * Clicar em um elemento

    ```java
    caixaDeBusca.click();
    ```
  
  * Enviar um texto

    ```java
    caixaDeBusca.sendKeys("Panela");
    ```
    
    > `sendKeys()`: só funciona em tags HTML que aceitam um texto, como por exemplo `<input>`