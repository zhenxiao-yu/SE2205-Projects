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

public class Main {

    public static void main(String[] args) {

        Node<String> rootNode = new Node<>("/user/rt/courses");
        Node<String> cs016 = new Node<>("cs016/");
        Node<String> cs252 = new Node<>("cs252/");
        Node<String> homeworks = new Node<>("homeworks/");
        Node<String> programs = new Node<>("programs/");
        Node<String> projects = new Node<>("projects/");
        Node<String> papers = new Node<>("papers/");
        Node<String> demos = new Node<>("demos/");
        Node<String> grades = new Node<>("grades");
        Node<String> hw1 = new Node<>("hw1");
        Node<String> hw2 = new Node<>("hw2");
        Node<String> hw3 = new Node<>("hw3");
        Node<String> pr1 = new Node<>("pr1");
        Node<String> pr2 = new Node<>("pr2");
        Node<String> pr3 = new Node<>("pr3");
        Node<String> grades2 = new Node<>("grades");
        Node<String> buylow = new Node<>("buylow");
        Node<String> sellhigh = new Node<>("sellhigh");
        Node<String> market = new Node<>("market");

        Tree tree = new Tree(rootNode);
        rootNode.addChild(cs016);
        rootNode.addChild(cs252);
        cs016.addChild(grades);
        cs016.addChild(homeworks);
        cs016.addChild(programs);
        homeworks.addChild(hw1);
        homeworks.addChild(hw2);
        homeworks.addChild(hw3);
        programs.addChild(pr1);
        programs.addChild(pr2);
        programs.addChild(pr3);
        cs252.addChild(projects);
        cs252.addChild(grades2);
        projects.addChild(papers);
        papers.addChild(buylow);
        papers.addChild(sellhigh);
        projects.addChild(demos);
        demos.addChild(market);

        System.out.println("Printing the Generic Tree using Preorder Traversal:");
        System.out.println(tree.getPreOrderTraversal());
        System.out.println("");
        System.out.println("Printing the Generic Tree using Postorder Traversal:");
        System.out.println(tree.getPostOrderTraversal());
        System.out.println("");
        System.out.println("Bonus: Enter a directory path below and the program "
                + "will build the tree based on the files and directories under"
                + " the given path.");
        
        Bonus b = new Bonus();

    }
}

