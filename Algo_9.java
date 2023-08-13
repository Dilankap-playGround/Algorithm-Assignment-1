import java.util.Scanner;

public class Algo_9 {
    private static final Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        do{
            System.out.print("Enter a Word: ");
            String inputword=scanner.next();
            if(!scanner.nextLine().trim().isEmpty()) continue;
            int numOfCharactures=inputword.length();
            String reversword="";
            for(int i=inputword.length()-1;i>=0;i--){
                reversword=reversword+inputword.charAt(i);
            }
            if(inputword.equalsIgnoreCase(reversword)){
                System.out.println("Word is Palindrome");
            }else{
                System.out.println("Word is not a palindrome");
            }
        }while(true);
    }
}
