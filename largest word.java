import java.util.*;

class Item{
public static void main(String[] args){
    Scanner ask=new Scanner(System.in);
    String r=ask.nextLine();
    char[] s=r.toCharArray();
    int count=0;
    int max=0;
    for(int i=0;i<s.length;i++){
        if(s[i]!=' '){
            count=count+1;
        }
        else{
            if(count>max){
                max=count;
                
            }
            count=0;
        }
    }
    if(max==0){
        System.out.println(s.length);
    }
    else{
    System.out.println(max);}
}

}
