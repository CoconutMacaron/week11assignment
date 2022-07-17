package sorting;

import java.util.ArrayList;
import java.util.List;

public class Otter {

	private String name;

	/**
	 * @param name
	 */
	public Otter(String name) {
		this.name = name;
	}
	
	public static List<Otter> otters = List.of(
			new Otter("River"),
			new Otter("Sea"),
			new Otter("Giant"),
			new Otter("Tiny")
	);

	public static List<Otter> getOtters() {
		return new ArrayList<>(otters);
	}

	
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name + " Otter";
	}
	
	public static int compare(Otter o1, Otter o2) {
		return o1.name.compareTo(o2.name);
	}
}
