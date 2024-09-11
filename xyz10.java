import java.util.*;
import java.lang.*;
class Item{
public static void main(String[] args){
    Scanner ask=new Scanner(System.in);
    String r=ask.next();
    String h="";
    int key=ask.nextInt();
    for(int i=0;i<r.length();i++){
        if(Character.isDigit(r.charAt(i))){
            int t=r.charAt(i)-'0';
            t=t+key;
            if(t>=10){
                t=t-10;
            }
            h=h+t;
            
        }
        else{
            int e=0;
            char q='a';
            if(r.charAt(i)>=97&& r.charAt(i)<=122){
                e=r.charAt(i)-q;
                int index=e+key;
                h=h+ (char)(q+index%26);
            }
            else if(r.charAt(i)>=65 && r.charAt(i)<=90){
                if(e>90){
                    h=h+ (char)(r.charAt(i)+key-26);
                }
            }
            else{
            h=h+ (char)(r.charAt(i)+key);
            }
        }
    }
    System.out.println(h);
}

}
