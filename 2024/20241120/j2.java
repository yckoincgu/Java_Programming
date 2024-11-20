package midterm1113;

public class j2 {
    public static void main(String[] args) {
        String sentence = "You are welcome.";
        
        char[] charArray = new char[sentence.length()];

        for (int i = 0; i < sentence.length(); i++) {
            charArray[i] = sentence.charAt(i);
        }

        System.out.print("Copied sentence: ");
        for (char c : charArray) {
            System.out.print(c);
        }
    }
}
