import java.util.Scanner;

public class Algo_5 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean flag = true;
        String text = "";
        char[] charArray;
        do {
            System.out.print("Enter a text (ASCII only): ");
            text = scanner.nextLine();
            charArray = new char[text.length()];
            for (int i = 0; i < text.length(); i++) {
                charArray[i] = text.charAt(i);
                if((0<charArray[i]) && charArray[i]<127){
                    flag=true;
                }else{
                    flag=false;
                    break;
                }
            }
        } while (!flag);
        for (int i = 0, j = charArray.length - 1; i <= j; i++, j--) {
                char charcture = charArray[i];
                charArray[i] = charArray[j];
                charArray[j] = charcture;
            }
            System.out.print("[ ");
            for (int i = 0; i < charArray.length; i++) {
                System.out.print(charArray[i] + ",");
            }
            System.out.println("\b]");

    }
}
