package sorting;

import java.util.List;

public class SortingApp {

	public static void main(String[] args) {
	
		new SortingApp().run();
		
	}

	private void run() {
		List<Otter> lambdaSort = sortByLambda();
		System.out.println(lambdaSort);
		
		List<Otter> methodSort = sortByMethod();
		System.out.println(methodSort);
	}

	private List<Otter> sortByMethod() {
		List<Otter> methodSort = Otter.getOtters();
		methodSort.sort(Otter::compare);
		return methodSort;
		
	}

	private List<Otter> sortByLambda() {
		List<Otter> lambdaSort = Otter.getOtters();
		lambdaSort.sort((o1, o2) -> Otter.compare(o1, o2));
		return lambdaSort;
	}

}
