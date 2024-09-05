import java.util.*;
class Solution {
    public String reverseWords(String s) {
        int left=0;
        int rigth;
        String m="";
        char[] s1=s.toCharArray();
        for(int i=0;i<s1.length;i++){
            if(s1[i]==' '){
                r(s1,left,i-1);
                left=i+1;
            }
            
        }
        r(s1,left,s1.length-1);
        for(int i=0;i<s1.length;i++){
            m=m+s1[i];
        }
        return m;
    }
    public char[] r(char t[],int left,int rigth){
        char temp;
        for(int i=0;i<t.length/2;i++){
             temp=t[left];
            t[left]=t[rigth];
            t[rigth]=temp;
        }
        return t;
    }
}
