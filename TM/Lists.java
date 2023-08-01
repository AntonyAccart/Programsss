package TM;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists {
public static void main(String[] args) {
	List<String> name =new ArrayList<String>();
	name.add("antony");
	name.add("accart");
	System.out.println(name);
	
	int size=name.size();
	System.out.println(size);
	
	Collections.sort(name);
	System.out.println(name);
	
	Collections.reverse(name);
	System.out.println(name);
	
	for (int i = 0; i < name.size(); i++) {
		String String =name.get(i);
		System.out.println(String);
		
	}
	name.clear();
	System.out.println(name);
	boolean empty=name.isEmpty();
	System.out.println(empty);
}
}
