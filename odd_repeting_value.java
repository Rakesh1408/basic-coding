import java.util.*;
class Main{
  public static int oddrepvalue(int []r){
    int []k= new int[10];
    int s=-1;
    for(int i=0;i<r.length;i++){
      k[r[i]]+=1;
    }
    for(int i=0;i<k.length;i++){
      if(k[i]%2!=0){
        return i;
      }
    }
    return s;
  }
  public static void main(String[] args){
    Scanner ask=new Scanner(System.in);
    int n=ask.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=ask.nextInt();
    }
    int j=oddrepvalue(arr);
    System.out.println(j);
  }
}
