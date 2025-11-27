public class HammingAlgorithm {
    public static void main(String[] args){
        int [] data = {1,1,0,0,0,0,1,1,1,0,0,1};
        int [] msg = {2,0,0,1,0,1,0,0,0,0,0,1,1,1,0,0,0,1};
        int msglength = msg.length;
        int s1 = 0;
        //calculating h1
        for(int i = 1; i < msglength; i +=2){
                s1 += msg[i];
        }
        int ans = HammingCalculator(s1);
        System.out.println("s1: " +s1);
        System.out.println("H1: " + ans);


        //calculating h2
        int s2 = 0;
        for(int j = 2 ; j < msglength; j+=4){
            if (j+1 < msglength){
                s2 += (msg[j] + msg[j+1]);
            }
        }
        int ans2 = HammingCalculator(s2);
        System.out.println("s2: " + s2);
        System.out.println("H2: " +ans2);

        //calculating h3
        s2 = 0;
        for(int j = 4 ; j < msglength; j+=8){
            if (j+1 < msglength){
                s2 += (msg[j] + msg[j+1] + msg[j+2] + msg[j+3]);
            }
        }
        ans2 = HammingCalculator(s2);
        System.out.println("s3: " + s2);
        System.out.println("H3: " +ans2);

        //calculating h4
        s2 = 0;
        for(int j = 8 ; j < msglength; j+=16){
            if (j+1 < msglength){
                s2 += (msg[j] + msg[j+1] + msg[j+2] + msg[j+3] + msg[j+4] + msg[j+5] + msg[j+6] + msg[j+7]);
            }
        }
        ans2 = HammingCalculator(s2);
        System.out.println("s4: " + s2);
        System.out.println("H4: " +ans2);

    }

    //This is for odd parity only
    public static int HammingCalculator(int sum ){
        int r = sum % 2;
        if (r != 0){
             int H = 0;
             return H;
        }else{
            int H = 1;
            return H;
        }
    }

}