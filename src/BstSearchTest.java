import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BstSearchTest {
    @Test
    public void testContainsValueInTree() {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(5, null, null);
        root.left = new BinaryTreeNode<Integer>(3, null, null);
        root.right = new BinaryTreeNode<Integer>(9, null, null);

        assertTrue(BstSearch.contains(root, 9));
    }

    @Test
    public void testContainsValueNotInTree() {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(5, null, null);
        root.left = new BinaryTreeNode<Integer>(3, null, null);
        root.right = new BinaryTreeNode<Integer>(9, null, null);

        assertFalse(BstSearch.contains(root, 12));
    }

    @Test
    public void testContainsEmptyTree() {
        assertFalse(BstSearch.contains(null, 9));
    }

    @Test
    public void testNullTarget() {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(5, null, null);

        assertThrows(NullPointerException.class, () -> {
            BstSearch.contains(root, null);
        });
    }

    @Test
    public void testContainsLargeTree() {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(10, null, null);

        root.left = new BinaryTreeNode<Integer>(5, null, null);
        root.right = new BinaryTreeNode<Integer>(15, null, null);

        root.left.left = new BinaryTreeNode<Integer>(3, null, null);
        root.left.right = new BinaryTreeNode<Integer>(7, null, null);

        root.right.left = new BinaryTreeNode<Integer>(12, null, null);
        root.right.right = new BinaryTreeNode<Integer>(18, null, null);

        assertTrue(BstSearch.contains(root, 12));
    }

    @Test
    public void testContainsLargeTreeValueNotFound() {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(10, null, null);

        root.left = new BinaryTreeNode<Integer>(5, null, null);
        root.right = new BinaryTreeNode<Integer>(15, null, null);

        root.left.left = new BinaryTreeNode<Integer>(3, null, null);
        root.left.right = new BinaryTreeNode<Integer>(7, null, null);

        root.right.left = new BinaryTreeNode<Integer>(12, null, null);
        root.right.right = new BinaryTreeNode<Integer>(18, null, null);

        assertFalse(BstSearch.contains(root, 20));
    }

}
