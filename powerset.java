

import java.util.*;

public class powerset {

    public static void main(String[] args) {
        String str = "abc";
        int n = str.length();
        int total = 1 << n;
        for (int num = 0; num < total; num++) {
            StringBuilder sb = new StringBuilder();
                for (int i = 0; i < n; i++) {
                   if ((num & (1 << i)) != 0) {
                    sb.append(str.charAt(i));
                        }
            }

                
            System.out.println(sb.toString());
        }
    }
}