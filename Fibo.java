import java.util.Scanner;
public class Fibo{


static int fibo(){
 int n=5;
int first=0;
int sec=1;
int next=0;
System.out.print(first+" "+sec+" ");

for(int i=0;i<n-2;i++){
next=first+sec;
first=sec;
sec=next;
System.out.print(next+" ")  ;
}



return next;
}

    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
fibo() ;

    }
}
