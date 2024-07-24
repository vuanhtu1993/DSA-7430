package Tree;

//Nhắc lại khái niệm đệ quy
// Bước 1: Define the base case - xac dinh truong hop don gian nhat co the giai quyet ma khong can recursive
// Buoc 2: Define the recursive case - xac dinh sao de chia nho van de ra thanh cac truong hop nho hon ma co the giai quyet su dung de quy

public class BinarySearchTree {
    public TreeNode root;
    public BinarySearchTree() {
        root = null;
    }
    public void insert(int data) {
        if (root == null) {
            root = new TreeNode(data);
        } else {
            TreeNode current = root;
            while (current != null) {
                if (data < current.value) {
                    if (current.left == null) {
                        current.left = new TreeNode(data);
                        break;
                    } else {
                        current = current.left;
                    }
                }
                else if (data > current.value) {
                    if (current.right == null) {
                        current.right = new TreeNode(data);
                        break;
                    } else {
                        current = current.right;
                    }
                }
            }
        }
    }

//    Hàm insert sử dụng đệ quy
//    1. Base case - Cây con (subtree) có root = null
//    2. Chia nhỏ bài toàn bằng cách gọi lại hàm (tham số khác) - Duyệt cây con nhỏ hơn
    public void insertRecursive(TreeNode node, int data) {
        if (root == null) {
            root = new TreeNode(data);
        } else {
            if (data < node.value) {
                if (node.left == null) {
//                    Base case.
                    node.left = new TreeNode(data);
                } else {
//                    Điều kiện chia nhỏ bài toán.
                    insertRecursive(node.left, data);
                }
            } else if (data > node.value) {
                if (node.right == null) {
                    node.right = new TreeNode(data);
                } else {
//                    Điều kiện chia nhỏ bài toán.
                    insertRecursive(node.right, data);
                }
            }

        }
    }


    public TreeNode search(int data) {
        if (root == null) {
            return null;
        }
        TreeNode current = root;
        while (current != null) {
            if (data == current.value) {
                return current;
            }
            else if (data < current.value) {
                current = current.left;
            } else if (data > current.value) {
                current = current.right;
            }
        }
        return current;
    }
    public boolean contains(int value) {
        if (root == null) {
            return false;
        }
        TreeNode current = root;
        while (current != null) {
            if (current.value == value) {
                return true;
            } else if (value < current.value) {
                current = current.left;
            } else if (value > current.value) {
                current = current.right;
            }
        }
        return false;
    }

    public void traverse(TreeNode root) {
        if (root == null) {
            return;
        }else {
            System.out.print(root.value + " ");
            traverse(root.left);
            traverse(root.right);
        }
    }
}

