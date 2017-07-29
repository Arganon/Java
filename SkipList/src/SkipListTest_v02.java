import java.util.Random;

class SkipList {
	Node head;
	int size;

	private static class Node {
		Node next;
		Node bottom;
		Integer data;
		int headIndex;
	}
	
	public void add(int data) {
		Node node = new Node();
		node.data = data;
		addElement(node);
	}
	
	private void addElement(Node nodeWhichAdd) {
		if (head == null) {
			head = new Node();
			head.next = nodeWhichAdd;
			size++;
		} else {
			Node prevNode = findPrevNode(head, nodeWhichAdd);
			if (prevNode.next != null && prevNode.next.data == nodeWhichAdd.data) {
				System.out.println("You trying add the same value");
				return;
			}
			nodeWhichAdd.next = prevNode.next;
			prevNode.next = nodeWhichAdd;
			size++;
		}
		pushUp(nodeWhichAdd);
	}
	
	private Node findPrevNode(Node tempHead, Node nodeWhichAdd) {
		if (tempHead.next == null && tempHead.bottom != null) {
			return findPrevNode(tempHead.bottom, nodeWhichAdd);
		}
		if (tempHead.next == null && tempHead.bottom == null) {
			return tempHead;
		}
		if (tempHead.next.data < nodeWhichAdd.data) {
			return findPrevNode(tempHead.next, nodeWhichAdd);
		}
		if (tempHead.next.data > nodeWhichAdd.data && tempHead.bottom != null) {
			return findPrevNode(tempHead.bottom, nodeWhichAdd);
		}
		return tempHead;
	}
	
	private int getLevelForPushUp() {
		int level = 0;
		Random random = new Random();
		while(random.nextBoolean()) {
			level++;
		}
		return level;
	}
	
	private void pushUp(Node nodeWhichPushingUp) {
		int level = getLevelForPushUp();
		System.out.println("Level is " + level + " For data " + nodeWhichPushingUp.data);
		while(level > 0) {
			makeNodesAndPushUp(nodeWhichPushingUp);	
			level--;
		}
	}
	
	private Node findParentNode(Node headNode, Node nodeWichPushingUp, int headIndex) {
		if (headNode.headIndex == nodeWichPushingUp.headIndex) {
			if (headNode.next == null) {
				return headNode;
			} else if (headNode.next.data < nodeWichPushingUp.data) {
				return findParentNode(headNode.next, nodeWichPushingUp, headIndex);
			}
			return headNode;
		}
		if (headNode.headIndex > nodeWichPushingUp.headIndex) {
			if (headNode.next != null && headNode.next.data < nodeWichPushingUp.data) {
				return findParentNode(headNode.next, nodeWichPushingUp, headIndex);
			} else {
				return findParentNode(headNode.bottom, nodeWichPushingUp, headIndex);
			}
		}
		System.out.println(headNode.headIndex);
		return headNode;
	}
	
	private void makeConnectionsForNode(Node nodeWhichPushingUp, Node bottomNode) {
		// making links between top node and bottom node
		bottomNode.bottom = nodeWhichPushingUp.bottom;
		nodeWhichPushingUp.bottom = bottomNode;
		bottomNode.next = nodeWhichPushingUp.next;
		nodeWhichPushingUp.next = null;
		
		//making linear links between head node and node which added
		Node parent = findParentNode(head, nodeWhichPushingUp, nodeWhichPushingUp.headIndex);		
		nodeWhichPushingUp.next = parent.next;
		parent.next = nodeWhichPushingUp;
		
		//making linear links for bottom node
		Node parentBottomNode = findParentNode(head, bottomNode, bottomNode.headIndex);
		parentBottomNode.next = bottomNode;	
	}
	
	private void makeNodesAndPushUp(Node nodeWhichPushingUp) {
		Node bottomNode = new Node();
		bottomNode.data = nodeWhichPushingUp.data;
		bottomNode.headIndex = nodeWhichPushingUp.headIndex;
		nodeWhichPushingUp.headIndex++;
		if (nodeWhichPushingUp.headIndex > head.headIndex) {
			Node newBottomHead = new Node();
			newBottomHead.headIndex = head.headIndex;
			newBottomHead.bottom = head.bottom;
			newBottomHead.next = head.next;
			head.bottom = newBottomHead;
			head.next = null;
			head.headIndex++;
		}
		makeConnectionsForNode(nodeWhichPushingUp, bottomNode);
	}
	
	private String getInfo() {
		String info = "";
		Node temp = head;
		while (temp.headIndex != 0) {
			temp = temp.bottom;
		}
		while(temp != null) {
			info += temp.data + "_";
			temp = temp.next;
		}
		return info;
	}
	public void show() {
		System.out.println("Head index " + head.headIndex);
		System.out.println("List is_" + getInfo());
	}
}


public class SkipListTest_v02 {
	public static void main(String[] args) {
		SkipList list = new SkipList();
		list.add(10);
		list.add(55);
		list.add(20);
		list.add(35);
		list.add(30);
		list.add(51);
		list.add(40);
		list.add(76);
		list.add(50);
		list.show();
		//
	}
}
