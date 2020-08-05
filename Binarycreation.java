class Node {
  int data;
  Node left, right;
 
  public Node(int item) {
    data = item;
    left = right = null;
  }
}
class BinaryTree {
  class Node {
    int data;
    Node left, right;
 
    public Node(int item) {
      data = item;
      left = right = null;
    }
  }

  Node root;
  BinaryTree() { 
    root = null; 
  }
  void insert(int data);
}
