/*
* Main testing class for BST
* @author: USFCACS 245
*/
public class BSTtest
{
    public static void main(String[] args)
    {
        //TODO CHANGE CLASS AS NEEDED TO TEST CODE
        BST<Integer> tree = new BST<Integer>();

        int L = 3;
        int R = 7;
        for(int i = 1; i <= 10; i++)
        {
            tree.insert(i);

        }

        tree.print();
        System.out.println("---------------");
        tree.delete(2);
        System.out.println(tree.find(2));
        System.out.println("---------------");
        tree.print();
        System.out.println("---------------");
        System.out.println(tree.rangeSum(L, R));
    }
}
