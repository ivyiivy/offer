public class ReverseSentence {
    public String ReverseSentence(String str) {
        if(str==null||str.length()==0||str.trim().length()==0)
            return str;

        str=Reverse(str);
        String string = "";
        String [] s=str.split(" ");
        for(int i=0;i<s.length-1;i++){
            string=string+Reverse(s[i])+" ";
        }
        string=string+Reverse(s[s.length-1]);
        return string;

    }

    private String Reverse(String str){
        String string="";
        for(int i=str.length()-1;i>=0;i--){
            string+=str.charAt(i);
        }
        return string;

    }

}