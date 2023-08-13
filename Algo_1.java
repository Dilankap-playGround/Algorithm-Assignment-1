import java.util.Scanner;

public class Algo_1{
    private static final Scanner scanner =new Scanner(System.in);
    public static void main(String[] args) {
        int num;
        do{
            System.out.print("Enter a Positive Number: ");
            num=scanner.nextInt();
            scanner.nextLine();
            
        }while(num<=0);

        int sum;
        int n1=0;
        int n2=1;
        String squence =n1+" , "+n2;
        int x=0;
        do{
            sum=n1+n2;
            n1=n2;
            n2=sum;
            squence=squence+" , "+sum;
            
        }while(n1+n2<=num);
        System.out.println(squence);
    
    }
}