import java.util.Scanner;
public class M3Q05{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();//8
        int n = scn.nextInt();//6
        System.out.println(fun(m)/(fun(n)*fun(m-n)));
    }
    public static long fun(int x){
        long p = 1;
        for(int i = x ; i>1 ; i--){
            p = p*i;
        }
        return p;   
    }
}
