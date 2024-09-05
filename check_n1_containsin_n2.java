import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner ask=new Scanner(System.in);
    int n=ask.nextInt();
    int arr= ask.nextInt();
    boolean e=true;
    int count=1;
    int i=arr;
    while(i>0){
      count=count*10;
      i=i/10;
    }
    
    i=n;
    while(i>0){
      int rem=i%count;
      if(arr==rem){
        e=false;
        break;
      }
      else{
        i=i/10;
      }
    }
    if(e){
      System.out.println("it is not asubnumber");
    }
    else{
      System.out.println("it is a sub number");
    }
  }
}
