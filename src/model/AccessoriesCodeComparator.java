package model;

import java.util.Comparator;

public class AccessoriesCodeComparator implements Comparator<Jewelry>{

	@Override
	public int compare(Jewelry j1, Jewelry j2) {
		return j1.getCode().compareTo(j2.getCode());
	}


}
