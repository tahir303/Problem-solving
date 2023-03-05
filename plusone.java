package Java;

public class plusone {
    public static int[] plusOne(int[] digits){
        int n=digits.length;
        for(int i=n-1;i>=0;i--){
            if(digits[i]+1<10){
                digits[i]=digits[i]+1;
                break;
            }
            else if(i==0 && digits[i]+1>=10){
                int[] out=new int[n+1];
                out[0]=1;
                return out;
            }
            else{
                digits[i]=0;
            }
        }
        return digits;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int[] out=plusOne(arr);
        for(int i:out){
            System.out.print(i+" ");
        }
    }
}
