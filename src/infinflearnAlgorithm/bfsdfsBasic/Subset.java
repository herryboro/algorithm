package infinflearnAlgorithm.bfsdfsBasic;
public class Subset {
    static int n;
    static int[] ch;

    public void dfs(int l) {
        if (l == n + 1) {
            String tmp = "";

            for (int i = 1; i <= n; i++) {
                if(ch[i]== 1) tmp += (i + " ");
            }

            if(tmp.length() > 0) System.out.println(tmp);
        } else {
            ch[l] = 1;
            dfs(l + 1);
            ch[l] = 0;
            dfs(l + 1);
        }
    }
    public static void main(String[] args) {
        Subset subset = new Subset();
        n = 5;
        ch = new int[n + 1];
        subset.dfs(1);
    }
}
