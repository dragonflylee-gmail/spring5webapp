package guru.springframework.spring5webapp.components;

import org.springframework.stereotype.Component;

@Component
public class Foo {
    public String getBar() {
        return "FooBar";
    }
}
