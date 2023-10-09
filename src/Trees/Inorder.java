package Trees;

public class Inorder {

    public static void main(String[] args){
        Root root = new Root(10);
        Root V1 = new Root(20);
        Root V2  = new Root(30);
        Root V3 = new Root(40);
        Root V4 = new Root(50);
        Root V5 = new Root(60);
        Root V6 = new Root(70);

        root.left = V1;
        root.right = V2;
        V2.left = V3;
        V2.right = V4;
        V4.right = V5;
        V4.left =V6;

        InorderTraversal(root);


    }
    public static void InorderTraversal(Root root){
        if(root!=null){
            InorderTraversal(root.left);
      System.out.println(root.key);
      InorderTraversal(root.right);
        }
    }
}
