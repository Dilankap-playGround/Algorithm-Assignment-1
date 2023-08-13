public class Algo_2 {
    public static void main(String[] args) {
        int [] nums ={-5,2,7,10,58,-7,8,23};
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>largest){
                largest=nums[i];
            }
            if(nums[i]<smallest){
                smallest=nums[i];
            }
        }
        System.out.println("Largest Number from nums is: "+largest);
        System.out.println("Samllest Number from nums is: "+smallest);

    }
}
