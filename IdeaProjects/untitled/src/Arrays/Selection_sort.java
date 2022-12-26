package Arrays;

class Selection_sort {
    void sort(String [] arr){
        for(int i=0;i<arr.length-1;i++){
            int min_idx=i;
            for(int j=i+1;j<arr.length;j++)
                if(arr[j].compareTo(arr[min_idx])>0){
                    min_idx=j;
                }
            String temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
    void afisare(String [] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i] + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        Selection_sort sort = new Selection_sort();
        String arr[]={"Anna", "John", "Alice", "Bob", "Daisy", "Serena"};
        sort.sort(arr);
        sort.sort(arr);
    }
}
