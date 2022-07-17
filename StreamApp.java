package sorting;

import java.util.stream.Collectors;

public class StreamApp {

	public static void main(String[] args) {
		
		new StreamApp().run();
		
	}

	private void run() {
		String otters = Otter.getOtters().stream()
			.map((otter) -> otter.toString())
	  // OR .map(Otter::toString)
			.sorted()
			.collect(Collectors.joining(", "));
		System.out.println(otters);
	}

}
