package com.spring.fun.apachecommons;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.similarity.LevenshteinDistance;

public class StringOperations {

    private StringOperations() {
    }

    public static String changeStringStrip(String text) {
        return StringUtils.strip(text);
    }

    public static String changeStringChop(String text) {
        return StringUtils.chop(text);
    }

    public static int changeStringCountMatches(String text, String seq) {
        return StringUtils.countMatches(text, seq);
    }

    public static boolean changeStringPrintable(String text) {
        return StringUtils.isAsciiPrintable(text);
    }

    public static String changeStringRotate(String text, int shift) {
        return StringUtils.rotate(text, shift);
    }

    public static Integer changeTextLevenshteinDistance(String start, String finish) {
        return new LevenshteinDistance().apply(start, finish);
    }

}