package Arrays;

class Bubble_sort {
    public static void main(String[] args) {
        Bubble_sort ob = new Bubble_sort();
        String arr[] = {"Anna", "John", "Alice", "Bob", "Daisy", "Serena"};
        ob.BubbleSort(arr);
        ob.printArray(arr);
        }
        void BubbleSort(String [] arr){
        for(int i=1;i<arr.length;i++)
            for(int j=1;j<arr.length-i-1;j++)
                if(arr[j].compareTo(arr[j + 1])>0){
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
        }
        void printArray(String[] arr){
        for(int i=1;i<arr.length;i++)
            System.out.print(arr[i] + " ");
            System.out.println();
        }
        }
