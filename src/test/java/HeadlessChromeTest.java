//package com.example.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class HeadlessChromeTest {
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Cấu hình chạy Chrome ở chế độ headless
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); // Chạy không hiển thị giao diện
        options.addArguments("--disable-gpu"); // Tránh lỗi trên Windows
        options.addArguments("--window-size=1920,1080"); // Định kích thước trình duyệt
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        // Khởi tạo WebDriver với ChromeOptions
        driver = new ChromeDriver(options);
    }

    @Test
    public void testGoogleSearch() {
        driver.get("https://www.google.com");
        System.out.println("Title của trang là: " + driver.getTitle());
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
