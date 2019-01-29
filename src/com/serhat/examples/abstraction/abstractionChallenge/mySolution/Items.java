package com.serhat.examples.abstraction.abstractionChallenge.mySolution;

public class Items extends ItemClass {

    private Node currentNode;

    public Items() {
        super();
        this.currentNode = getHead();
    }

    public Items(Object data) {
        super(data);
    }

    @Override
    public void addNode(Object data) {

        if (this.getHead().getData() == null) {
            this.getHead().setData(data);
        } else {
            Node newNode = new Node(data);
            Node existingNode = getHead();
            boolean insert = true;

            while (insert) {
                int comparison = existingNode.getData().toString().compareTo(newNode.getData().toString());
//                System.out.println("Comparing: " + existingNode.getData().toString() + " with " + newNode.getData().toString());
                if (comparison < 0) {
                    if (existingNode.getNextNode() == null) {
                        newNode.setNextNode(null);
                        existingNode.setNextNode(newNode);
                        newNode.setPreviousNode(existingNode);
//                        System.out.println("Creating new node: " + existingNode.getNextNode().getData());
                        insert = false;
                    } else {
                        int comparison2 = existingNode.getNextNode().getData().toString().compareTo(newNode.getData().toString());
                        if (comparison2 < 0) {
                            existingNode = existingNode.getNextNode();
                        } else if (comparison2 > 0) {
                            newNode.setNextNode(existingNode.getNextNode());
                            existingNode.setNextNode(newNode);
                            newNode.setPreviousNode(existingNode);
//                            System.out.println("Connecting new node: " + existingNode.getNextNode().getData());
                            insert = false;
                        } else {
                            System.out.println(newNode.getData().toString() + " entity already exists!");
                            break;
                        }
                    }
                } else if (comparison > 0) {
                    newNode.setNextNode(existingNode);
                    this.setHead(newNode);
                    newNode.setPreviousNode(null);
                    this.currentNode = getHead();
//                    System.out.println("Connecting with new node: " + newNode.getData());
                    insert = false;
                } else {
                    System.out.println(newNode.getData().toString() + " entity already exists!");
                    insert = false;
                }
            }
        }
    }

    public Object getCurrent() {
        if (this.currentNode == null) {
            return null;
        } else {
            return this.currentNode.getData();
        }
    }

    public Object getNext() {
        if (this.currentNode.getNextNode() == null) {
            return null;
        } else {
            this.currentNode = this.currentNode.getNextNode();
            return this.currentNode.getData();
        }
    }

    public Object getPrevious() {
        if (this.currentNode.getPreviousNode() == null) {
            return null;
        } else {
            this.currentNode = this.currentNode.getPreviousNode();
            return this.currentNode.getData();
        }
    }

    @Override
    public Object get(int i) {
        return null;
    }

    @Override
    public void set(Object data) {

    }

    @Override
    public void showList() {
        if (size() == 0) {
            System.out.println("List is empty!\n");
        } else {
            System.out.println("All entities:");
            Node currentState = getHead();
            while (currentState.getNextNode() != null) {
                System.out.println(currentState.getData().toString());
                currentState = currentState.getNextNode();
            }
            System.out.println(currentState.getData().toString());
        }
    }

    @Override
    public int size() {
        Node head = getHead();
        int size = 0;
        if (head == null) {
            return 0;
        }
        while (head.getNextNode() != null) {
            head = head.getNextNode();
            size++;
        }
        return size;
    }
}
