package Java;

public class RotateImage {
    public static void rotateMatrix(int[][] matrix) {
        int len=matrix.length;
        for(int i=0;i<len;i++){
            for(int j=i;j<len-1-i;j++){
                int temp=matrix[len-j-1][i];
                matrix[len-j-1][i]=matrix[len-i-1][len-j-1];
                matrix[len-i-1][len-j-1]=matrix[j][len-i-1];
                matrix[j][len-i-1]=matrix[i][j];
                matrix[i][j]=temp;
            }
        }
    }
    public static void main(String[] args) {
        int[][] in={{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        rotateMatrix(in);
    }
}
