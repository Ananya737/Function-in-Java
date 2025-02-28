import java.util.Scanner;
public class Array{

// Sum of elements:

   static void array(){
    int [] arr=new int[]{1,2,3,4,5};
    int sum=0;
    for(int i=0;i<arr.length;i++){
        sum+=arr[i];
    }
    System.out.print(sum);
    }

    public static void main(String args[]){
    Scanner obj=new Scanner(System.in);

    array();


   } 
}