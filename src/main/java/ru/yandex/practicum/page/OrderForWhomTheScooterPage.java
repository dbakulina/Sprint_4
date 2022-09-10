package ru.yandex.practicum.page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderForWhomTheScooterPage {
    public OrderForWhomTheScooterPage(WebDriver driver) {
        this.driver = driver;

    }

    WebDriver driver;
    //Локатор для поля ввода "Имя"
    public static final By inputName = By.xpath(".//div[@class='Order_Form__17u6u']/div[1]/input");
    //Локатор для поля ввода "Фамилия"
    public static final By inputSurname = By.xpath(".//div[@class='Order_Form__17u6u']/div[2]/input");
    //Локатор для поля ввода "Адрес"
    public static final By inputAdress = By.xpath(".//div[@class='Order_Form__17u6u']/div[3]/input");
    //Локатор для поля ввода "Станция метро"
    public static final By inputMetro = By.xpath(".//div[@class='select-search__value']/input");
    //Локатор ввода станции метро(Черкизовская)
    public static final By selectStation = By.xpath(".//div[@class='select-search__select']/ul/li[2]");
    //Локатор ввода другой станции метро (Красносельская)

    public static final By selectStation1 = By.xpath(".//div[@class='select-search__select']/ul/li[5]");
    //Локатор для поля ввода "Телефон"
    public static final By inputTelephone = By.xpath(".//div[@class='Order_Form__17u6u']/div[5]/input");


    public static final By buttonFurther = By.xpath(".//div[@class='Order_NextButton__1_rCA']/button");




    //Локатор для поля ввода "Когда привезти самокат?"
    public static final By inputWhen = By.xpath(".//div[@class='Order_MixedDatePicker__3qiay']/div/div/input");

    //Локатор для ввода даты из календаря
    public static final By datepicker = By.xpath(".//div[@class='react-datepicker__day react-datepicker__day--009 react-datepicker__day--selected react-datepicker__day--today']");
    //Локатор для поля ввода "Срок аренды"
    public static final By inputRentalPeriod = By.xpath(".//div[@class='Dropdown-arrow-wrapper']/span");
    //Локатор для ввода количества суток из списка(трое суток)
    public static final By periodPicker3 = By.xpath(".//div[@class='Dropdown-menu']/div[3]");
    //локатор для чекбокса цвет самоката

    //Локатор для ввода количества суток из списка(пятеро суток)
    public static final By periodPicker5 = By.xpath(".//div[@class='Dropdown-menu']/div[5]");


    public static final By inputColour = By.className("Checkbox_Input__14A2w");
    //Локатор для комментария
    public static final By inputComment = By.xpath(".//div[4][@class='Input_InputContainer__3NykH']/input");


    //Локатор для кнопки "Заказать"
    public static final By orderButton = By.xpath(".//button[2][@class='Button_Button__ra12g Button_Middle__1CSJM']");

    //Локатор для кнопки "Да"
    public static final By orderYes = By.xpath(".//div[@class='Order_Modal__YZ-d3']/div/button[2][@class='Button_Button__ra12g Button_Middle__1CSJM']");
    //Локатор для кнопки "посмотреть статус"
    public static final By status = By.xpath(".//div[@class='Order_NextButton__1_rCA']/button");
    //Локатор для кнопки "посмотреть статус"




    //Метод, который осуществляет ввод текста в поле
    public void inputText (By area, String text) {
        WebElement element = driver.findElement(area);

        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);

        driver.findElement(area).sendKeys(text);
    }

    //Метод, который осуществляет клик по кнопке
    public void clickButton(By area) {
        WebElement element = driver.findElement(area);

        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);

        driver.findElement(area).click();
    }

    //Метод, который осуществляет ввод станции метро
    public void inputMetro(By firstArea, By secondArea) {
        WebElement element = driver.findElement(firstArea);

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);

        driver.findElement(firstArea).click();

        WebElement element1 = driver.findElement(secondArea);

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element1);
        driver.findElement(secondArea).click();

    }
    //Метод который проверяет наличие элемента на странице
    public boolean getStatusButtonState() {

        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.elementToBeClickable(status));
        return driver.findElement(status).isDisplayed();
    }
}





