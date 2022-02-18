import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Demo_Sets {

	public static void main(String[] args) {
		
		Map<String, Integer> sets = new TreeMap<String, Integer>();
		sets.put("B", 1);
		sets.put("B", 2);
		sets.put("A", 2);
		sets.put("C", 1);
		
//		sets.add(1);
//		sets.add(10);
//		sets.add(20);
//		sets.add(5);
//		sets.add(2);
//		sets.add(2);
//
//		sets.remove(1);
//		
		
		for(String keys: sets.keySet()) {
			System.out.println(keys+" "+sets.get(keys));
		}
		
		
		//sets.remove(1);
	}

}
