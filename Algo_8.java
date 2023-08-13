

public class Algo_8 {
    public static void main(String[] args) {
        int [] numA={5,7,-2,3,4,6,-8};
        int[] numB={7,8,-8,2,1,-9,6};
        String result="";

        //.1
        System.out.println("Question 01");
        System.out.print("(numA \u2229 numB) : ");
        for(int i =0;i<numA.length;i++){
            for(int j=0;j<numB.length;j++){
                if ((numA[i]==numB[j])){
                        System.out.print(numA[i]+" , ");
                }
            }
        }
        System.out.println("\b\b ");
        //.2
        System.out.println("Question 2");
        System.out.print("(numA \u222A numB) : ");
        for(int i=0,j=0; i<numA.length+numB.length;i++,j++){
            if(i<numA.length){
                System.out.print(numA[i]+ " , ");
            }else if(i==numA.length){
                j=0;
                System.out.print(numB[j]+" , ");
            }else{
                System.out.print(numB[j]+" , ");
            }
        }
        System.out.println("\b\b ");

        //3.
        System.out.println("Question 3");
        System.out.print("numA \\ numB : ");
      
        loop1:
        for(int i =0;i<numA.length;i++){
            for(int j=0;j<numB.length;j++){
                if ((numA[i]==numB[j])){
                        continue loop1;
                }
            }
            System.out.print(numA[i] +" , ");
        }
        System.out.println("\b\b ");

        //4.
        System.out.println("Question 4");
        System.out.print("numB \\ numA : ");
      
        loop2:
        for(int i =0;i<numB.length;i++){
            for(int j=0;j<numA.length;j++){
                if ((numB[i]==numA[j])){
                        continue loop2;
                }
            }
            System.out.print(numB[i] +" , ");
        }
        System.out.println("\b\b ");
        //5.
        System.out.println("Question 5");
        System.out.print("(numA \u25B3 numB) : ");
         loop1:
        for(int i =0;i<numA.length;i++){
            for(int j=0;j<numB.length;j++){
                if ((numA[i]==numB[j])){
                        continue loop1;
                }
            }

            System.out.print(numA[i] +" , ");
        }
        loop2:
        for(int i =0;i<numB.length;i++){
            for(int j=0;j<numA.length;j++){
                if ((numB[i]==numA[j])){
                        continue loop2;
                }
            }
            System.out.print(numB[i] +" , ");
        }
        System.out.println("\b\b ");
    }
}
