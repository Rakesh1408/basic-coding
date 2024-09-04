import java.util.*;
class Main{
  public static int[] Panagram(String name){
    name=name.toLowerCase();
    name=name.replaceAll(" ","");
    int []hash=new int[26];
    for(int i=0;i<name.length();i++){
      hash[name.charAt(i)-'a']+=1;
    }
   
    return hash;
  }
  public static void main(String[] args){
    Scanner ask=new Scanner(System.in);
    String name1=ask.nextLine();
    String name2=ask.nextLine();

    int ans1[]=Panagram(name1);
    int ans2[]=Panagram(name2);
    boolean r=true;
    for(int i=0;i<ans1.length;i++){
      if(ans1[i]!=ans2[i]){
        r=false;
        break;
      }
      
    }
    if(r){
      System.out.println("it is a anagram");
    }
    else{
      System.out.println("it is not a anagram");
    }

  }
}
