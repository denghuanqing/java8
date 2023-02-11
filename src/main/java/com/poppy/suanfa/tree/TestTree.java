package com.poppy.suanfa.tree;

/**
 * 二叉树相关
 */
public class TestTree {
    public static void main(String[] args) {
        TreeNode treeNode6 = new TreeNode("6",null, null);
        TreeNode treeNode5 = new TreeNode("5",null, null);
        TreeNode treeNode4 = new TreeNode("4",treeNode5, treeNode6);
        TreeNode treeNode3 = new TreeNode("3",null, treeNode4);
        TreeNode treeNode2 = new TreeNode("2",null,treeNode3);
        TreeNode root = new TreeNode("root",treeNode2,null);

        level(root,1);
//count(root);
//        afterPrint(root);
    }

    private static void afterPrint(TreeNode root) {
        if (root==null) return;
        afterPrint(root.getLeftNode());
        afterPrint(root.getRightNode());
        System.out.println(root.getRightNode());
        System.out.println(root.getLeftNode());
    }

    // 输出每个节点所在的层数
    static void level(TreeNode root,int level){
        if (root ==null)return ;
        System.out.printf("节点 %s 存在于第 %d 层\n", root, level);
        level(root.getLeftNode(),level+1);
        level(root.getRightNode(),level+1);
    }

    // 定义：输入一棵二叉树，返回这棵二叉树的节点总数
    static int count2(TreeNode root){
        if (root == null) return 0;

        int leftCount = count2(root.getLeftNode());
        int rightCount = count2(root.getRightNode());

        System.out.printf("节点 %s 的左子树有 %d 个节点，右子树有 %d 个节点\n",
                root, leftCount, rightCount);

        return leftCount + rightCount + 1;
    }

    // 定义：输入一棵二叉树，返回这棵二叉树的节点总数
    static int count(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftCount = count(root.getLeftNode());
        int rightCount = count(root.getRightNode());
        // 后序位置
        System.out.printf("节点 %s 的左子树有 %d 个节点，右子树有 %d 个节点\n",
                root, leftCount, rightCount);

        return leftCount + rightCount + 1;
    }
}
