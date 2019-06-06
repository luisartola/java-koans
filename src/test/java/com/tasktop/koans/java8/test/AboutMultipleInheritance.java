package com.tasktop.koans.java8.test;

import com.tasktop.koans.KoanRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(KoanRunner.class)

public class AboutMultipleInheritance {

    interface Human {
        default String sound() {
            return "hello";
        }
    }

    interface Bull {
        default String sound() {
            return "moo";
        }
    }

    class Minotaur implements Human, Bull {
        //both interfaces implement same default method
        //has to be overridden
        @Override
        public String sound() {
            return Bull.super.sound();
        }
    }

    @Test
    public void multipleInheritance() {
        Minotaur minotaur = new Minotaur();
        Assert.assertEquals(minotaur.sound(), "__");
    }

}
