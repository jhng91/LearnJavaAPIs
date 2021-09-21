import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LearnStreams {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(5, 2, 3, 1, 4));
		list.stream().filter(num -> num < 3).forEach(System.out::println); 			// 2 1
		list.stream().sorted().parallel().forEachOrdered(System.out::print); 		// 12345 guaranteed
		System.out.println();
		list.stream().sorted().parallel().forEach(System.out::print); 				// 31245 order not guaranteed
		System.out.println();
		System.out.println(list.stream().reduce(0, (sum, curr) -> sum + curr));		// 15
		System.out.println(list.stream().max(Integer::compare).get());				// 5
	}
}
