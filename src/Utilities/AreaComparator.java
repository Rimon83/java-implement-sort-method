package Utilities;

import java.util.Comparator;

import shapeType.*;

/**
 * Class description:
 *
 * @author Rimon Alqoshi (000807329)
 *
 */

public class AreaComparator<T> implements Comparator<Shape> {

	@Override
	public int compare(Shape o1, Shape o2) {
		if (o1.calculateBaseArea() > o2.calculateBaseArea())
			return 1;
		return -1;
	}

}
