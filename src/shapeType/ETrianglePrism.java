package shapeType;

/**
 * Class description:
 *
 * @author Rimon Alqoshi (000807329)
 *
 */

public class ETrianglePrism extends Prism {

	/**
	 * Initializes the newly created ETriangleBase
	 * 
	 * @param height height of Triangle base
	 * @param side   side of triangle base
	 */
	public ETrianglePrism(double height, double side) {
		super(height, side);
	}

	/**
	 * calculate base area of the triangle prism
	 * 
	 * @return the base area of the triangle prism
	 */
	@Override
	public double calculateBaseArea() {
		return Math.pow(super.getSide(), 2.0) * (Math.sqrt(3) / 4);
	}

	/**
	 * calculate volume of the triangle prism
	 * 
	 * @return the volume of the triangle prism
	 */
	@Override
	public double calculateVolume() {
		return this.calculateBaseArea() * super.getHeight();
	}

	
}
