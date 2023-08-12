public class StringTransformation {
    public static void main(String[] args) {
        String input = "A34Z3";
        String output = transformString(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }

    public static String transformString(String input) {
        char[] c = input.toCharArray();
        StringBuilder b = new StringBuilder();

        for (int i = 0; i < c.length; i++) {
            char ch = c[i];
            if (Character.isLetter(ch)) {
                b.append(ch); // Duplicate the letter
            } else if (Character.isDigit(ch)) {
                // Convert digit to the corresponding letter
                int digitValue = Character.getNumericValue(ch);
                char letter = (char) ('A' + digitValue - 1);
                b.append(letter);
            }
        }

        return b.toString();
    }
}
