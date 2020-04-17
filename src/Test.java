public class Test {
    public static void main(String[] args) {
        IntegerTree numbers = new IntegerTree();
        numbers.insert(41);
        numbers.insert(45);
        numbers.insert(40);
        numbers.insert(4);
        numbers.insert(97);
        numbers.insert(89);
        numbers.preorder();
    }
}
