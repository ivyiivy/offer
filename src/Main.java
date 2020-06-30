import java.util.Scanner;
import java.util.ArrayList;

    public class Main {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int num=in.nextInt();
            int count=0;
            for (int i = 0; i <32 ; i++) {
                if(num%2==1) {
                    count++;
                }
                num=num>>1;
            }
            System.out.println(count);



        }


    }