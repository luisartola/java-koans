package com.tasktop.koans.java8.test.beginner;

import com.tasktop.koans.KoanRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.tasktop.koans.java8.test.Utils.__;
import static org.junit.Assert.*;

@RunWith(KoanRunner.class)
public class AboutAssertions {


    @Test
    public void assertNullObject() {
        // reference to the object can be null, a magic keyword, null, which means
        // that there is nothing there
        assertNull(__);
    }

    @Test
    public void assertNullObjectReference() {
        Object someObject = __;
        assertNull(someObject);
    }

    @Test
    public void assertNotNullObject() {
        // but what when there should not be a null value?
        assertNotNull(null);
    }

    @Test
    public void assertEqualsUsingExpression() {
        assertTrue("Hello World!".equals(__));
    }

    @Test
    public void assertEqualsWithAFewExpressions() {
        assertEquals("Hello World!", __);
        assertEquals(1, __);
        assertEquals(2 + 2, __);
        assertEquals(2 * 3, __);
        assertEquals(3 - 8, __);
        assertEquals(10 / 2, __);
    }

    @Test
    public void assertEqualsWithDescriptiveMessage() {
        // Generally, when using an assertXXX methods, expectation is on the
        // left and it is best practice to use a String for the first arg
        // indication what has failed
        assertEquals("The answer to 'life the universe and everything' should be 42", 42, __);
    }

    @Test
    public void assertSameInstance() {
        Integer original = new Integer(1);
        Integer same = original;
        Integer different = new Integer(1);
        // These are both equal to the original...
        assertEquals(original, same);
        assertEquals(original, different);
        // ...but only one refers to the same instance as the original.
        assertSame(original, __);
    }

    @Test
    public void assertNotSameInstance() {
        Integer original = new Integer(1);
        Integer same = original;
        Integer different = new Integer(1);
        // These are both equal to the original...
        assertEquals(original, same);
        assertEquals(original, different);
        // ...but only one of them refers to a different instance.
        assertNotSame(original, same);  // We want equal, but _not_ the same.
    }
}
