package guru.springframework.spring5webapp.components;

import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.Assert.assertEquals;

@ExtendWith(MockitoExtension.class)
public class FooTest {

    Foo foo = new Foo();

    @Test
    public void testGetBar() {
        assertEquals("FooBar", foo.getBar());
    }
}