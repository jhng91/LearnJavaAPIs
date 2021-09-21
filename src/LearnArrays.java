import java.util.Arrays;
import java.util.stream.Collectors;

public class LearnArrays {
	public static void main(String[] args) {
		var list = Arrays.asList(1, 2, 3, 4, 5);
		list.stream().forEach(System.out::println);
		
		int[] arr = {4,2,5,7,1};
		var test = Arrays.stream(arr).boxed().collect(Collectors.toList());
		System.out.println(test); // ArrayList
		
		int[] a = {1, 2, 3};
		int[] b = {1, 2, 3, 4};
		System.out.println(Arrays.compare(a, b)); // a is shorter than b by 1
	}
}
