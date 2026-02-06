import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class boyorgirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String user = sc.next();

        Set<Character> w =new HashSet<>();

        for (char ch :user.toCharArray()){
            w.add(ch);
        }

        if (w.size()%2==0){
            System.out.println("CHAT WITH HER!");
        }else{
            System.out.println("IGNORE HIM!");
        }
    }
}
