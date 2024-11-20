package midterm1113;

public class j5 {
    public static void main(String[] args) {

        String sentence = "You are welcome.";

        String[] wordsArray = split(sentence);

        System.out.println("Words in the array:");
        for (String word : wordsArray) {
            System.out.println(word);
        }
    }

    public static String[] split(String sentence) {
        return sentence.split(" ");
    }
}
