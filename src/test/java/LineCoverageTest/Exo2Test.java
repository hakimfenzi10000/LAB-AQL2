package LineCoverageTest;

import org.example.exo02.Anagram;
import org.example.exo02.AnagramFixed;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EXO2Test {

    @Test
    void testAnagramSimple() {
        assertTrue(AnagramFixed.isAnagram("chien", "niche"), "Les mots 'chien' et 'niche' sont des anagrammes");
    }

    @Test
    void testAnagramWithSpacesAndCase() {
        assertTrue(AnagramFixed.isAnagram("Un mot", "mot un"), "Les phrases 'Un mot' et 'mot un' sont des anagrammes en ignorant la casse et les espaces");
    }

    @Test
    void testNotAnagramDifferentLetters() {
        assertFalse(AnagramFixed.isAnagram("chien", "chat"), "Les mots 'chien' et 'chat' ne sont pas des anagrammes");
    }

    @Test
    void testDifferentLengths() {
        assertFalse(AnagramFixed.isAnagram("abcd", "abc"), "Des chaînes de longueurs différentes ne peuvent pas être des anagrammes");
    }

    @Test
    void testNullInputs() {
        assertThrows(NullPointerException.class, () -> AnagramFixed.isAnagram(null, "test"), "Une des entrées est null");
        assertThrows(NullPointerException.class, () -> AnagramFixed.isAnagram("test", null), "Une des entrées est null");
        assertThrows(NullPointerException.class, () -> AnagramFixed.isAnagram(null, null), "Les deux entrées sont null");
    }

    @Test
    void testEmptyStrings() {
        assertTrue(AnagramFixed.isAnagram("", ""), "Deux chaînes vides sont des anagrammes");
    }

    @Test
    void testSingleCharactersSame() {
        assertTrue(AnagramFixed.isAnagram("a", "a"), "Une lettre identique est un anagramme");
    }

    @Test
    void testSingleCharactersDifferent() {
        assertFalse(AnagramFixed.isAnagram("a", "b"), "Deux lettres différentes ne sont pas des anagrammes");
    }
}
