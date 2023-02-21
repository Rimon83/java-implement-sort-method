package shapeType;

/**
 * Class description:  
 *
 * @author Rimon Alqoshi (000807329)
 *
 */

public class OctagonPrism extends Prism {

	/**
	 * Initializes the newly created OctagonBase
	 * @param height height of octagon base
	 * @param side side of octagon base
	 */
	public OctagonPrism(double height, double side) {
		super(height, side);
	}

	/**
	 * calculate base area of the octagon base
	 * 
	 * @return the base area of the octagon base
	 */
	@Override
	public double calculateBaseArea() {
		return 2 * ( 1 + Math.sqrt(2)) * Math.pow(super.getSide(), 2.0);
	}

	/**
	 * calculate volume of the octagon base
	 * 
	 * @return the volume of the octagon base
	 */
	@Override
	public double calculateVolume() {
		return this.calculateBaseArea() * super.getHeight();
	}
	

}
