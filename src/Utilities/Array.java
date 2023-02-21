package Utilities;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Class description:
 *
 * @author Rimon Alqoshi (000807329)
 *
 */

public class Array {

	/**
	 * selection sort using Comparable interface
	 * 
	 * @param <T>   type of class
	 * @param array array array of any type of objects
	 */
	public static <T extends Comparable<? super T>> void selectionSort(T array[]) {
		int length = array.length;
		int maxIndex;
		for (int i = 0; i < length - 1; i++) {

			// determine the index with maximum value in array
			maxIndex = i;

			// loop to compare the maximum value with all values in array
			for (int j = i + 1; j < length; j++) {
				if (array[j].compareTo(array[maxIndex]) > 0) {
					maxIndex = j;
				}
			}
			// swap the the elements
			T temp = array[i];
			array[i] = array[maxIndex];
			array[maxIndex] = temp;
		}
	}

	/**
	 * selection sort using comparator interface
	 * 
	 * @param <T>   class type
	 * @param array array of any type of objects
	 * @param com   comparator object
	 */
	public static <T> void selectionSort(T array[], Comparator<T> com) {
		int length = array.length;
		int maxIndex;
		for (int i = 0; i < length - 1; i++) {

			// determine the index with maximum value in array
			maxIndex = i;

			// loop to compare the maximum value with all values in array
			for (int j = i + 1; j < length; j++) {
				if (com.compare(array[j], array[maxIndex]) > 0) {
					maxIndex = j;
				}
			}

			// swap the the elements
			T temp = array[i];
			array[i] = array[maxIndex];
			array[maxIndex] = temp;
			
		}

	}

	/**
	 * insertion sort using Comparable interface
	 * 
	 * @param <T>   type of class
	 * @param array array of any kind of objects
	 */
	public static <T extends Comparable<? super T>> void insertionSort(T array[]) {
		int length = array.length;
		for (int i = 1; i < length; ++i) {
			T key = array[i];
			int j = i - 1;

			// move elements that are greater than key to one position
			// ahead of their current position

			while (j >= 0 && key.compareTo(array[j]) > 0) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = key;
		}
	}

	/**
	 * insertion sort using Comparator interface
	 * 
	 * @param <T>   type of class
	 * @param array array of any kind of objects
	 * @param com   Comparator object
	 */
	public static <T> void insertionSort(T array[], Comparator<T> com) {
		int length = array.length;
		for (int i = 1; i < length; ++i) {
			T key = array[i];
			int j = i - 1;

			// move elements that are greater than key to one position
			// ahead of their current position
			while (j >= 0 && com.compare(key, array[j]) > 0) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = key;
		}
	}

	/**
	 * bubble sort using Comparable interface
	 * 
	 * @param <T>   type of class
	 * @param array array of any type of objects
	 */
	public static <T extends Comparable<? super T>> void bubbleSort(T array[]) {
		int length = array.length;
		T temp;
		for (int i = 0; i < length; i++)
			for (int j = 0; j < length - 1; j++)
				if (array[j + 1].compareTo(array[j]) > 0) {

					// swap array[j+1] and array[j]
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
	}

	/**
	 * bubble sort using Comparator interface
	 * 
	 * @param <T>   type of class
	 * @param array array of any type of objects
	 * @param com   Comparator object
	 */
	public static <T> void bubbleSort(T array[], Comparator<T> com) {
		int length = array.length;
		T temp;
		for (int i = 0; i < length; i++)
			for (int j = 0; j < length - 1; j++)
				if (com.compare(array[j + 1], array[j]) > 0) {
					// swap array[j+1] and array[j]
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
	}

	/**
	 * merge sort using Comparable interface
	 * 
	 * @param <T>   type of class
	 * @param array array of any type of objects
	 */
	public static <T extends Comparable<? super T>> void mergeSort(T array[]) {
		int length = array.length;
		int midIndex = length / 2;

		// create two array to divide the original array
		T[] leftHalf = Arrays.copyOfRange(array, 0, midIndex);
		T[] rightHalf = Arrays.copyOfRange(array, midIndex, length);

		// if original array contain one element, return the array
		if (length == 1) {
			return;
		}

		// Recursive merge method to divide the arrays into smaller elements
		mergeSort(leftHalf);
		mergeSort(rightHalf);

		int leftSize = leftHalf.length;
		int rightSize = rightHalf.length;
		int lStart = 0;
		int rStart = 0;
		int sStart = 0;

		// compare two objects from right and left and put the larger value into sorted
		// array
		while (lStart < leftSize && rStart < rightSize) {
			if (leftHalf[lStart].compareTo(rightHalf[rStart]) ==1) {
				array[sStart] = leftHalf[lStart];
				lStart++;
			} else {
				array[sStart] = rightHalf[rStart];
				rStart++;
			}
			sStart++;
		}

		// loop to check if there are remaining elements in both right and left array
		while (lStart < leftSize) {
			array[sStart] = leftHalf[lStart];
			lStart++;
			sStart++;
		}

		while (rStart < rightSize) {
			array[sStart] = rightHalf[rStart];
			rStart++;
			sStart++;
		}
	}

	/**
	 * merge sort using Comparator interface
	 * 
	 * @param <T>   type of class
	 * @param array array of any types of objects
	 * @param com   Comparator object
	 */
	public static <T> void mergeSort(T array[], Comparator<T> com) {
		int length = array.length;
		int midIndex = length / 2;

		// create two array to divide the original array
		T[] leftHalf = Arrays.copyOfRange(array, 0, midIndex);
		T[] rightHalf = Arrays.copyOfRange(array, midIndex, length);

		// if original array contain one element, return the array
		if (length == 1) {
			return;
		}

		// Recursive merge method to divide the arrays into smaller elements
		mergeSort(leftHalf, com);
		mergeSort(rightHalf, com);

		int leftSize = leftHalf.length;
		int rightSize = rightHalf.length;
		int lStart = 0;
		int rStart = 0;
		int sStart = 0;

		// compare two objects from right and left and put the larger value into sorted
		// array
		while (lStart < leftSize && rStart < rightSize) {
			if (com.compare(leftHalf[lStart], rightHalf[rStart]) ==1) {
				array[sStart] = leftHalf[lStart];
				lStart++;
			} else {
				array[sStart] = rightHalf[rStart];
				rStart++;
			}
			sStart++;
		}

		// loop to check if there are remaining elements in both right and left array
		while (lStart < leftSize) {
			array[sStart] = leftHalf[lStart];
			lStart++;
			sStart++;
		}

		while (rStart < rightSize) {
			array[sStart] = rightHalf[rStart];
			rStart++;
			sStart++;
		}
	}

	/**
	 * quick sort using Comparable interface
	 * 
	 * @param <T>   type of class
	 * @param array array of any type of object
	 */
	public static <T extends Comparable<? super T>> void quickSort(T array[]) {

		quickSort(array, 0, array.length - 1);

	}

	/**
	 * recursive quickSort method for other unsorted partition of array
	 * 
	 * @param <T>       type of class
	 * @param array     array of any type of object
	 * @param lowIndex  start index of array
	 * @param highIndex end index of array
	 */
	private static <T extends Comparable<? super T>> void quickSort(T array[], int lowIndex, int highIndex) {

		if (lowIndex >= highIndex) {
			return;
		}
		int partition = quickPartition(array, lowIndex, highIndex);
		quickSort(array, lowIndex, partition - 1);
		quickSort(array, partition + 1, highIndex);

	}

	/**
	 * sort the partition of array
	 * 
	 * @param <T>       type of class
	 * @param array     array of any type of object
	 * @param lowIndex  start index of array
	 * @param highIndex end index of array
	 * @return leftPointer index
	 */
	private static <T extends Comparable<? super T>> int quickPartition(T[] array, int lowIndex, int highIndex) {
		T pivot = array[highIndex];

		int leftPointer = lowIndex;
		int rightPointer = highIndex;
		while (leftPointer < rightPointer) {
			while (array[leftPointer].compareTo(pivot) >= 0 && leftPointer < rightPointer) {
				leftPointer++;
			}
			while (array[rightPointer].compareTo(pivot) <= 0 && leftPointer < rightPointer) {
				rightPointer--;
			}

			T temp = array[leftPointer];
			array[leftPointer] = array[rightPointer];
			array[rightPointer] = temp;

		}
		T temp = array[leftPointer];
		array[leftPointer] = array[highIndex];
		array[highIndex] = temp;

		return leftPointer;

	}

	/**
	 * quick sort using Comparator interface
	 * 
	 * @param <T>   type of class
	 * @param array array of any type of object
	 * @param com   Comparator object
	 */
	public static <T> void quickSort(T array[], Comparator<T> com) {

		quickSort(array, 0, array.length - 1, com);

	}

	/**
	 * recursive quickSort method for other unsorted partition of array
	 * 
	 * @param <T>       type of class
	 * @param array     array of type of objects
	 * @param lowIndex  start index of array
	 * @param highIndex end index of array
	 * @param com       Comparator Interface
	 */
	private static <T> void quickSort(T array[], int lowIndex, int highIndex, Comparator<T> com) {

		if (lowIndex >= highIndex) {
			return;
		}
		int partition = quickPartition(array, lowIndex, highIndex, com);
		quickSort(array, lowIndex, partition - 1, com);
		quickSort(array, partition + 1, highIndex, com);

	}

	/**
	 * sort the partition of array
	 * 
	 * @param <T>       type of class
	 * @param array     array of type of objects
	 * @param lowIndex  start index of array
	 * @param highIndex end index of array
	 * @param com       Comparator interface
	 * @return leftPointer value
	 */
	private static <T> int quickPartition(T[] array, int lowIndex, int highIndex, Comparator<T> com) {
		T pivot = array[highIndex];

		int leftPointer = lowIndex;
		int rightPointer = highIndex;
		while (leftPointer < rightPointer) {

			while (com.compare(array[leftPointer], pivot) > 0 && leftPointer < rightPointer) {
				leftPointer++;
			}
			while (com.compare(array[rightPointer], pivot) < 0 && leftPointer < rightPointer) {
				rightPointer--;
			}

			T temp = array[leftPointer];
			array[leftPointer] = array[rightPointer];
			array[rightPointer] = temp;

		}

		T temp = array[leftPointer];
		array[leftPointer] = array[highIndex];
		array[highIndex] = temp;

		return leftPointer;

	}

	/**
	 * heap sort using Comparable interface
	 * 
	 * @param <T>   type of class
	 * @param array array of type of objects
	 */
	public static <T extends Comparable<? super T>> void heapSort(T array[]) {
		int length = array.length;

		// Build heap (rearrange array)
		for (int i = length / 2 - 1; i >= 0; i--)
			heapSort(array, length, i);

		// One by one extract an element from heap
		for (int i = length - 1; i > 0; i--) {
			// Move current root to end
			T temp = array[0];
			array[0] = array[i];
			array[i] = temp;

			heapSort(array, i, 0);
		}
	}

	/**
	 * overload heapSort method for recursive purpose
	 * 
	 * @param <T>    type of class
	 * @param array  array of type of objects
	 * @param length length of array
	 * @param index  index element in array
	 */
	public static <T extends Comparable<? super T>> void heapSort(T array[], int length, int index) {
		int largest = index; // Initialize largest as root
		int left = 2 * index + 1; // left part
		int right = 2 * index + 2; // right part

		// If left child is larger than root
		if (left < length && array[left].compareTo(array[largest]) < 0)
			largest = left;

		// If right child is larger than largest
		if (right < length && array[right].compareTo(array[largest]) < 0)
			largest = right;

		// If largest is not root
		if (largest != index) {
			T swap = array[index];
			array[index] = array[largest];
			array[largest] = swap;

			heapSort(array, length, largest);
		}
	}

	/**
	 * heap sort using Comparator interface
	 * 
	 * @param <T>   type of class
	 * @param array array of any type of objects
	 * @param com   Comparator object
	 */
	public static <T> void heapSort(T array[], Comparator<T> com) {
		int length = array.length;

		// Build heap (rearrange array)
		for (int i = length / 2 - 1; i >= 0; i--)
			heapSort(array, length, i, com);

		// One by one extract an element from heap
		for (int i = length - 1; i > 0; i--) {
			// Move current root to end
			T temp = array[0];
			array[0] = array[i];
			array[i] = temp;

			heapSort(array, i, 0, com);
		}
	}

	/**
	 * overload heapSort method for recursive purpose
	 * 
	 * @param <T>    type of class
	 * @param array  array of any type of objects
	 * @param length length of array
	 * @param index  index of element in array
	 * @param com    Comparator interface
	 */
	public static <T> void heapSort(T array[], int length, int index, Comparator<T> com) {
		int largest = index; // Initialize largest as root
		int left = 2 * index + 1; // left part
		int right = 2 * index + 2; // right part

		// If left child is larger than root
		if (left < length && com.compare(array[left], array[largest]) < 0)
			largest = left;

		// If right child is larger than largest
		if (right < length && com.compare(array[right], array[largest]) < 0)
			largest = right;

		// If largest is not root
		if (largest != index) {
			T swap = array[index];
			array[index] = array[largest];
			array[largest] = swap;

			heapSort(array, length, largest, com);
		}
	}
}
