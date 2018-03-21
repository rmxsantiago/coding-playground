import java.lang.*;
import java.util.HashMap;
import java.util.Map;


public class HelloWorld {
	Map<String, Integer> magazineMap;
	Map<String, Integer> noteMap;

	public HelloWorld(String magazine, String note) {
		magazineMap = createMap(magazine);
		noteMap = createMap(note);
	}

	private Map createMap(String string){
		String[] words = string.split(" ");
		Map<String, Integer> map = new HashMap();
		for(String key : words){
			Integer value = map.get(key);
			if(value == null){
				map.put(key, 1);
			}else{
				map.put(key, ++value);
			}
		}
		return map;
	}

	public boolean solve() {
		for(String key : noteMap.keySet()){
			Integer magazine = magazineMap.get(key);
			Integer note = noteMap.get(key);

			if(magazine == null || note > magazine){
				return false;
			}
		}

		return true;
	}
}
