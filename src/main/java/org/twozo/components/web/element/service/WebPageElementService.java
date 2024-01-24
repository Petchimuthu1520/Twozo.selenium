package org.twozo.components.web.element.service;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.twozo.components.web.element.impl.WebPageElementServiceImpl;

import java.util.List;

public interface WebPageElementService {
    void click();
    void submit();

    void sendKeys(final CharSequence... keysToSend);

    void clear();

    String getTagName();

    String getAttribute(final String name);

    boolean isSelected();

    boolean isEnabled();

    String getText();

    List<WebPageElementServiceImpl> findElements(final By by);

    WebPageElementService findElement(final By by);

    default SearchContext getShadowRoot() {
        throw new UnsupportedOperationException("getShadowRoot");
    }

    boolean isDisplayed();

}
