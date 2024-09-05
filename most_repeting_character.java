import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner ask=new Scanner(System.in);
    String r=ask.nextLine();
    int hash[]=new int[26];
    r=r.toLowerCase();
    for(int i=0;i<r.length();i++){
      hash[r.charAt(i)-'a']+=1;
    }
    int max=0;
    int index=0;
    for(int i=0;i<26;i++){
      if(max<=hash[i]){
        max=hash[i];
        index=i;
      }
    }
   
    System.out.printf("the most repeated character is %c in %d times",index+97,max);
}}
