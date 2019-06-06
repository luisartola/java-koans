package com.tasktop.koans.java8.test.java8;

import com.tasktop.koans.KoanRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

import static com.tasktop.koans.java8.test.Utils.__;
import static org.junit.Assert.assertEquals;

@RunWith(KoanRunner.class)
public class AboutBase64 {

    private final String plainText = "lorem ipsum";
    private final String encodedText = "bG9yZW0gaXBzdW0=";

    @Test
    public void base64Encoding() {
        try {
            // Encode the plainText
            // This uses the basic Base64 encoding scheme but there are corresponding
            // getMimeEncoder and getUrlEncoder methods available if you require a
            // different format/Base64 Alphabet 
            assertEquals(encodedText, Base64.getEncoder().encodeToString(__.getBytes("utf-8")));
        } catch (UnsupportedEncodingException ex) {}
    }

    @Test
    public void base64Decoding() {
        // Decode the Base64 encodedText
        // This uses the basic Base64 decoding scheme but there are corresponding
        // getMimeDecoder and getUrlDecoder methods available if you require a
        // different format/Base64 Alphabet
        byte[] decodedBytes = Base64.getDecoder().decode(__);
        try {
            String decodedText = new String(decodedBytes, "utf-8");
            assertEquals(plainText, decodedText);
        } catch (UnsupportedEncodingException ex) {}
    }

}
