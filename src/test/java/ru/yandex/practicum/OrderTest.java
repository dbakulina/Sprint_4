package ru.yandex.practicum;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.yandex.practicum.page.MainPage;
import ru.yandex.practicum.page.OrderForWhomTheScooterPage;

import static org.junit.Assert.assertTrue;

public class OrderTest {


    WebDriver driver;



    @Before
    public void setup() {
        //Firefox

        //WebDriverManager.firefoxdriver().setup();
        //driver = new FirefoxDriver();

        //Chrome

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }


    @After
    public void tearDown(){

        driver.quit();
    }


    //Заказ через верхнюю кнопку
    //Первый набор данных
    @Test
    public void topOrderButtonTest() {
        MainPage mainPage = new MainPage(driver);
        mainPage.clickButton(MainPage.topOrderButton);

        OrderForWhomTheScooterPage orderForWhomTheScooterPage = new OrderForWhomTheScooterPage(driver);


        orderForWhomTheScooterPage.inputText(OrderForWhomTheScooterPage.inputName, "Иван");
        orderForWhomTheScooterPage.inputText(OrderForWhomTheScooterPage.inputSurname, "Иванов");
        orderForWhomTheScooterPage.inputText(OrderForWhomTheScooterPage.inputAdress, "Улица");
        orderForWhomTheScooterPage.inputMetro(OrderForWhomTheScooterPage.inputMetro, OrderForWhomTheScooterPage.selectStation );
        orderForWhomTheScooterPage.inputText(OrderForWhomTheScooterPage.inputTelephone, "89262222222");
        orderForWhomTheScooterPage.clickButton(OrderForWhomTheScooterPage.buttonFurther);


        /*Не понятно, здесь нужна новая страница или нет, с одной стороны окно новое,
        с другой стороны одна форма заказа, зачем ее на разные классы разбивать?*/
        orderForWhomTheScooterPage.inputText(OrderForWhomTheScooterPage.inputWhen, "11.08.22");
        orderForWhomTheScooterPage.clickButton(OrderForWhomTheScooterPage.inputRentalPeriod);
        orderForWhomTheScooterPage.clickButton(OrderForWhomTheScooterPage.periodPicker3);

        orderForWhomTheScooterPage.clickButton(OrderForWhomTheScooterPage.inputColour);
        orderForWhomTheScooterPage.inputText(OrderForWhomTheScooterPage.inputComment, "Эта информация - золото. Обливаю этим капусту в августе, кочан крепкий как сталь и без вредителей.");
        orderForWhomTheScooterPage.clickButton(OrderForWhomTheScooterPage.orderButton);

        orderForWhomTheScooterPage.clickButton(OrderForWhomTheScooterPage.orderYes);

        boolean res = orderForWhomTheScooterPage.getStatusButtonState();

        assertTrue(res);

    }


    //Заказ через нижнюю кнопку
    //Второй набор данных
    @Test
    public void bottomOrderButtonTest() {
        MainPage mainPage = new MainPage(driver);
        mainPage.clickButton(MainPage.bottomOrderButton);

        OrderForWhomTheScooterPage orderForWhomTheScooterPage = new OrderForWhomTheScooterPage(driver);


        orderForWhomTheScooterPage.inputText(OrderForWhomTheScooterPage.inputName, "Анна Мария Яна");
        orderForWhomTheScooterPage.inputText(OrderForWhomTheScooterPage.inputSurname, "Заподмышкина");
        orderForWhomTheScooterPage.inputText(OrderForWhomTheScooterPage.inputAdress, "Улицаулицаулицацлица1986года");
        orderForWhomTheScooterPage.inputMetro(OrderForWhomTheScooterPage.inputMetro, OrderForWhomTheScooterPage.selectStation1 );
        orderForWhomTheScooterPage.inputText(OrderForWhomTheScooterPage.inputTelephone, "00000000000");
        orderForWhomTheScooterPage.clickButton(OrderForWhomTheScooterPage.buttonFurther);


        /*Не понятно, здесь нужна новая страница или нет, с одной стороны окно новое,
        с другой стороны одна форма заказа, зачем ее на разные классы разбивать?*/
        orderForWhomTheScooterPage.inputText(OrderForWhomTheScooterPage.inputWhen, "11.09.22");
        orderForWhomTheScooterPage.clickButton(OrderForWhomTheScooterPage.inputRentalPeriod);
        orderForWhomTheScooterPage.clickButton(OrderForWhomTheScooterPage.periodPicker5);
        //Эти поля не обязательны к заполнению
        //orderForWhomTheScooterPage.clickButton(OrderForWhomTheScooterPage.inputColour);
        //orderForWhomTheScooterPage.inputText(OrderForWhomTheScooterPage.inputComment, "Эта информация - золото. Обливаю этим капусту в августе, кочан крепкий как сталь и без вредителей.");
        orderForWhomTheScooterPage.clickButton(OrderForWhomTheScooterPage.orderButton);

        orderForWhomTheScooterPage.clickButton(OrderForWhomTheScooterPage.orderYes);

        boolean res = orderForWhomTheScooterPage.getStatusButtonState();

        assertTrue(res);

    }
}
