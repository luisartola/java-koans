package com.tasktop.koans.java8.test.beginner;

import com.tasktop.koans.KoanRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.fail;

@RunWith(KoanRunner.class)
public class AboutKoans {

    @Test
    public void findAboutKoansFile() {

    }

    @Test
    public void definitionOfKoanCompletion() {
        boolean koanIsComplete = true;
        if (!koanIsComplete) {
            fail("what if koanIsComplete variable was true?");
        }
    }

}
