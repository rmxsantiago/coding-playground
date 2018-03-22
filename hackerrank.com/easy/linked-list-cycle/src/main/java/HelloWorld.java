import java.util.HashMap;
import java.util.Map;

public class HelloWorld {
	public boolean hasCycle(Node head) {
		Map<Integer, Node> map = new HashMap<>();
		Node aux = head;
		while (aux != null) {
			if(map.get(aux.hashCode()) != null){
				return true;
			}else{
				map.put(aux.hashCode(), aux);
				aux = aux.next;
			}
		}
		return false;
	}

	Map<Integer, Node> map = new HashMap<>();
	public boolean hasCycleRecursive(Node head) {
		if(head.next == null){
			return false;
		}if(map.get(head.hashCode()) != null){
			return true;
		}else{
			map.put(head.hashCode(), head);
		}
		return hasCycleRecursive(head.next);
	}

	public static class Node {
		public int data = 0;
		public Node next;
	}
}
