import java.util.Scanner;
public class Unique{
    static void unique(){
        int [] arr=new int []{1,2,3,2,3,4,5,4,5,1,6,9,8};
        for(int i=0;i<arr.length;i++){
            boolean dupli=false;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[j]=-1;
                    dupli=true;
                }

            }
            if(!dupli && arr[i]!=-1){
                System.out.println(arr[i]);
            }
        }

    }
    public static void main(String args[]){
        Scanner obj=new Scanner (System.in);

        unique();
    }
}