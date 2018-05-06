package ua.od.hillel;


import org.junit.Test;

import static junit.framework.TestCase.*;

public class AppTest {

    @Test
    public void replaceSymbolInEmailTest() {
        assertTrue(new App().replaceSymbolInEmail("person@gmail.com").equals("person[at]gmail[dot]com"));
    }

    @Test
    public void collapseWordTest() {
        assertTrue(new App().collapseWord("internationalization localization cat elephant monitor").equals("i18n l10n cat e6t m5r"));
    }

    @Test
    public void countPalindromeTest() {
        assertTrue(new App().countPalindrome("deleveled, evitative, cat, dog, deified") == 3);
    }

    @Test
    public void toBinaryTest() {
        assertTrue(new App().toBinary(10).equals("1010"));
    }
}
