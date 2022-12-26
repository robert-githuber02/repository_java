package Arrays;

import java.util.Scanner;

public class Arrays_practice {
    public static void main(String[] args) {
        int [] arr = new int [5];
        Scanner console = new Scanner(System.in);
        for(int i=0 ; i<arr.length ; i++){
            arr[i] = console.nextInt();
        }
        dublare(arr);
        afisare(arr);
//        int [] arr = new int [5];
////        arr[0]=5;
////        arr[1]=10;
////        arr[2]=15;
////        System.out.println(arr[0]);
////        System.out.println(arr[1]);
////        System.out.println(arr[2]);
//        int counter = 0;
//        for(int i=0;i<arr.length;i++){
//            Scanner console = new Scanner(System.in);
//            arr[i] = console.nextInt();
//            if(arr[i] % 2 == 0){
//                counter++;
//            }
//        }
//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i] + " ");
//        }
//        System.out.print("Nmarul numerelor pare este:" + counter);
//        Scanner console = new Scanner(System.in);
//        int dimension = console.nextInt();
//        int [] arr = new int [dimension];
//        for(int i=0;i<arr.length;i++){
//            arr[i] = console.nextInt();
//        }
//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i] + " ");
//        }
    }
    public static int [] dublare(int [] arr){
        for(int i = 0;i<arr.length;i++){
            arr[i] *= 2;
        }
        return arr;
    }
    public static void afisare(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
