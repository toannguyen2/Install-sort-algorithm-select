package app;

public class SelectionSort {
	public static void selectionSort(double[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			/* Find the minimum in the i to length-1 */
			double currentMin = list[i];
			int currentMinIndex = i;

			for (int j = i + 1; j < list.length; j++) {
				if (currentMin > list[j]) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}

			/* Arrange when a desired element is found */
			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}
		// Complexity O(n2)
	}
	public static void main(String[] args) {
		double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
		selectionSort(list);
		for (int i = 0; i < list.length; i++)
			System.out.print(list[i] + " ");
	}
}
