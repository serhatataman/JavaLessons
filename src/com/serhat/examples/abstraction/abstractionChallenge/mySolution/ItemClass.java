package com.serhat.examples.abstraction.abstractionChallenge.mySolution;

public abstract class ItemClass {

    private Node head;

    public ItemClass() {
        this.head = new Node();
    }

    public ItemClass(Object data) {
        this.head = new Node(data);
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public abstract void showList();
    public abstract void addNode(Object data);
    public abstract Object get(int i);
    public abstract void set(Object data);
    public abstract int size();

    public class Node {
        private Node previousNode;
        private Node nextNode;
        private Object data;

        public Node() {
        }

        public Node(Object data) {
            this.previousNode = null;
            this.nextNode = null;
            this.data = data;
        }

        public Node(Node previousNode, Node nextNode, Object data) {
            this.previousNode = previousNode;
            this.nextNode = nextNode;
            this.data = data;
        }

        public Node getNextNode() {
            return nextNode;
        }

        public void setNextNode(Node nextNode) {
            this.nextNode = nextNode;
        }

        public Object getData() {
            return data;
        }

        public void setData(Object data) {
            this.data = data;
        }

        public Node getPreviousNode() {
            return previousNode;
        }

        public void setPreviousNode(Node previousNode) {
            this.previousNode = previousNode;
        }
    }
}

