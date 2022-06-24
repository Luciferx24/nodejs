import java.util.ArrayList;

class main{
    public static void main(String[] args) {
        int[] arr= {3,2,1,5,6,4};
    }
    public static void findKthLargest(int[] nums) {
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]<nums[j]){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
            System.out.println(nums[i]);
        }
    }
    
    static void swap(int i, int j, int[] nums){
        int temp=0;
        temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;   
    }
}