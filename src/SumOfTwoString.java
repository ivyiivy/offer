import java.util.HashMap;

public class SumOfTwoString {
    public static void main(String[] args) {
       sum(new StringBuilder("1"),new StringBuilder("9999"));
       String s = "";
       System.out.print(s.length());

    }

    public static void sum(StringBuilder s1,StringBuilder s2){
        if(s1.length()==0){
            System.out.println(s2);
        }
        if(s2.length()==0){
            System.out.println(s1);
        }

        if(s1.length()<s2.length()){
            StringBuilder tmp=s1;
            s1=s2;
            s2=tmp;
        }
        int i=s1.length()-1;
        int j=s2.length()-1;
        int count=0;
        while(i>=0&&j>=0){
            int sum=s1.charAt(i)-'0'+s2.charAt(j)-'0'+count;
            count=sum/10;
            sum=sum%10;
            s1.setCharAt(i,(char)(sum+'0'));
            i--;
            j--;
        }

        while (count>0&&i>=0){
            int sum=s1.charAt(i)-'0'+count;
            count=sum/10;
            sum=sum%10;
            s1.setCharAt(i,(char)(sum+'0'));
            i--;
        }
        if (count>0){
            s1.insert(0,count);
        }

        System.out.println(s1);
    }
}