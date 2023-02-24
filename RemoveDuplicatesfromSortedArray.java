package Java;

public class RemoveDuplicatesfromSortedArray {
    public static int removeDuplicates(int[] nums){
        int count=0,i=0;
        while(i<nums.length){
            int temp=nums[i];
            while(i!=nums.length && temp==nums[i]){
                i++;
            }
            nums[count]=temp;
            count++;
        }
        
        return count;
    }
    public static void main(String[] args) {
        int arr[] ={1,1,2,3,4,4,5};
        System.out.println(removeDuplicates(arr));
    }
}
