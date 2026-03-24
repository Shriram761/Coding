import java.util.*;
public class Binstrusingblocks {
    public static void main(String[] args) {
        final int MOD=(int)(10e9+7);
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        PriorityQueue<Integer> A=new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> B=new PriorityQueue<>();

        for(int i=0;i<n;i++){
            A.add(s.nextInt());
        }    for(int i=0;i<n;i++){
            B.add(s.nextInt());
        }
        System.out.println(A);
        System.out.println(B);

int ans=0;
        for (int i = 0; i < n; i++) {
            int one=A.poll();
            while(one>0){
                ans=((ans*2)+1)%MOD;
                one--;
            }int zero=B.poll();
            while(zero>0){
                ans=((ans*2))%MOD;
                zero--;
            }
        }


        System.out.println(ans);

    }
}
