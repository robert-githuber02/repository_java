package Arrays;

public class Arrays_practice2 {
    public static void main(String[] args) {
        String[] names = {"Anna", "John", "Alice", "Bob", "Daisy", "Serena"};

        System.out.println("Is name Lucy in the array? - " + search(names, "Lucy"));
        System.out.println("Is name Serena in the array? - " + search(names, "Serena"));
        System.out.println("Is name Bob in the array? - " + search(names, "Bob"));
        System.out.println("Is name Mark in the array? - " + search(names, "Mark"));
        System.out.println("Is name daisy in the array? - " + search(names, "daisy"));
//        int [] arr = new int [5];
//        Scanner console = new Scanner(System.in);
//        for(int i=0 ; i<arr.length ; i++){
//            arr[i] = console.nextInt();
//        }
//        System.out.println(search(arr,4));
    }
//    public static boolean search(int [] arr, int value){
//        for(int i=0;i < arr.length;i++){
//            if(arr[i] == value){
//                return true;
//            }
//        }
//        return false;
//    }
    public static boolean search(String [] str,String str_value){
        for(int i=0;i<str.length;i++){
            if(str[i].equals(str_value)){
                return true;
            }
        }
        return false;
    }
}
