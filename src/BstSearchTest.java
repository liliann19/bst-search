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

}
