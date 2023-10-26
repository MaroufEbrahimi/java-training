package semester_4;

public class BinaryTree {

	public static void main(String[] args) {
		Tree tr = new Tree();
		NodeBinTree root = null;
		// 8, 3, 6, 10, 4, 7, 1, 14, 13
		root = tr.insert(root, 8);
		root = tr.insert(root, 3);
		root = tr.insert(root, 6);
		root = tr.insert(root, 10);
		root = tr.insert(root, 4);
		root = tr.insert(root, 7);
		root = tr.insert(root, 1);
		root = tr.insert(root, 14);
		root = tr.insert(root, 13);

	}

}

class NodeBinTree {
	int data;
	NodeBinTree left;
	NodeBinTree right;
}

class Tree {
	public NodeBinTree createNewNode(int key) {
		NodeBinTree n = new NodeBinTree();
		n.data = key;
		n.left = null;
		n.right = null;
		return n;
	}

	public NodeBinTree insert(NodeBinTree node, int val) {
		if (node == null) {
			return createNewNode(val);
		}

		if (val < node.data) {
			node.left = insert(node.left, val);
		} else if (val > node.data) {
			node.right = insert(node.right, val);
		}

		return node;
	}
}