/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package estdatos.splaytree;

import static estdatos.splaytree.GFG.newNode;
import static estdatos.splaytree.GFG.preOrder;
import static estdatos.splaytree.GFG.search;

/**
 *
 * @author luisf
 */
public class SplayTree {

    public static void main(String[] args) {
        GFG.node root = newNode(100);
        root.left = newNode(50);
        root.right = newNode(200);
        root.left.left = newNode(40);
        root.left.left.left = newNode(30);
        root.left.left.left.left = newNode(20);
        root = search(root, 20);
        System.out.print("Preorder traversal of the"
                + " modified Splay tree is \n");
        preOrder(root);
    }
}
