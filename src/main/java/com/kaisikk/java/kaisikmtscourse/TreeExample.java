package com.kaisikk.java.kaisikmtscourse;

public class TreeExample {
    public static void main(String[] args) {
        Tree root = new Tree(20,
                new Tree(7, new Tree(4, null, new Tree(6)), new Tree(9)),
                new Tree(35,
                        new Tree(31, new Tree(28), null),
                        new Tree(40, new Tree(38), new Tree(52))));

        System.out.println("Сумма дерева: " + root.sum());

    }

    static class Tree {
        int value;
        Tree left;
        Tree rigth;

        public Tree(int value, Tree left, Tree rigth) {
            this.value = value;
            this.left = left;
            this.rigth = rigth;
        }

        public Tree(int value) {
            this.value = value;
        }

        public int sum() {
            int sum = value;
            if (left != null) {
                sum += left.sum();
            }

            if (rigth != null) {
                sum += rigth.sum();
            }
            return sum;
        }

    }

}
