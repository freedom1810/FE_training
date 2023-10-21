package control_flow;

public class CharacterCount {
    public static void main(String[] args) {
        String inputString = "Hello every one";
        char targetChar = 'e';

        int count = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == targetChar) {
                System.out.println("Character '" + targetChar + "' found at index " + i);
                count++;
            }
        }

        System.out.println("Character '" + targetChar + "' appears " + count + " times.");
    }
}