package com.udemy.java.assertion;

import com.udemy.java.pages.BasePage;
import org.assertj.core.api.AbstractAssert;

public class PageAssert extends AbstractAssert<PageAssert, BasePage> {

    public PageAssert(BasePage basePage) {
        super(basePage, PageAssert.class);
    }

    public static PageAssert assertThat(BasePage page) {
        return new PageAssert(page);
    }

    public PageAssert isAt() {
        isNotNull();
        if (!actual.isAt()) {
            failWithMessage("Page is not displayed");
        }
        return this;
    }

    public PageAssert titleContains(String title) {
        isNotNull();
        if (!actual.titleContains(title)) {
            failWithMessage("Page does not contain the title <%s>", title);
        }
        return this;
    }

}
