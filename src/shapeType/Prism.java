package shapeType;

/**
 * Class description:
 *
 * @author Rimon Alqoshi (000807329)
 *
 */

public abstract class Prism extends Shape {

	/**
	 * declare side feild of all type of prism
	 */
	private double side;

	/**
	 * Initializes the newly created Cylinder
	 * 
	 * @param height height of prism
	 * @param side   side of prism
	 */
	public Prism(double height, double side) {
		super(height);
		this.side = side;
	}

	@Override
	public abstract double calculateBaseArea(); 
		// TODO Auto-generated method stub

	@Override
	public abstract double calculateVolume();
		

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
