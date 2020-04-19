public class replaceSpace {

    public String replaceSpace(StringBuffer str) {
        if (str==null){
            return null;
        }
        int spaceNum=0;
        for (int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                spaceNum++;
            }
        }
        int len1=str.length();
        int len2=len1+spaceNum*2;
        int i=len1-1;
        int j=len2-1;
        str.setLength(len2);
        while(j>i&&i>=0){
            if (str.charAt(i)==' '){
                str.replace(j-2,j+1,"%20");
                j=j-3;
                i=i-1;
            }
            else {
                str.setCharAt(j,str.charAt(i));
                j--;
                i--;
            }
        }
        return str.toString();
    }

}
