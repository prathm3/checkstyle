package org.checkstyle.suppressionxpathfilter.annotationlocation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@EnumAnnotation("bar") enum InputXpathAnnotationLocationEnum { //warn

    SuppressionXpathRegressionAnnotationLocationEnum() {
    }

}

@Target({ElementType.FIELD, ElementType.TYPE})
@interface EnumAnnotation  {

    String value() default "";

}
