import java.util.Scanner;
public class M3Q04 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int w = scn.nextInt();
        int h = scn.nextInt();
        int data[] = new int[w];
        for(int i = 1 ; i <= h ; i++ ){
            for(int j = 0 ; j < w ; j++ ){
                for(int k = 0 ; k <= j ; k++ ){
                    data[j] = (k+1)*i ;
                }
            System.out.print(data[j] + "\t");
        }
        System.out.println();
        }
    }
}
