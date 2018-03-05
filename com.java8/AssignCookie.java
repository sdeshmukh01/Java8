import java.util.Arrays;

/**
 * Created by himu on 2/28/2018.
 */
public class AssignCookie
{

    public static void main(String[] args) {


        AssignCookie cookie = new AssignCookie();
        System.out.println(cookie.findContentChildren(new int[]{1,2}, new int[]{1,1}));
    }

    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);
        int i=0, j=0;
        while(i < g.length && j < s.length){
            if(g[i] <= s[j]) i++;
            j++;

        }
        return i;


    }
}
