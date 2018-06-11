
public class Partition {
	Node partition(Node node, int x) {
		Node beforeStart = null;
		Node beforeEnd = null;
		Node afterStart = null;
		Node afterEnd = null;

		while (node != null) {
			node = node.getNextNode();
			node.setNextNode(null);

			if (node.getNumTree() < x) {
				if (beforeStart == null) {
					beforeStart = node;
					beforeEnd = beforeStart;
				} else {
					beforeEnd.setNextNode(node);
					beforeEnd = node;
				}
			} else {
				if (afterStart == null) {
					afterStart = node;
					afterEnd = afterStart;
				} else {
					afterEnd.setNextNode(node);
					afterEnd = node;
				}
			}
		}
		if (beforeStart == null){
			return afterStart;
		}
		beforeEnd.setNextNode(afterStart);
		return beforeStart;
	}
}
