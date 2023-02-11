package com.poppy.suanfa.tree;

/**
 * 二叉树模型
 */
public class TreeNode {
    private String name;
    private TreeNode leftNode;
    private TreeNode rightNode;

    @Override
    public String toString() {
        return getName();
    }

    public TreeNode(String name, TreeNode leftNode, TreeNode rightNode) {
        this.name = name;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }
}
