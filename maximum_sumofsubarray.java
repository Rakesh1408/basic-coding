import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner ask=new Scanner(System.in);
    int n=ask.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=ask.nextInt();
    }
    int i=1;
    int sum=arr[0];
    int max=0;
    int maximum=0;
    while(i<n){
      if(sum<0){
        sum=0;
      }
      if(sum+arr[i]>0){
        sum=sum+arr[i];
        max=sum;
      }
      else{
        sum=0;
      }
      if(maximum<max){
        maximum=max;;
      }

      i++;
    }
    System.out.println(maximum);

}}

