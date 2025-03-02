

// Non return type

// import java.util.Scanner;
// public class Dup{
//     static void dup(){
//         Scanner obj=new Scanner (System.in);
//         System.out.println("Enter size :");
//         int size=obj.nextInt();
//         int [] arr=new int [size];
//         for(int i=0;i<size;i++){
//             arr[i]=obj.nextInt();
//         }
//         for(int i=0;i<arr.length;i++){
//             boolean dupli=false;
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[i]==arr[j]){
//                     arr[j]=-1;
//                     dupli=true;
//                 }

//             }
//             if(dupli && arr[i]!=-1){
//                 System.out.println(arr[i]);
//             }
//         }

//     }
//     public static void main(String args[]){
        

//         dup();
//     }
// }





// Return type


// import java.util.Scanner;
// public class Dup{
//     static int dup(){
//         Scanner obj=new Scanner (System.in);
//         System.out.println("Enter size :");
//         int size=obj.nextInt();
//         int [] arr=new int [size];
//         for(int i=0;i<size;i++){
//             arr[i]=obj.nextInt();
//         }
//         for(int i=0;i<arr.length;i++){
//             boolean dupli=false;
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[i]==arr[j]){
//                     arr[j]=-1;
//                     dupli=true;
//                 }

//             }
//             if(dupli && arr[i]!=-1){
//                 System.out.println(arr[i]);
//             }
//         }

//         return 0;

//     }
//     public static void main(String args[]){
        

//     dup();
//     }
// }





// Boolean 



// import java.util.Scanner;
// public class Dup{
//     static boolean dup(){
//         Scanner obj=new Scanner (System.in);
//         System.out.println("Enter size :");
//         int size=obj.nextInt();
//         int [] arr=new int [size];
//         for(int i=0;i<size;i++){
//             arr[i]=obj.nextInt();
//         }
//         for(int i=0;i<arr.length;i++){
//             boolean dupli=false;
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[i]==arr[j]){
//                     arr[j]=-1;
//                     dupli=true;
//                 }

//             }
//             if(dupli && arr[i]!=-1){
//                 System.out.println(arr[i]);
//             }
//         }

//         return true;

//     }
//     public static void main(String args[]){
        

//     dup();
//     }
// }





// With parameter 



import java.util.Scanner;
public class Dup{
    static boolean dup(int arr[]){
       
        for(int i=0;i<arr.length;i++){
            boolean dupli=false;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[j]=-1;
                    dupli=true;
                }

            }
            if(dupli && arr[i]!=-1){
                System.out.println(arr[i]);
            }
        }

        return true;

    }
    public static void main(String args[]){
         Scanner obj=new Scanner (System.in);
        System.out.println("Enter size :");
        int size=obj.nextInt();
        int [] arr=new int [size];
        for(int i=0;i<size;i++){
            arr[i]=obj.nextInt();
        }

    dup(arr);
    }
}