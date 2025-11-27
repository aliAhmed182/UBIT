public class matix {
    public static void main (String []args ){
        int[] A = {1,2,3,4};
        int[] B = {11,20,22,26};
        int sum= 0;
        for(int k=0; k < 4; k++ ){
            sum+= A[k] * B[k];
            System.out.println(sum);
        }
    }
}
