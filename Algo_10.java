import java.util.Scanner;

public class Algo_10 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String number = "";
        boolean numberisCorrect = true;
        do {
            System.out.print("Enter your phone Number(Either in +94 xx xxxx or 0xx xxxxxxx): ");
            number = scanner.nextLine();
            if (!number.strip().isEmpty()) {
                if (number.startsWith("+94") && number.length() == 12) {
                    for(int j=3;j<number.length();j++){
                       numberisCorrect= Character.isDigit(number.charAt(j));
                       if(!numberisCorrect) {
                        System.out.println("Invalid  phone number");
                        break;
                       }
                    }
                    if(numberisCorrect)System.out.println("Number is Validated");
                    
                }else if(number.startsWith("0")&& number.length()==10){
                    for(int j=0;j<number.length();j++){
                       numberisCorrect= Character.isDigit(number.charAt(j));
                       if(!numberisCorrect) {
                        System.out.println("Invalid  phone number");
                        break;
                       }
                    }
                    if(numberisCorrect)System.out.println("Number is Validated");
                }else{
                    System.out.println("Invalid phone number");
                    numberisCorrect=false;
                }
            } else {
                System.out.println("Number can't be Empty");
                numberisCorrect=false;
            }

        } while (!numberisCorrect);
    }
}
