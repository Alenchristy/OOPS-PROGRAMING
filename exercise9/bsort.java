import java.util.Arrays;

class bsort<T extends Comparable<? super T>> {
  T[] array;
  bsort(T[] array){
    this.array = array;
  }
  
  private T[] bubbleSort(){
    for(int i = array.length; i > 1; i--){
      for(int j = 0; j < i - 1; j++){
        //if greater swap elements
        if(array[j].compareTo(array[j+1]) > 0){
          swapElements(j, array);
        }
      }            
    }
    return array;
  }
  private void swapElements(int index, T[] arr){
    T temp = arr[index];
    arr[index] = arr[index+1];
    arr[index+1] = temp;        
  }


  public static void main(String[] args) {
    Integer[] intArr = {47, 85, 62, 34, 7, 10, 92, 106, 2, 54};
    System.out.println("initial array: "+Arrays.toString(intArr));
    bsort<Integer> bsg1 = new bsort<Integer>(intArr);
    Integer[] sa1 = bsg1.bubbleSort();
    System.out.println("Sorted array- " + Arrays.toString(sa1)+"\n"); 
    
    String[] strArr = {"Earl", "Robert", "Asha", "Arthur"};
    System.out.println("initial array: "+Arrays.toString(strArr));
    bsort<String> bsg2 = new bsort<>(strArr);


    String[] sa2 = bsg2.bubbleSort();
    System.out.println("Sorted array- " + Arrays.toString(sa2));
  }
}


/*
Output

initial array: [47, 85, 62, 34, 7, 10, 92, 106, 2, 54]
Sorted array- [2, 7, 10, 34, 47, 54, 62, 85, 92, 106]

initial array: [Earl, Robert, Asha, Arthur]
Sorted array- [Arthur, Asha, Earl, Robert]

*/
