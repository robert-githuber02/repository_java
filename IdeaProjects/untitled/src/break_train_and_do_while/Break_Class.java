package break_train_and_do_while;

public class Break_Class {
    public static void main(String[] args) {
        // intervalul [left, right] (se putea citi de la tastatura)
//        int left = 10, right = 30;
////left = 2; right = 3;
////left = 10; right = 5;
////left = 8; right = 14;
//
//// memoreaza cate numere au fost afisate
//        int counter = 0;
//
//        for (int i = left; i <= right; i++) {
//            System.out.print(i + " ");
//            counter++;
//
//            if (counter == 5) {
//                break;///forteaza oprirea programului
//            }
//        }
//
//        System.out.println();
//        System.out.println("Au fost afisate " + counter + " numere naturale.");
//        int it = 10;
//
//        while (true) {
//            if (it > 15 && (it % 2 == 1)) {
//                    System.out.println("Next, 'break' will be executed.");
//                    break;
//            }
//
//            System.out.println("The current value of 'it' is: " + it);
//            it++;
//        }
//        System.out.println("Reached the end of the loop");
            //outer loop
//            for(int i=1;i<=3;i++){
//                //inner loop
//                for(int j=1;j<=3;j++){
//                    if(i==2&&j==2){
//                        //using break statement inside the inner loop
//                        break;
//                    }
//                    System.out.println(i+" "+j);
//                    ///11
//                    ///12
//                    ///13
//                    ///21
//                    ///22
//                    ///23
//
//          }
        //while loop
        int i=1;
        while(i<=10){
            if(i==5){
                //using break statement
                i++;
                break;//it will break the loop
            }
            System.out.println(i);
            i++;
        }
    }
        }
