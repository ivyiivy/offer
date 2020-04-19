import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int [] a=new int[n];
        for (int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        Arrays.sort(a);
        int pos=-1;
        int count=0;
        for (int i=0;i<n;i++){
            if (a[i]==k){
                pos=i;
                break;
            }
        }
        if (pos!=-1){
            if ((n%2==0)&&pos==(n/2-1)){
                System.out.println(0);
                return;
            }
            else if ((n%2!=0)&&pos==(n/2)){
                System.out.println(0);
                return;
            }
            else if (n%2==0&&pos<(n/2-1)){

            }
        }
    }
}


//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Main{
//    public static void  main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n=in.nextInt();
//        int k=in.nextInt();
//        int [] a=new int[n];
//        for (int i=0;i<n;i++){
//            a[i]=in.nextInt();
//        }
//        Arrays.sort(a);
//        int i=k/n;
//        int j=k%n;
//        if (j==0){
//        System.out.println("("+a[i-1]+","+a[n-1]+")");
//        }
//        else {
//            System.out.println("("+a[i]+","+a[j-1]+")");
//        }
//    }
//}


//import java.util.HashSet;
//import java.util.Scanner;
//
//public class Main{
//        public static void main(String[] args){
//            Scanner in =new Scanner(System.in);
//            int n= in.nextInt();
//            int m= in.nextInt();
//            int [][]a =new int[n][m];
//            for (int i=0;i<n;i++){
//                for (int j=0;j<m;j++){
//                    a[i][j]=in.nextInt();
//                }
//            }
//
//
//            int max;
//            HashSet<Integer> set=new HashSet<>();
//            for(int j=0;j<m;j++){
//                max=0;
//                for (int i=0;i<n;i++){
//                    if (max<a[i][j]){
//                        max=a[i][j];
//                    }
//                }
//                for (int i=0;i<n;i++){
//                    if (max==a[i][j]&&!set.contains(i)){
//                        set.add(i);
//                    }
//                }
//            }
//            System.out.println(set.size());
//
//        }
//    }