import java.util.*;

class Solution{

    public static void main(String []argh){
        final Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            final StringBuffer sb = new StringBuffer();
            for (int ni=0;ni<n;ni++) {
                int secVal = a;
                for (int nj=0; nj<=ni; nj++){
                    secVal += Math.pow(2, nj) * b;
                }
                sb.append(secVal);
                sb.append(" ");
            }
            System.out.println(sb.toString().substring(0, sb.length()-1));

        }
        in.close();
    }

}
