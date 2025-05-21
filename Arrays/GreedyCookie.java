import java.util.Arrays;

public class GreedyCookie {
        public int findContentChildren(int[] g, int[] s) {
            int count = 0;
            Arrays.sort(g);
            Arrays.sort(s);
            for(int i = 0,j = 0; i < g.length && j < s.length; j++){
                if(s[j]>=g[i]){
                    count++;
                    i++;
                }
            }
            return count;
        }
}
