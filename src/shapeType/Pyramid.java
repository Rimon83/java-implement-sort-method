package shapeType;

/**
 * Class description:
 *
 * @author Rimon Alqoshi (000807329)
 *
 */

public class Pyramid extends Shape {

	/**
	 * declare side field of pyramid
	 */
	private double side;

	/**
	 * Initializes the newly created Cylinder
	 * 
	 * @param height height of pyramid
	 * @param side   side of pyramid
	 */
	public Pyramid(double height, double side) {
		super(height);
		this.side = side;
	}

	/**
	 * calculate base area of the pyramid
	 * 
	 * @return the base area of the pyramid
	 */
	@Override
	public double calculateBaseArea() {
		return Math.pow(side, 2.0);
	}

	/**
	 * calculate volume of the pyramid
	 * 
	 * @return the volume of the pyramid
	 */
	@Override
	public double calculateVolume() {
		return ((double) 1 / 3) * Math.pow(side, 2.0) * super.getHeight();
	}

	/**
	 * @return the side
	 */
	public double getSide() {
		return side;
	}

	/**
	 * @param side the side to set
	 */
	public void setSide(double side) {
		this.side = side;
	}

	public String toString() {
		return "Height: "+super.getHeight()+
				"\nside: "+side+
				"\nBase Area: "+this.calculateBaseArea()+
				"\nVolume: "+this.calculateVolume();
	}
	
}
