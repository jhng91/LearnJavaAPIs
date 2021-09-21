import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LearnCollections {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(5, 2, 3, 1, 4));
		
		Collections.sort(list);
		System.out.println(Collections.binarySearch(list, 2)); 

		Collections.addAll(list, 9, 8, 7, 6);
		System.out.println(list);
	}
}
