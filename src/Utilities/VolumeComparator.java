package Utilities;

import java.util.Comparator;

import shapeType.*;

/**
 * Class description:
 *
 * @author Rimon Alqoshi (000807329)
 *
 */

public class VolumeComparator <T> implements Comparator<Shape> {

	@Override
	public int compare(Shape o1, Shape o2) {
		if (o1.calculateVolume() > o2.calculateVolume())
			return 1;
		return -1;

	}

}
