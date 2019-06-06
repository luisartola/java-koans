package com.tasktop.koans.java8.test.beginner;

import com.tasktop.koans.KoanRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.tasktop.koans.java8.test.Utils.__;
import static org.junit.Assert.assertEquals;


@RunWith(KoanRunner.class)
public class AboutMethodPreference {

    class A {
        public String doStuff(int i) {
            return "int";
        }

        public String doStuff(Integer i) {
            return "Integer";
        }

        public String doStuff(Object i) {
            return "Object";
        }

        public String doStuff(int... i) {
            return "int vararg";
        }
    }

    @Test
    public void methodPreferenceInt() {
        assertEquals(new A().doStuff(1), __);
    }

    @Test
    public void methodPreferenceInteger() {
        assertEquals(new A().doStuff(Integer.valueOf(1)), __);
    }

    @Test
    public void methodPreferenceLong() {
        long l = 1;
        assertEquals(new A().doStuff(l), __);
    }

    @Test
    public void methodPreferenceBoxedLong() {
        Long l = Long.valueOf(1);
        assertEquals(new A().doStuff(l), __);
    }

    @Test
    public void methodPreferenceDouble() {
        Double l = Double.valueOf(1);
        assertEquals(new A().doStuff(l), __);
    }

    @Test
    public void methodPreferenceMore() {
        // What happens if you change 'Integer' to 'Double'
        // Does this explain 'methodPreferenceDouble'?
        // Think about why this happens?
        assertEquals(new A().doStuff(1, Integer.valueOf(2)), __);
    }
}
