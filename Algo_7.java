import java.util.Scanner;

public class Algo_7 {
    private static final Scanner scanner =new Scanner(System.in);
    public static void main(String[] args) {
        String sentence ="";
        boolean flag =false;
        do {
            System.out.print("Enter a Sentence: ");
            sentence=scanner.nextLine();
            sentence.strip();
            if(!sentence.isBlank()){
                flag=false;
            }else{
                System.out.println("Entered Sentence is Empty");
                flag =true;}
            
        } while (flag);
        String word="";
        int wordcount=1;
        for(int i=0;i<sentence.length();i++){
            if(sentence.charAt(i)==' '){
                wordcount++;
            }
        }
        String[] wordsarray=new String[wordcount];
        for(int i=0,j=0;i<sentence.length();i++){
            word=word+sentence.charAt(i);
            if((sentence.charAt(i)==' ') || i==sentence.length()-1){
                word=word.strip();
                wordsarray[j]=word;
                word="";
                j++;
            }           
        }
        int loogest=Integer.MIN_VALUE;
        String longestword="";
        int smallest =Integer.MAX_VALUE;
        String smallestWord="";
        for(int i=0;i<wordsarray.length;i++){
            if(wordsarray[i].length()>loogest){
                loogest=wordsarray[i].length();
                longestword=wordsarray[i];
            }
            if(wordsarray[i].strip().length()<smallest && !wordsarray[i].isBlank()){
                smallest=wordsarray[i].length();
                smallestWord=wordsarray[i];
            }
        }
        System.out.println("Longest word is "+longestword+" and length is :"+loogest);
        System.out.println("smallest word is "+ smallestWord+ " and length is :"+smallest);
    }
}
