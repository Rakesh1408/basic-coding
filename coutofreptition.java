import java.util.*;
class Main{
  public static int reptition(int n){
    int[] arr=new int[10];
    int rem=0;
    while(n>0){
      rem=n%10;
      arr[rem]+=1;
      if(arr[rem]>1){
        return 0;
      }
      n=n/10;
    }
    return 1;
  }
  public static void main(String[] args){
    Scanner ask=new Scanner(System.in);
    int start=ask.nextInt();
    int end=ask.nextInt();
    int count=0;
    for(int i=start;i<=end;i++){
      if(reptition(i)==0){
        count++;
      }
    }
    System.out.println(count);
  }
}
