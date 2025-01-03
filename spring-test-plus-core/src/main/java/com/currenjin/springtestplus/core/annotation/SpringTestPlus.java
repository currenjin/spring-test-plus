package com.currenjin.springtestplus.core.annotation;

import com.currenjin.springtestplus.core.extension.SpringTestPlusExtension;
import com.currenjin.springtestplus.core.type.TestType;
import org.junit.jupiter.api.extension.ExtendWith;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@ExtendWith(SpringTestPlusExtension.class)
public @interface SpringTestPlus {
    TestType type() default TestType.UNIT;
}
