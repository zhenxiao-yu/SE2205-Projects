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
import java.util.List;


public class Node<E> {

    private Node<E> parent = null;
    private E element;
    private List<Node<E>> children;
    

    public Node(E element) {
        this.element = element;
        this.children = new ArrayList<>();
    }

    public Node(Node<E> node) {
        this.element = node.getElement();
        children = new ArrayList<>();
    }

    public void addChild(Node<E> child) {
        child.setParent(this);
        children.add(child);
    }

    public void setChildren(List<Node<E>> children) {
        children.forEach(child -> {
            child.setParent(this);
        });

        this.children = children;
    }

    public E getElement() {
        return this.element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public Node<E> getParent() {
        return this.parent;
    }

    public void setParent(Node<E> parent) {
        this.parent = parent;
    }

    public List<Node<E>> getChildren() {
        return this.children;
    }

    public Node<E> getChildAt(int index) {
        return children.get(index);
    }
    @Override
    public String toString() {
        return this.element.toString();
    }
}

