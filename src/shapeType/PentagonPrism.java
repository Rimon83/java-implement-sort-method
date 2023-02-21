package shapeType;

/**
 * Class description:
 *
 * @author Rimon Alqoshi (000807329)
 *
 */

public class PentagonPrism extends Prism {

	/**
	 * Initializes the newly created PentagonBase
	 * 
	 * @param height height of pentagon base
	 * @param side   side of pentagon base
	 */
	public PentagonPrism(double height, double side) {
		super(height, side);
	}

	/**
	 * calculate base area of the pentagon base
	 * 
	 * @return the base area of the pentagon base
	 */
	@Override
	public double calculateBaseArea() {
		return 5 * Math.pow(super.getSide(), 2.0) * (Math.tan(Math.toRadians(54)) / 4);
	}

	/**
	 * calculate volume of the pentagon base
	 * 
	 * @return the volume of the pentagon base
	 */
	@Override
	public double calculateVolume() {
		return this.calculateBaseArea() * super.getHeight();
	}
	
	

}
