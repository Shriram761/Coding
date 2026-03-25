
import java.util.*;

public class _3letpal {


    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        String str=s.nextLine();
        int lt[]=new int[26];
        int rt[]=new int[26];



        for(int i=0;i<str.length();i++){
            rt[str.charAt(i)-'a']++;
        }
int ans=0;
        for (int i = 0; i < str.length(); i++) {


                rt[str.charAt(i)-'a']--;
            for (int j = 0; j < 26; j++) {
            ans+=lt[j]*rt[j];
            }

            lt[str.charAt(i)-'a']++;
        }


        System.out.println(ans);
    }
}



