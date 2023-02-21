package appDriver;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import Utilities.*;
import shapeType.*;

/**
 * Class description:
 *
 * @author Rimon Alqoshi (000807329)
 *
 */

public class Driver {

	/**
	 * @param args type of args -f, -t, -s
	 */
	public static void main(String[] args) {

		String fileName = null;
		char typeInput = 0;
		char sortInput = 0;
		Shape[] shapes = null;
		long start;
		long end;

		// get the key value from args input -f, -t, -s
		for (int i = 0; i < args.length; i++) {
			if (args[i].contains("f") || args[i].contains("F"))
				fileName = args[i].substring(2, args[i].length());
			else if (args[i].contains("t") || args[i].contains("T"))
				typeInput = args[i].charAt(2);
			else
				sortInput = args[i].charAt(2);
		}

		try {
			shapes = readShapes(fileName);
			Comparator<Shape> com = getComparator(typeInput);
			start = System.currentTimeMillis();
			sortShapes(shapes, sortInput, com);
			end = System.currentTimeMillis();

			displayOutput(shapes, start, end);

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}

	/**
	 * read the file and get the the size of array, create objects of shape class,
	 * and return array of objects
	 * 
	 * @param fileName name of file
	 * @return array of objects
	 * @throws FileNotFoundException throw if the file doesn't exist
	 */
	public static Shape[] readShapes(String fileName) throws FileNotFoundException {
		String shapeName;
		double value1;
		double value2;
		int index = 0;
		File file = new File(fileName);
		Scanner scanner = new Scanner(file);

		// get first integer in file, it is the number of shapes to create array.
		int shapesNum = scanner.nextInt();
		// create shapes array
		Shape[] shapes = new Shape[shapesNum];

		while (scanner.hasNext()) {

			shapeName = scanner.next();
			value1 = scanner.nextDouble();
			value2 = scanner.nextDouble();

			switch (shapeName) {

			case "Cone":
				shapes[index] = new Cone(value1, value2);
				break;
			case "Cylinder":
				shapes[index] = new Cylinder(value1, value2);
				break;
			case "OctagonalPrism":
				shapes[index] = new OctagonPrism(value1, value2);
				break;
			case "PentagonalPrism":
				shapes[index] = new PentagonPrism(value1, value2);
				break;
			case "Pyramid":
				shapes[index] = new Pyramid(value1, value2);
				break;
			case "SquarePrism":
				shapes[index] = new SquarePrism(value1, value2);
				break;
			case "TriangularPrism":
				shapes[index] = new ETrianglePrism(value1, value2);
				break;
			default:
				System.out.print("shape did not match any of our cases");

			}
			index++;
		}
		scanner.close();

		return shapes;
	}

	/**
	 * call the correct type of comparison based on type input character where h:
	 * height, v: volume, a: base area
	 * 
	 * @param typeInput the type that determine the comparison
	 * @return object of Comparator interface
	 */
	public static Comparator<Shape> getComparator(char typeInput) {
		switch (typeInput) {
		case 'h':
		case 'H':
			System.out.println("sort by Height");
			return null;
		case 'a':
		case 'A':
			System.out.println("sort by Base Area");
			return new AreaComparator<Shape>();
		case 'v':
		case 'V':
			System.out.println("sort by Volume");
			return new VolumeComparator<Shape>();
		default:
			return null;

		}
	}

	/**
	 * call the correct sorting based on sort input character where b: bubble sort,
	 * i insertion sort, s: selection sort, m: merge sort, q: quick sort, z: heap
	 * sort
	 * 
	 * @param shapes    array of Shape objects
	 * @param sortInput the sort type that is accepted as args
	 * @param com       type of comparison
	 */
	public static void sortShapes(Shape[] shapes, char sortInput, Comparator<Shape> com) {
		if (com != null) {
			switch (sortInput) {
			case 'b':
			case 'B':
				System.out.println("Bubble Sort\n");
				Array.bubbleSort(shapes, com);
				break;

			case 'i':
			case 'I':
				System.out.println("Insertion Sort\n");
				Array.insertionSort(shapes, com);
				break;

			case 's':
			case 'S':
				System.out.println("Selection Sort\n");
				Array.selectionSort(shapes, com);
				break;

			case 'm':
			case 'M':
				System.out.println("Merge Sort\n");
				Array.mergeSort(shapes, com);
				break;

			case 'q':
			case 'Q':
				System.out.println("Quick Sort\n");
				Array.quickSort(shapes, com);
				break;

			case 'z':
			case 'Z':
				System.out.println("Heap Sort\n");
				Array.heapSort(shapes, com);
				break;

			default:
				System.out.println("Invalid sort input.");

			}

		} else {
			switch (sortInput) {
			case 'b':
			case 'B':
				System.out.println("Bubble Sort\n");
				Array.bubbleSort(shapes);
				break;

			case 'i':
			case 'I':
				System.out.println("Insertion Sort\n");
				Array.insertionSort(shapes);
				break;

			case 's':
			case 'S':
				System.out.println("Selection Sort\n");
				Array.selectionSort(shapes);
				break;

			case 'm':
			case 'M':
				System.out.println("Merge Sort\n");
				Array.mergeSort(shapes);
				break;

			case 'q':
			case 'Q':
				System.out.println("Quick Sort\n");
				Array.quickSort(shapes);
				break;

			case 'z':
			case 'Z':
				System.out.println("Heap Sort\n");
				Array.heapSort(shapes);
				break;

			default:
				System.out.println("Invalid sort input.");

			}

		}
	}

	/**
	 * prints the first sorted value and last sorted value, and every thousandth
	 * value in between.
	 * 
	 * @param shapes array of objects of Shape class
	 * @param start  the time when the program start sorting
	 * @param end    the time when the program end sorting
	 */
	public static void displayOutput(Shape[] shapes, long start, long end) {
		for (int i = 0; i < shapes.length - 1; i += 1000) {
			System.out.println(shapes[i] + "\n");
		}
		System.out.println(shapes[shapes.length - 1] + "\n");

		System.out.printf("Time took: %4d ms", (end - start));
	}

}
