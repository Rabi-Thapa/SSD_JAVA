package lab6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NameManager {
	List<String> names= new ArrayList<>();
	
	public void addName(String name) {
		names.add(name);
	}
	
	
	public void removeLongNames() {
		for(int i=0; i<names.size(); i++) {
			if(names.get(i).length() > 15) {
				names.remove(i);
				i--;
			}
		}
	}
	
	public void printNames(){
		Iterator<String> iter= names.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
