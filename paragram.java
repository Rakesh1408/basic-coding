import java.util.*;
class Main{
  public static int Panagram(String name){
    name=name.toLowerCase();
    name=name.replaceAll(" ","");
    int []hash=new int[26];
    for(int i=0;i<name.length();i++){
      hash[name.charAt(i)-'a']+=1;
    }
    for(int i=0;i<=25;i++){
      if(hash[i]== 0){
        return 0;
      }
    }
    return 1;
  }
  public static void main(String[] args){
    Scanner ask=new Scanner(System.in);
    String name=ask.nextLine();
    int ans=Panagram(name);
    if(ans==1){
      System.out.println("it is a panagram");
    }
    else{
      System.out.println("it is not a panagram");
    }
  }
}
