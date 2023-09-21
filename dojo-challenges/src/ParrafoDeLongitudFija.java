public class ParrafoDeLongitudFija {
    public static String toFixedLengthParagraph(String input, int length){
        StringBuilder sb = new StringBuilder();
        String[] words = input.split(" ");
        int currentLineLength = 0;

        for (String word : words) {
            if (currentLineLength + word.length() <= length) {
                sb.append(word).append(" ");
                currentLineLength += word.length() + 1;
            } else {
                sb.append("\n").append(word).append(" ");
                currentLineLength = word.length() + 1;
            }
        }

        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String entrada = "When you play the game of thrones, you win or you die.";
        int longitud = 38;

        String formatoDelParrafo = toFixedLengthParagraph(entrada, longitud);
        System.out.println(formatoDelParrafo);
    }
}
