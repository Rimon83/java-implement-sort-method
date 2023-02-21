package shapeType;

/**
 * Class description:  
 *
 * @author Rimon Alqoshi (000807329)
 *
 */

public class SquarePrism extends Prism {

	/**
	 * Initializes the newly created SquarePrism
	 * @param height height of square prism
	 * @param side side of square prism
	 */
	public SquarePrism(double height, double side) {
		super(height, side);

	}

	/**
	 * calculate base area of the square prism
	 * 
	 * @return the base area of the square prism
	 */
	@Override
	public double calculateBaseArea() {
		return Math.pow(super.getSide(), 2.0);
	}

	/**
	 * calculate volume of the square prism
	 * 
	 * @return the volume of the square prism
	 */
	@Override
	public double calculateVolume() {
		return Math.pow(super.getSide(), 2.0) * super.getHeight();
	}


}
