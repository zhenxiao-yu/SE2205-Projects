/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.groupproject3;

/**
 *
 * @author Parsa
 */
import java.util.ArrayList;

public class Tree<E> {

    private Node<E> root;

    public Tree(Node<E> root) {
        this.root = root;
    }

    public boolean isEmpty() {
        return root == null;
    }
    
    public int size() {
        return getNumOfChildren(root) + 1;
    }

    public Node<E> getRoot() {
        return root;
    }

    public void setRoot(Node<E> root) {
        this.root = root;
    }

    public int getNumOfChildren(Node<E> node) {
        int n = node.getChildren().size();
        for (Node<E> child : node.getChildren()) {
            n += getNumOfChildren(child);
        }
        return n;
    }

    public ArrayList<Node<E>> getPreOrderTraversal() {
        ArrayList<Node<E>> preOrder = new ArrayList<>();
        makePreorder(root, preOrder);
        return preOrder;
    }

    public ArrayList<Node<E>> getPostOrderTraversal() {
        ArrayList<Node<E>> postOrder = new ArrayList<>();
        makePostorder(root, postOrder);
        return postOrder;
    }

    private void makePreorder(Node<E> node, ArrayList<Node<E>> preOrder) {
        preOrder.add(node);
        node.getChildren().forEach(child -> {
            makePreorder(child, preOrder);
        });
    }

    private void makePostorder(Node<E> node, ArrayList<Node<E>> postOrder) {
        node.getChildren().forEach(child -> {
            makePostorder(child, postOrder);
        });
        postOrder.add(node);
    }

}
