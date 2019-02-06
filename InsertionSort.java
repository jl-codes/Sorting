public class InsertionSort {
 
   public int[] sort(int n) {
      int[] array = new int[n];
 
//      System.out.print("Before:  " );
//      for(int x: array) { 
//         System.out.print(x + " ");
//      }
//      System.out.println(" ");
 
      int tmp;
      for (int i = 1; i < array.length; i++) {
         for(int j = i ; j > 0 ; j--) {
            if(array[j] < array[j-1]) {
               tmp = array[j];
               array[j] = array[j-1];
               array[j-1] = tmp;
            }
         }
//         System.out.print("pass " + i + ":  " );
//         for(int x: array) {
//            System.out.print(x + " ");
//         }
//         System.out.println(" ");
      }
	return array;
//      System.out.println("Done");
   }
}
