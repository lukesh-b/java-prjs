package text_processing;

/**
 * Utility class for common text-processing operations.
 */
public class TextProcessingUtils {

    public static void main(String[] args) {
        printWordCountAndWords("This is a great world"); // count the words
        System.out.println(getReversedText("START")); // prints the reverse of a word
    }

    /**
     * Counts the number of words in the given text and prints each word on a new line.
     *
     * @param inputText the text to be analyzed
     */
    public static void printWordCountAndWords(String inputText) {
        String[] words = splitIntoWords(inputText);
        int wordCount = words.length;

        System.out.println(String.format("Your text contains %d words:", wordCount));

        for (String word : words) {
            System.out.println(word);
        }
    }

    /**
     * Splits the given text into words using whitespace as a delimiter.
     *
     * @param inputText the text to split
     * @return an array of words
     */
    private static String[] splitIntoWords(String inputText) {
        return inputText.trim().split("\\s+");
    }

    /**
     * Returns the reverse of the given text.
     *
     * @param inputText the text to reverse
     * @return the reversed text
     */
    public static String getReversedText(String inputText) {
        StringBuilder reversedText = new StringBuilder();

        for (int index = inputText.length() - 1; index >= 0; index--) {
            reversedText.append(inputText.charAt(index));
        }

        return reversedText.toString();
    }
}

