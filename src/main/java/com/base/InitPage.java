package com.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface InitPage<T> {

    public default void setDriver() {
    }

    private T find(){
        return null;
    }

    private void set() {
    }

    private void click() {}

    static void delay() {
        // Demo Purpose
    }

}
