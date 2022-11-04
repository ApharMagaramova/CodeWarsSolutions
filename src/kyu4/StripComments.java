package kyu4;

/**
 * 4 kyu
 * <a href="https://www.codewars.com/kata/51c8e37cee245da6b40000bd/">Codewars kata kyu4.StripComments</a>
 * <p>
 * Details:
 * Complete the solution so that it strips all text that follows any of a set of comment markers passed in.
 * Any whitespace at the end of the line should also be stripped out.</p>
 */


public class StripComments {
    public static void main(String[] args) {
        System.out.println(stripComments("apples, pears # and bananas\ngrapes\nbananas !apples", new String[]{"#", "!"}));

    }

    public static String stripComments(String text, String[] commentSymbols) {
        StringBuilder result = new StringBuilder();
        String[] lines = text.split("\n");


        for (int i = 0; i < lines.length; i++) {
            int comment = lines[i].length();
            StringBuilder lineBuilder = new StringBuilder();

            if (comment != 0) {
                for (String commentSymbol : commentSymbols) {
                    if (lines[i].contains(commentSymbol)) {
                        comment = Math.min(comment, lines[i].indexOf(commentSymbol));
                    }
                }
                lineBuilder.append(lines[i], 0, comment);
            }

            // remove whitespace at the end of each line
            while (lineBuilder.length() != 0 && lineBuilder.charAt(lineBuilder.length() - 1) == ' ') {
                lineBuilder.setLength(lineBuilder.length() - 1);
            }

            lineBuilder.append("\n");
            result.append(lineBuilder);
        }

        // remove whitespace at the end of result text
        if (result.length() != 0) {
            result.setLength(result.length() - 1);
        }

        return new String(result);
    }
}
