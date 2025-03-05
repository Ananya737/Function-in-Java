import java.util.Scanner;
public class Kth{

    static void largest(){
        Scanner obj=new Scanner (System.in);
        System.out.println("Enter size: ");
        int size=obj.nextInt();

         System.out.println("Enter kth value: ");
        int k=obj.nextInt();

        
   
        int arr[]=new int[size];

    for (int i=0;i<size;i++){
        arr[i]=obj.nextInt();
    }


for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
           
        }


        System.out.print(arr[k-1]);

        

       
    }

    



    





    public static void main(String agrs[]){
    largest();

    }
}