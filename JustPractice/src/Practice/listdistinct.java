package Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class listdistinct {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(2, 5, 7, 4, 2, 5, 3);
		List<Integer> listing = list.stream().distinct().collect(Collectors.toList());
		System.out.println(listing);

	}
}
