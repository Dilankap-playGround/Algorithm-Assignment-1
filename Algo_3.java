public class Algo_3 {
    public static void main(String[] args) {
        int[] nums ={10,20,30,40,50};
        int[] newArray=new int[nums.length];

        for(int i=nums.length-1,j=0;i>=0;i--,j++){
            newArray[j]=nums[i];
        }
        nums=newArray;
        System.out.print("[ ");
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" , ");
        }
        System.out.println("\b\b"+"]");
    }
}
