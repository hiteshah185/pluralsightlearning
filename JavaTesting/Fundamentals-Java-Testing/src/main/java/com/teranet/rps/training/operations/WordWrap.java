package com.teranet.rps.training.operations;

import java.util.ArrayList;
import java.util.List;

public class WordWrap {
    public static String wrap(String text, int maxLineLength) {
        List<String> lines = splitIntoLines(text, maxLineLength);
        return joinLines(lines);
    }

    private static List<String> splitIntoLines(String text, int maxLineLength) {
        List<String> lines = new ArrayList<>();
        int currentLineLength = 0;
        StringBuilder currentLine = new StringBuilder();

        for (char character : text.toCharArray()) {
            if (currentLineLength == maxLineLength) {
                lines.add(currentLine.toString());
                currentLine = new StringBuilder();
                currentLineLength = 0;
            }
            currentLine.append(character);
            currentLineLength++;
        }

        if (currentLine.length() > 0) {
            lines.add(currentLine.toString());
        }

        return lines;
    }

    private static String joinLines(List<String> lines) {
        return String.join("\n", lines);
    }
}
