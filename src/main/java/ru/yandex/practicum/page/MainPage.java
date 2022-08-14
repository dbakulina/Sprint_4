package ru.yandex.practicum.page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MainPage {


    public MainPage(WebDriver driver) {
        this.driver = driver;
        driver.get(PAGE_URL);
    }

    WebDriver driver;

    //URL страницы
    public static final String PAGE_URL = "https://qa-scooter.praktikum-services.ru/";
    //Ответы на вопросы 1-8
    public static final String ANSWER_1 = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    public static final String ANSWER_2 = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    public static final String ANSWER_3 = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    public static final String ANSWER_4 = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    public static final String ANSWER_5 = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    public static final String ANSWER_6 = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    public static final String ANSWER_7 = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    public static final String ANSWER_8 = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";


    //Локатор кнопки с вопросом "Сколько это стоит? И как оплатить?"
    public static final By questionButton1 = By.xpath(".//div[@class='accordion']/div[1]/div[@class='accordion__heading']");
    //Локатор кнопки с ответом "Сутки — 400 рублей. Оплата курьеру — наличными или картой."
    public static final By answerArea1 = By.xpath(".//div[@class='accordion']/div[1]/div[@class='accordion__panel']");

    //Локатор кнопки с вопросом "Хочу сразу несколько самокатов! Так можно?"
    public static final By questionButton2 = By.xpath(".//div[@class='accordion']/div[2]/div[@class='accordion__heading']");
    //Локатор кнопки с ответом "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."
    public static final By answerArea2 = By.xpath(".//div[@class='accordion']/div[2]/div[@class='accordion__panel']");

    //Локатор кнопки с вопросом "Как рассчитывается время аренды?"
    public static final By questionButton3 = By.xpath(".//div[@class='accordion']/div[3]/div[@class='accordion__heading']");
    //Локатор кнопки с ответом "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."
    public static final By answerArea3 = By.xpath(".//div[@class='accordion']/div[3]/div[@class='accordion__panel']");

    //Локатор кнопки с вопросом "Можно ли заказать самокат прямо на сегодня?"
    public static final By questionButton4 = By.xpath(".//div[@class='accordion']/div[4]/div[@class='accordion__heading']");
    //Локатор кнопки с ответом "Только начиная с завтрашнего дня. Но скоро станем расторопнее."
    public static final By answerArea4 = By.xpath(".//div[@class='accordion']/div[4]/div[@class='accordion__panel']");

    //Локатор кнопки с вопросом "Можно ли продлить заказ или вернуть самокат раньше?"
    public static final By questionButton5 = By.xpath(".//div[@class='accordion']/div[5]/div[@class='accordion__heading']");
    //Локатор кнопки с ответом "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."
    public static final By answerArea5 = By.xpath(".//div[@class='accordion']/div[5]/div[@class='accordion__panel']");

    //Локатор кнопки с вопросом "Вы привозите зарядку вместе с самокатом?"
    public static final By questionButton6 = By.xpath(".//div[@class='accordion']/div[6]/div[@class='accordion__heading']");
    //Локатор кнопки с ответом "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится."
    public static final By answerArea6 = By.xpath(".//div[@class='accordion']/div[6]/div[@class='accordion__panel']");

    //Локатор кнопки с вопросом "Можно ли отменить заказ?"
    public static final By questionButton7 = By.xpath(".//div[@class='accordion']/div[7]/div[@class='accordion__heading']");
    //Локатор кнопки с ответом "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."
    public static final By answerArea7 = By.xpath(".//div[@class='accordion']/div[7]/div[@class='accordion__panel']");

    //Локатор кнопки с вопросом "Я жизу за МКАДом, привезёте?"
    public static final By questionButton8 = By.xpath(".//div[@class='accordion']/div[8]/div[@class='accordion__heading']");
    //Локатор кнопки с ответом "Да, обязательно. Всем самокатов! И Москве, и Московской области."
    public static final By answerArea8 = By.xpath(".//div[@class='accordion']/div[8]/div[@class='accordion__panel']");


    //Локатор верхней кнопки заказать
    public static final By topOrderButton = By.xpath(".//div[@class='Header_Nav__AGCXC']/button[@class='Button_Button__ra12g']");
    public static final By bottomOrderButton = By.xpath(".//div[@class='Home_FinishButton__1_cWm']/button");



    //Метод, который осуществляет клик по кнопке
    public void clickButton(By area) {
        WebElement element = driver.findElement(area);

        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);

        driver.findElement(area).click();
    }

    //Метод, который возвращает текст ответа
    public String getAnswerText(By answerArea) {

        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.elementToBeClickable(answerArea));
        return driver.findElement(answerArea).getText();
    }

}


