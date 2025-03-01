






//void





// import java.util.Scanner;
// public class Array{


// static void array(){
//     Scanner obj=new Scanner(System.in);
//     System.out.println("Enter size:");
//     int size=obj.nextInt();
//     int arr[]=new int[size];

//     for(int i=0;i<size;i++){
//         arr[i]=obj.nextInt();
//     }

// int sum=0;
// for(int i=0;i<arr.length;i++){
//         sum+=arr[i];
//     }

//     System.out.print(sum);
//     }







//    public static void main(String args[]){
//    array();
// }

// }








//Return type:

// import java.util.Scanner;
// public class Array{

// static int array(){
 
//  Scanner obj=new Scanner(System.in);


//     System.out.println("Enter size:");
//     int size=obj.nextInt();
//     int arr[]=new int[size];

//     for(int i=0;i<size;i++){
//         arr[i]=obj.nextInt();
//     }

// int sum=0;
// for(int i=0;i<arr.length;i++){
//         sum+=arr[i];
//     }

    
//     return sum;
//     }














// public static void main(String args[]){
// System.out.println(array());
// }
// }





//With parameter:


import java.util.Scanner;
public class Array{

static boolean sums(int arr[]){
 int sum=0;
for(int i=0;i<arr.length;i++){
        sum+=arr[i];
    }

    System.out.print(sum);
    return true;
    }



public static void main(String args[]){

Scanner obj=new Scanner(System.in);

System.out.println("Enter size:");

int size=obj.nextInt();

int arr[]=new int[size];

 for(int i=0;i<size;i++){
        arr[i]=obj.nextInt();
    }


sums(arr);
}
}