package org.twozo.components.web.element.impl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.twozo.components.web.element.service.WebPageElementService;

import java.util.ArrayList;
import java.util.List;

public class WebPageElementServiceImpl implements WebPageElementService {

    private final WebElement element;

    public WebPageElementServiceImpl(final WebElement element) {
        this.element = element;
    }

    @Override
    public void click() {
        element.click();
    }

    @Override
    public void submit() {
        element.submit();
    }

    @Override
    public void sendKeys(final CharSequence... keysToSend) {
        element.sendKeys(keysToSend);
    }

    @Override
    public void clear() {
        element.clear();
    }

    @Override
    public String getTagName() {
        return element.getTagName();
    }

    @Override
    public String getAttribute(final String name) {
        return element.getAttribute(name);
    }

    @Override
    public boolean isSelected() {
        return element.isSelected();
    }

    @Override
    public boolean isEnabled() {
        return element.isEnabled();
    }

    @Override
    public String getText() {
        return element.getText();
    }

    @Override
    public List<WebPageElementServiceImpl> findElements(final By by) {
        final List<WebElement> webElements = element.findElements(by);
        final List<WebPageElementServiceImpl> list = new ArrayList<>();

        for (final WebElement webElement : webElements) {
            list.add(new WebPageElementServiceImpl(webElement));
        }

        return list;
    }

    @Override
    public WebPageElementService findElement(final By by) {
        return new WebPageElementServiceImpl(element.findElement(by));
    }

    @Override
    public boolean isDisplayed() {
        return element.isDisplayed();
    }
}
