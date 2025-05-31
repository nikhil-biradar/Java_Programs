package custom_annotation;

import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface NikhilDemo {
    String value() default "This is Nikhil's annotation";
}
