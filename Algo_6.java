import java.util.Scanner;

public class Algo_6 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String sentence = " ";
        String[] array;
        boolean flag = false;
        do {
            System.out.print("Enter a Sentence (using ASCII only): ");
            sentence = scanner.nextLine();

            for (int i = 0; i < sentence.length(); i++) {

                if (((0 < sentence.charAt(i)) && (sentence.charAt(i) < 127)) && (!sentence.isBlank())) {
                    sentence = sentence.strip();
                    flag = true;
                } else {
                    flag = false;
                    System.out.println("Enter a valid sentence using only ASCII charactures");
                    break;
                }
            }
        } while (!flag);

        String word = "";
        int wordcount = 1;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                wordcount++;
            }
        }
        array = new String[wordcount];
        int arrayindex = 0;
        for (int j = 0; j < sentence.length(); j++) {
            word = word + sentence.charAt(j);
            if ((sentence.charAt(j) == ' ') | j == sentence.length() - 1) {
                array[arrayindex] = word;
                word = "";
                arrayindex++;
            }
        }
        for (int i = 0, j = array.length - 1; i <= j; i++, j--) {
            word = array[i];
            array[i] = array[j];
            array[j] = word;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

    }
}
