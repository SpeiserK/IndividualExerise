import java.util.Arrays;

public class base2 {
	public static void main(String [] args) {
		int [] arr1 = new int[10];
		int sum = 0;
		for(int i=0;i<arr1.length;i++) {
			
			int rand = ((int) (Math.random()*100));
			arr1[i] = rand;
			sum = sum + rand;
		}
		System.out.println("Here's an array: ");
		for(int j=0;j<arr1.length;j++) {
			System.out.print(arr1[j]+" ");
		}
		average(arr1,sum);
	}
	static void average(int[] array, int sum1) {
		int above = 0;
		int avg = sum1/10;
		System.out.println("\n");
		System.out.println("The average of the array is: ("+avg+")");
		for(int k = 0;k<array.length;k++) {
			if(array[k]>avg) {
				above++;
			}
		}
		System.out.println("There are "+above+" numbers above the average");
	}
}
