/**
 * Created by student on 17-Jan-17.
 */
public class BinTree {
    private String value;
    private BinTree left;
    private BinTree right;

    public BinTree(String value) {
        this(value, null, null);
    }

    public BinTree(String value, BinTree left, BinTree right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public BinTree getLeft() {
        return left;
    }

    public BinTree getRight() {
        return right;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setLeft(BinTree left) {
        this.left = left;
    }


    public void setRight(BinTree right) {
        this.right = right;
    }

    public static boolean isValid(BinTree node) {
        if (node == null)
            return true;

        if (node.getValue() == "##") {
            return false;
        }

        String tmp = node.getValue();
        node.setValue("##");
        boolean result = BinTree.isValid(node.getLeft()) && BinTree.isValid(node.getRight());

        node.setValue(tmp);

        return result;
    }

    public String serialize() {
        return this.serialize(this);
    }

    private String serialize(BinTree node) {
        return "";
    }

    public static BinTree deserialize(String serialized) {
        return null;
    }
}
