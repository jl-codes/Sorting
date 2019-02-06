import java.util.*;
 
public class Sorting {

	public static void main(String[] args) throws InterruptedException {
 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int n = input.nextInt(); 

		

		// Call incuded sorting methods
		//stopwatch - start
		
//		System.out.println("QuickSort: ");
//		for (int i = 0; i < 1000; i++) {
//			long startTime = System.nanoTime();
//			QuickSort q = new QuickSort();
//			//System.out.println(Arrays.toString(q.start(generateRandomArray(100))));
//			long endTime = System.nanoTime();
//			long timeElapsed = endTime - startTime;
//			System.out.println("QuickSort run time in nanoseconds: " + timeElapsed);
//		}

		System.out.println("CountingSort: ");
		for (int i = 0; i < 1000; i++) {
			long startTime = System.nanoTime();
			CountingSort c = new CountingSort();
			//System.out.println(Arrays.toString(c.sort(generateRandomArray(100))));
			long endTime = System.nanoTime();
			long timeElapsed = endTime - startTime;
			System.out.println("CountingSort run time in nanoseconds: " + timeElapsed);
		}
		
//		System.out.println("BucketSort: ");
//		for (int i = 0; i < 1000; i++) {
//			long startTime = System.nanoTime();
//			BucketSort b = new BucketSort();
//			//System.out.println(Arrays.toString(b.start(generateRandomArray(100))));
//			long endTime = System.nanoTime();
//			long timeElapsed = endTime - startTime;
//			System.out.println("BucketSort run time in nanoseconds: " + timeElapsed);
//		}

//		System.out.println("InsertionSort: ");
//		for (int i = 0; i < 1000; i++) {
//			long startTime = System.nanoTime();
//			InsertionSort in = new InsertionSort();
//			//System.out.println(Arrays.toString(in.start(generateRandomArray(100))));
//			long endTime = System.nanoTime();
//			long timeElapsed = endTime - startTime;
//			System.out.println("InsertionSort run time in nanoseconds: " + timeElapsed);
//		}
		
//		System.out.println("RadixSort: ");
//		for (int i = 0; i < 1000; i++) {
//			long startTime = System.nanoTime();
//			RadixSort r = new RadixSort();
//			//System.out.println(Arrays.toString(r.start(generateRandomArray(100))));
//			long endTime = System.nanoTime();
//			long timeElapsed = endTime - startTime;
//			System.out.println("RadixSort run time in nanoseconds: " + timeElapsed);
//		}
 
	}

	public static int[] generateRandomArray(int n) {
			int[] list = new int[n];
			Random random = new Random();

			for (int i = 0; i < n; i++)
			{
	    			//list.add(random.nextInt(100));
				list[i] = random.nextInt(100);
			}
   		return list;
		}  

}
