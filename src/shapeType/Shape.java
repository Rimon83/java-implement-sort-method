package shapeType;

/**
 * Class description:
 *
 * @author Rimon Alqoshi (000807329)
 *
 */

public abstract class Shape implements Comparable<Shape> {

	/**
	 * declare height field for all shapes that are inherited
	 */
	private double height;
	
	/**
	 * 
	 * Initializes the newly created Shape
	 * @param height height of the shape
	 */
	public Shape(double height) {
		this.height = height;
	}

	/**
	 * Compares shapes based on their height
	 * 
	 * @param o object of Shape
	 * @return integer number of the difference between the two shapes heights.
	 */
	@Override

	public int compareTo(Shape o) {
		if (this.getHeight() > o.getHeight())
			return 1;
		else if (this.getHeight() < o.getHeight())
			return -1;
		else
			return 0;

	}

	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * 
	 * @return the base area of shape
	 */
	public abstract double calculateBaseArea();

	/**
	 * 
	 * @return the volume of shape
	 */
	public abstract double calculateVolume();

	
}
