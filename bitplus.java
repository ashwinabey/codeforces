import java.util.Scanner;

public class bitplus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = 0 ;
        int n = sc.nextInt();

        for(int i =0; i<n ; i++){
            String s = sc.next();;

            if(s.contains("++")){
                x++;
            }else{
                x--;
            }
        }
        System.out.println(x);
    }
}
