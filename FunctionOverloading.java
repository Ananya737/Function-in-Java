import java.util.Scanner;
public class FunctionOverloading{



// On the basis of number of parameters:


    // static int sum(int a,int b){
    //     return a+b;
    // }
    // static int sum(int a){   
    // return a;

    // }


// On the basis of order of datatypes:



//  static int sum(char a,int b){
//         return a+b;
//     }
//     static int sum(int a,char b){   
//     return b;

//     }


// On the basis of datatypes:


     static int sum(int a,int b){
        return a+b;
    }
    static int sum(int a,char b){   
        return b;

    }



  



    public static void main(String agrs[]){
    System.out.println(sum(5,1));
    System.out.println(sum(9,'a'));
    }
}


