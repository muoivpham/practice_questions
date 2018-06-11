
public class KthToLast {
	public static void main(String[] args) {

	}

	public int printKthToLast(Node head, int k) {
		if (head == null) {
			return 0;
		}
		int index = printKthToLast(head.getNextNode(), k) + 1;
		if (index == k) {
			System.out.println(k + "th to last node is " + head.getdata());
		}
		return index;
	}
}
