package Java;

public class MoveZeroesAtEnd {
    public static void moveZeroes(int[] nums){
        if(nums.length>1){
            int j=0,i=0;
            while(i<nums.length){
                if(nums[i]!=0){
                    int temp=nums[i];
                    nums[i]=0;
                    nums[j]=temp;
                    
                    j++;
                }
                i++;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums={0,1,0,3,12};
        moveZeroes(nums);
    }
}
