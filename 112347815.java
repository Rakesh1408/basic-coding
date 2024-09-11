import java.util.*;
class Item{
public static void main(String[] args){
    Scanner ask=new Scanner(System.in);
    int n=ask.nextInt();
    int pri=1;
    int perf=1;
    int sum=0;
    int a=1;
    int b=1;
    for(int i=3;i<=n;i++){

        if(perfectsquare(i)){
            perf=perf*3;
            sum=perf;
            b=a;
            a=sum;
            
        }
        else if(prime(i)){
            pri=2*pri;
            sum=pri;
            b=a;
            a=sum;
         }
         else{
            sum=a+b;
            b=a;
            a=sum;
            
         }

    }
    System.out.println(sum);
}
public static boolean prime(int n){
    for(int i=2;i<=n/2;i++){
        if(n%i==0){
            return false;
        }
    }
    return true;
}
public static boolean perfectsquare(int n){
    int i=1;
    while(i<n){
        if(n==i*i){
            return true;
        }
      i=i+1;
    }
    return false;
}
}
