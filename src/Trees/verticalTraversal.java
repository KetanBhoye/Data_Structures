package Trees;


import java.util.*;

class Solution
{
    //Function to find the vertical order traversal of Binary Tree.
    public static ArrayList<Integer> verticalOrder(Root root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(root, 0));

        while (!queue.isEmpty()) {
            Pair pair = queue.poll();
            Root node = pair.node;
            int hd = pair.hd;

            map.computeIfAbsent(hd, k -> new ArrayList<>()).add(node.key);

            if (node.left != null) {
                queue.offer(new Pair(node.left, hd - 1));
            }
            if (node.right != null) {
                queue.offer(new Pair(node.right, hd + 1));
            }
        }

        for (Map.Entry<Integer, ArrayList<Integer>> entry : map.entrySet()) {
            result.addAll(entry.getValue());
        }

        return result;
    }

    static class Pair {
        Root node;
        int hd;

        public Pair(Root node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }
}