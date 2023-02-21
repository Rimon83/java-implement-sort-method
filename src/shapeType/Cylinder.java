package shapeType;

/**
 * Class description:
 *
 * @author Rimon Alqoshi (000807329)
 *
 */

public class Cylinder extends Shape {

	/**
	 * declare radius field
	 */
	private double radius;

	/**
	 * 
	 * Initializes the newly created Cylinder
	 * 
	 * @param height height of cylinder
	 * @param radius radius of cylinder
	 */
	public Cylinder(double height, double radius) {
		super(height);
		this.radius = radius;
	}

	/**
	 * calculate base area of the cylinder
	 * 
	 * @return the base area of the cylinder
	 */
	@Override
	public double calculateBaseArea() {
		return Math.PI * Math.pow(radius, 2.0);

	}

	/**
	 * calculate volume of the cylinder
	 * 
	 * @return the volume of the cylinder
	 */
	@Override
	public double calculateVolume() {
		return Math.PI * Math.pow(radius, 2.0) * super.getHeight();

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
