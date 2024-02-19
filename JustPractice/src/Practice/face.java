package Practice;

import java.util.Random;

@FunctionalInterface
public interface face {

	void show();

	default int getone() {
		return 1;

	}
	
	static String gettwo() {
		return null;
		
	}
}
