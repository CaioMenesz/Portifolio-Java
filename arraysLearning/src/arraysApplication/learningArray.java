package arraysApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class learningArray {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		list.add("Arnold");
		
		System.out.println(list.size());

		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("----------------------------");
		list.remove(1);
		list.removeIf(x -> x.charAt(0) == 'B');
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("----------------------------");
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		
		System.out.println("----------------------------");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());	
		
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("----------------------------");
		
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
	}
}
