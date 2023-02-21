package shapeType;

/**
 * Class description:
 *
 * @author Rimon Alqoshi (000807329)
 *
 */

public class Cone extends Shape {

	/**
	 * declare radius field
	 */
	private double radius;

	/**
	 * 
	 * Initializes the newly created Cylinder
	 * 
	 * @param height height of cone
	 * @param radius radius of cone
	 */
	public Cone(double height, double radius) {
		super(height);
		this.radius = radius;
	}

	/**
	 * calculate base area of the cone
	 * 
	 * @return the base area of the cone
	 */
	@Override
	public double calculateBaseArea() {
		return Math.PI * Math.pow(radius, 2.0);

	}

	/**
	 * calculate volume of the cone
	 * 
	 * @return the volume of the cone
	 */
	@Override
	public double calculateVolume() {
		return ((double) 1 / 3) * Math.PI * Math.pow(radius, 2.0) * super.getHeight();

	}

	/**
	 * @return the radius
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * @param radius the radius to set
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String toString() {
		return "Height: "+super.getHeight()+
				"\nRadius: "+radius+
				"\nBase Area: "+this.calculateBaseArea()+
				"\nVolume: "+this.calculateVolume();
	}
}
