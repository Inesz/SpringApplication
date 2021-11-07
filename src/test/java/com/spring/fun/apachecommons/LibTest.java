package com.spring.fun.apachecommons;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class LibTest {
    @ParameterizedTest
    @CsvSource({"test,TEST", "test,", "ala,Antek", ",oho", "olo,alo", "olo,ola"})
    void textTest(String first, String second) {
        try {
            System.out.println(StringOperations.changeTextLevenshteinDistance(first, second));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @ParameterizedTest
    @CsvSource({"test,TEST", "test,", "alalala,ala", "o,oo", "ooo,oo"})
    void textCountTest(String first, String pattern) {
        System.out.println(StringOperations.changeStringCountMatches(first, pattern));
    }

    @ParameterizedTest
    @ValueSource(strings = {"\n", "", " ", "p", "\nchar\n\r\r\r\n", "\rstr\r", "qwe", "qwe\n"})
    void textPrintableTest(String text) {
        System.out.println("[" + text + "]");
        System.out.println(StringOperations.changeStringPrintable(text));
    }

    @ParameterizedTest
    @ValueSource(strings = {"\n", "", " ", "p", "\nchar\n\r\r\r\n", "\rstr\r", "qwe", "qwe\n"})
    void textStripTest(String text) {
        System.out.println("[" + text + "]");
        System.out.println(StringOperations.changeStringStrip(text));
    }

    @ParameterizedTest
    @ValueSource(strings = {"\n", "", " ", "p", "\nchar\n\r\r\r\n", "\rstr\r", "qwe", "qwe\n"})
    void textChopTest(String text) {
        System.out.println("[" + text + "]");
        System.out.println(StringOperations.changeStringChop(text));
    }


    @ParameterizedTest
    @CsvSource({"qwer,-1", "qwer,0", "qwer,1", "qwer,2", "qwer,3", "qwer,4", "qwer,5"})
    void textRotateTest(String first, int shift) {
        System.out.println(StringOperations.changeStringRotate(first, shift));
    }

    @Test
    void collectionTest() {
        Collection<Integer> list1 = new ArrayList<>();
        CollectionOperations.apacheIgnoreNull(list1, 1);
        CollectionOperations.apacheIgnoreNull(list1, null);
        CollectionOperations.apacheIgnoreNull(list1, 2);
        System.out.println(list1);

        try {
            Collection<Integer> list2 = Collections.unmodifiableCollection(Arrays.asList());
            CollectionOperations.apacheIgnoreNull(list2, 1);
            System.out.println(list2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
