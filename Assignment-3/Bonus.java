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

import java.util.Scanner;

public class Bonus {

    public Bonus() {
        Scanner s = new Scanner(System.in);
        String rootNames = s.nextLine();
        System.out.println("Printing the new tree using Preorder Traversal:");
        switch (rootNames) {
            case "/user/rt/courses" -> {
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
                System.out.println(tree.getPreOrderTraversal());
            }
            case "cs252/" -> {
                Node<String> rootNode1 = new Node<>("cs252/");

                Node<String> projects1 = new Node<>("projects/");
                Node<String> papers1 = new Node<>("papers/");
                Node<String> demos1 = new Node<>("demos/");
                Node<String> grades21 = new Node<>("grades");
                Node<String> buylow1 = new Node<>("buylow");
                Node<String> sellhigh1 = new Node<>("sellhigh");
                Node<String> market1 = new Node<>("market");

                Tree tree1 = new Tree(rootNode1);

                rootNode1.addChild(projects1);
                rootNode1.addChild(grades21);
                projects1.addChild(papers1);
                papers1.addChild(buylow1);
                papers1.addChild(sellhigh1);
                projects1.addChild(demos1);
                demos1.addChild(market1);
                System.out.println(tree1.getPreOrderTraversal());
            }

            case "cs016/" -> {
                Node<String> rootNode2 = new Node<>("cs016/");
                Node<String> homeworks2 = new Node<>("homeworks/");
                Node<String> programs2 = new Node<>("programs/");
                Node<String> grades22 = new Node<>("grades");
                Node<String> hw12 = new Node<>("hw1");
                Node<String> hw22 = new Node<>("hw2");
                Node<String> hw32 = new Node<>("hw3");
                Node<String> pr12 = new Node<>("pr1");
                Node<String> pr22 = new Node<>("pr2");
                Node<String> pr32 = new Node<>("pr3");

                Tree tree2 = new Tree(rootNode2);

                rootNode2.addChild(grades22);
                rootNode2.addChild(homeworks2);
                rootNode2.addChild(programs2);
                homeworks2.addChild(hw12);
                homeworks2.addChild(hw22);
                homeworks2.addChild(hw32);
                programs2.addChild(pr12);
                programs2.addChild(pr22);
                programs2.addChild(pr32);
                System.out.println(tree2.getPreOrderTraversal());
            }

            case "homeworks/" -> {
                Node<String> rootNode3 = new Node<>("homeworks/");
                Node<String> hw13 = new Node<>("hw1");
                Node<String> hw23 = new Node<>("hw2");
                Node<String> hw33 = new Node<>("hw3");

                Tree tree3 = new Tree(rootNode3);
                rootNode3.addChild(hw13);
                rootNode3.addChild(hw23);
                rootNode3.addChild(hw33);
                System.out.println(tree3.getPreOrderTraversal());
            }

            case "programs/" -> {
                Node<String> rootNode4 = new Node<>("programs/");
                Node<String> pr14 = new Node<>("pr1");
                Node<String> pr24 = new Node<>("pr2");
                Node<String> pr34 = new Node<>("pr3");

                Tree tree4 = new Tree(rootNode4);
                rootNode4.addChild(pr14);
                rootNode4.addChild(pr24);
                rootNode4.addChild(pr34);
                System.out.println(tree4.getPreOrderTraversal());
            }

            case "projects/" -> {
                Node<String> rootNode5 = new Node<>("projects/");
                Node<String> papers5 = new Node<>("papers/");
                Node<String> demos5 = new Node<>("demos/");
                Node<String> buylow5 = new Node<>("buylow");
                Node<String> sellhigh5 = new Node<>("sellhigh");
                Node<String> market5 = new Node<>("market");

                Tree tree5 = new Tree(rootNode5);
                rootNode5.addChild(papers5);
                papers5.addChild(buylow5);
                papers5.addChild(sellhigh5);
                rootNode5.addChild(demos5);
                demos5.addChild(market5);
                System.out.println(tree5.getPreOrderTraversal());
            }

            case "papers/" -> {
                Node<String> rootNode6 = new Node<>("papers/");
                Node<String> buylow6 = new Node<>("buylow");
                Node<String> sellhigh6 = new Node<>("sellhigh");
                Tree tree6 = new Tree(rootNode6);
                rootNode6.addChild(buylow6);
                rootNode6.addChild(sellhigh6);
                System.out.println(tree6.getPreOrderTraversal());
            }

            case "demos/" -> {
                Node<String> rootNode7 = new Node<>("demos/");
                Node<String> market7 = new Node<>("market7");
                Tree tree7 = new Tree(rootNode7);
                rootNode7.addChild(market7);
                System.out.println(tree7.getPreOrderTraversal());
            }

            case "grades" -> {
                Node<String> rootNode8 = new Node<>("grades");
                Tree tree8 = new Tree(rootNode8);
                System.out.println(tree8.getPreOrderTraversal());
            }

            case "hw1" -> {
                Node<String> rootNode9 = new Node<>("hw1");
                Tree tree9 = new Tree(rootNode9);
                System.out.println(tree9.getPreOrderTraversal());
            }

            case "hw2" -> {
                Node<String> rootNode10 = new Node<>("hw2");
                Tree tree10 = new Tree(rootNode10);
                System.out.println(tree10.getPreOrderTraversal());
            }

            case "hw3" -> {
                Node<String> rootNode11 = new Node<>("hw3");
                Tree tree11 = new Tree(rootNode11);
                System.out.println(tree11.getPreOrderTraversal());
            }

            case "pr1" -> {
                Node<String> rootNode12 = new Node<>("pr1");
                Tree tree12 = new Tree(rootNode12);
            }

            case "pr2" -> {
                Node<String> rootNode13 = new Node<>("pr2");
                Tree tree13 = new Tree(rootNode13);
                System.out.println(tree13.getPreOrderTraversal());
            }

            case "pr3" -> {
                Node<String> rootNode14 = new Node<>("pr3");
                Tree tree14 = new Tree(rootNode14);
                System.out.println(tree14.getPreOrderTraversal());
            }

            case "buylow" -> {
                Node<String> rootNode15 = new Node<>("buylow");
                Tree tree15 = new Tree(rootNode15);
                System.out.println(tree15.getPreOrderTraversal());
            }

            case "sellhigh" -> {
                Node<String> rootNode16 = new Node<>("sellhigh");
                Tree tree16 = new Tree(rootNode16);
                System.out.println(tree16.getPreOrderTraversal());
            }

            case "market" -> {
                Node<String> rootNode17 = new Node<>("market");
                Tree tree17 = new Tree(rootNode17);
                System.out.println(tree17.getPreOrderTraversal());
            }

            default -> System.out.println("Not a valid directory path");
        }
    }

}
