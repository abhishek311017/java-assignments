package Question7;

import java.util.HashMap;
import java.util.Map;

public class string {

	public static void main(String[] args) {
		Map<String,Integer> m = new HashMap<>();
		m.put("tina", 1);
		m.put("james",2);
		m.put("aju",3);
		
		StringBuilder s = new StringBuilder();
		m.entrySet().forEach(n -> s.append(n.getKey()).append(n.getValue()));
		System.out.println(s.toString());
		
	}

}
