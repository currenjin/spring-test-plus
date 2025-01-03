package com.currenjin.springtestplus.core.extension;

import com.currenjin.springtestplus.core.annotation.SpringTestPlus;
import com.currenjin.springtestplus.core.type.TestType;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class SpringTestPlusExtension implements BeforeAllCallback {

    @Override
    public void beforeAll(ExtensionContext context) {
        Class<?> testClass = context.getRequiredTestClass();
        SpringTestPlus annotation = testClass.getAnnotation(SpringTestPlus.class);

        if (annotation != null) {
            configureTestEnvironment(annotation.type(), testClass);
        }
    }

    private void configureTestEnvironment(TestType type, Class<?> testClass) {
        // TODO("Not yet implemented")
    }
}