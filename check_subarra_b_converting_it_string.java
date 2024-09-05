import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner ask=new Scanner(System.in);
    int n=ask.nextInt();
    int arr= ask.nextInt();
    String r="";
    String b="";
    int i=n;
    while(i>0){
      int rem=i%10;
      r=r+rem;  
      i=i/10;
    }
    System.out.println(r);
    i=arr;
    while(i>0){
      int rem=i%10;
      b=b+rem;  
      i=i/10;
    }
    System.out.println(r.contains(b));
  }
}
