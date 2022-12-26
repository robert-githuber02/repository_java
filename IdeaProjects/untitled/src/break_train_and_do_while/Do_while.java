package break_train_and_do_while;

public class Do_while {
    public static void main(String[] args) {
//        //declaring variable
//        int i=1;
//        //do-while loop
//        do{
//            if(i==5){
//                //using break statement
//                i++;
//                break;//it will break the loop
//            }
//            System.out.println(i);
//            i++;
//        }while(i<=10);
        int i = 10;

//        while (i > 11){
//            System.out.println(i);
//        }

        do{
            System.out.println(i);
        }while (i > 11);
    }
}
///diferenta dintre while si do-while este ca instructiunile din while se executa doar daca este adevarata conditia
///din while,pe cand in do-while instructiunile se executa cel putin o data chiar daca este falsa conditia