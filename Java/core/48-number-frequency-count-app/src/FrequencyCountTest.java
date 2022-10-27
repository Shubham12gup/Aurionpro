import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FrequencyCountTest {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(20, 30, 20, 30, 40, 50, 60, 60));
		System.out.println("List of numbers : " +numbers);
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(Integer number:numbers) {
			if (map.containsKey(number)) 
				map.replace(number, (map.get(number) + 1));
			else 
				map.put(number, 1);
		}
		System.out.println(map);
	}

}
