package DataStructures;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class BTDriver {
    public static void main(String[] args) {
        // 50 true 25 true 12 false false true 39 false false true 75 true 41 false false true 87 false false
//        BT tree = new BT();
//        tree.display();

        // QUESTIONS AHEAD ==>
        int[] pre = {50, 25, 12, 39, 75, 41, 87};
        int[] in = {12, 25, 39, 50, 41, 75, 87};
        BT tree = new BT(pre, in);
        tree.display();
//
//        System.out.println(tree.size2());
//
//        tree.preOrder();
//
//        tree.inOrder();
//
//        tree.postOrder();
//
//        System.out.println(tree.max());
//
//        System.out.println(tree.min());
//
//        tree.levelOrder();
//
//        tree.mirror();
//
//        tree.display();
//
//        System.out.println(tree.diameter());
//        System.out.println(tree.isBST());
    }
}