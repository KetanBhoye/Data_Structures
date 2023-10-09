package Trees;

public class maxElement {
    static int Max =0;
    public static void main(String[] args){
        Root root = new Root(10);
        Root V1 = new Root(30);
        Root V2  = new Root(80);
        Root V3 = new Root(70);
        Root V4 = new Root(40);
        Root V5 = new Root(60);
        Root V6 = new Root(20);

      root.left = V1;
      V1.left = V2;
      V2.right = V3;
      root.right = V4;
      V4.left = V5;
      V4.right = V6;
      getMax(root);
    }
    public  static int getMax(Root root){
        if(root==null)
            return Max;



        Max = Math.max(root.key,Max);
    System.out.println(Max);
            getMax(root.left);
            getMax(root.right);

return Max;
    }
}
