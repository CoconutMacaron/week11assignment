package sorting;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalApp {

	public static void main(String[] args) {
		
		new OptionalApp().run();

	}

	private void run() {
		Otter otter = optionalMethod(Optional.of(new Otter("OP")));
		System.out.println(otter);
		
		try {
			optionalMethod(Optional.empty());
		}catch(NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
	}
	
	private Otter optionalMethod(Optional<Otter> optionalOtter) {
		return optionalOtter.orElseThrow(() -> new NoSuchElementException("No Otters Here"));
	}

}
