package ru.yandex.practicum;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.yandex.practicum.page.MainPage;

import static org.junit.Assert.assertEquals;

public class QuestionTest {

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
    @Test
    public void testQuestionAnswer1() {


        MainPage mainPage = new MainPage(driver);
        mainPage.clickButton(MainPage.questionButton1);
        String actual = mainPage.getAnswerText(MainPage.answerArea1);
        assertEquals(MainPage.ANSWER_1, actual);
        System.out.println("Вопрос 1: тест пройден");
    }

    @Test
    public void testQuestionAnswer2() {
        MainPage mainPage = new MainPage(driver);
        mainPage.clickButton(MainPage.questionButton2);
        String actual = mainPage.getAnswerText(MainPage.answerArea2);
        assertEquals(MainPage.ANSWER_2, actual);
        System.out.println("Вопрос 2: тест пройден");
    }

    @Test
    public void testQuestionAnswer3() {
        MainPage mainPage = new MainPage(driver);
        mainPage.clickButton(MainPage.questionButton3);
        String actual = mainPage.getAnswerText(MainPage.answerArea3);
        assertEquals(MainPage.ANSWER_3, actual);
        System.out.println("Вопрос 3: тест пройден");
    }

    @Test
    public void testQuestionAnswer4() {
        MainPage mainPage = new MainPage(driver);
        mainPage.clickButton(MainPage.questionButton4);
        String actual = mainPage.getAnswerText(MainPage.answerArea4);
        assertEquals(MainPage.ANSWER_4, actual);
        System.out.println("Вопрос 4: тест пройден");
    }

    @Test
    public void testQuestionAnswer5() {
        MainPage mainPage = new MainPage(driver);
        mainPage.clickButton(MainPage.questionButton5);
        String actual = mainPage.getAnswerText(MainPage.answerArea5);
        assertEquals(MainPage.ANSWER_5, actual);
        System.out.println("Вопрос 5: тест пройден");
    }

    @Test
    public void testQuestionAnswer6() {
        MainPage mainPage = new MainPage(driver);
        mainPage.clickButton(MainPage.questionButton6);
        String actual = mainPage.getAnswerText(MainPage.answerArea6);
        assertEquals(MainPage.ANSWER_6, actual);
        System.out.println("Вопрос 6: тест пройден");
    }

    @Test
    public void testQuestionAnswer7() {
        MainPage mainPage = new MainPage(driver);
        mainPage.clickButton(MainPage.questionButton7);
        String actual = mainPage.getAnswerText(MainPage.answerArea7);
        assertEquals(MainPage.ANSWER_7, actual);
        System.out.println("Вопрос 7: тест пройден");
    }

    @Test
    public void testQuestionAnswer8() {
        MainPage mainPage = new MainPage(driver);
        mainPage.clickButton(MainPage.questionButton8);
        String actual = mainPage.getAnswerText(MainPage.answerArea8);
        assertEquals(MainPage.ANSWER_8, actual);
        System.out.println("Вопрос 8: тест пройден");
    }
}
