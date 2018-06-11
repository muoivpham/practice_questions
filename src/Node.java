
public class Node {
	private String data;
	private Node nextNode;
	private int numTree;
	
	
	public int getNumTree() {
		return numTree;
	}
	public void setNumTree(int numTree) {
		this.numTree = numTree;
	}
	public Node() {
		// TODO Auto-generated constructor stub
		this.data = "Null";
		this.nextNode = null;
		numTree = 0;
	}
	public String getdata() {
		return data;
	}
	public void setdata(String value) {
		this.data = value;
	}
	public Node getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	
}
