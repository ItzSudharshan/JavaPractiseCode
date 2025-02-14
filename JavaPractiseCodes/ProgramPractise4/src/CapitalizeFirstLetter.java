import java.util.*;

public class CapitalizeFirstLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence");
        String sentence = sc.nextLine();
        sc.close(); // Close scanner to avoid resource leak

        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1))
                      .append(" ");
            }
        }

        // Trim to remove the extra space at the end
        System.out.println("The First Letter of all the words is Capitalized->");
        System.out.println(result.toString().trim());
    }
}

/*
 * OUTPUT 
 * 
 * Enter the Sentence
java programming is fun
The First Letter of all the words is Capaitalized->
Java Programming Is Fun 


 */
