package sem_4;

public class BinaryTree {
	Node root;

	public void addNode(int key, String name) {
		Node newNode = new Node(key, name);

		if (root == null) {
			root = newNode;
		} else {
			Node focusNode = root;
			Node parent;

			while (true) {
				parent = focusNode;

				if (key < focusNode.key) {
					focusNode = focusNode.leftchild;

					if (focusNode == null) {
						parent.leftchild = newNode;
						return;
					}
				} else {
					focusNode = focusNode.rightchild;
					if (focusNode == null) {
						parent.rightchild = newNode;
						return;
					}
				}
			}
		}
	}

	// Traverse Tree
	// In Order
	public void inOrder(Node focusNode) {
		if (focusNode != null) {
			inOrder(focusNode.leftchild);
			System.out.println(focusNode);
			inOrder(focusNode.rightchild);
		}
	}

	// PreOrder
	public void preorder(Node focusNode) {
		if (focusNode != null) {
			System.out.println(focusNode);
			preorder(focusNode.leftchild);
			preorder(focusNode.rightchild);
		}
	}

	// PostOrder
	public void postorder(Node focusNode) {
		if (focusNode != null) {
			postorder(focusNode.leftchild);
			postorder(focusNode.rightchild);
			System.out.println(focusNode);
		}
	}

	public static void main(String[] args) {
		var tree = new BinaryTree();
		tree.addNode(50, "Marouf");
		tree.addNode(20, "Ahmad");
		tree.addNode(10, "Ali");
		tree.addNode(40, "Nabi");
		tree.addNode(50, "Mehran");
		tree.addNode(60, "Moahmmad");

		tree.postorder(tree.root);
	}

}

class Node {
	int key;
	String name;

	Node leftchild;
	Node rightchild;

	// constructor
	Node(int key, String name) {
		this.key = key;
		this.name = name;
	}

	// toString
	public String toString() {
		return name + " has a key " + key;
	}
}