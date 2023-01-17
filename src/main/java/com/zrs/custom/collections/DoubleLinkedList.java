package com.zrs.custom.collections;

public class DoubleLinkedList<E> {

    int size = 0;

    Node<E> head;
    Node<E> last;

    public DoubleLinkedList() {
        this.head = null;
        this.last = null;
    }

    public void add(E element) {
        if (head == null && last == null) {
            head = new Node<>(element, null, null);
            last = head;
        } else {
            Node<E> node = new Node<>(element, null, last);
            last.next = node;
            last = node;
            if (head != null && head.next == null) {
                head.next = node;
            }
        }
        size++;
    }

    Node<E> getNode(int idx) {
        if (idx > size - 1) {
            throw new IllegalArgumentException("CustomLinkedListIndexOutOfBoundException");
        }
        int start = 0;
        Node<E> targetNode = head;
        while (start != idx) {
            targetNode = targetNode.next;
            if (targetNode == null) {
                throw new RuntimeException("No next Node");
            }
            start++;
        }
        return targetNode;
    }

    E get(int idx) {
        return getNode(idx).item;
    }

    E remove(int idx) {
        Node<E> nodeToRemove = getNode(idx);
        if (nodeToRemove == null) {
            throw new IllegalArgumentException("Invalid index to remove");
        }
        if (nodeToRemove.prev != null) {
            nodeToRemove.prev.next = nodeToRemove.next;
        }
        if (nodeToRemove.next != null) {
            nodeToRemove.next.prev = nodeToRemove.prev;
        }
        if (nodeToRemove == head) {
            head = nodeToRemove.next;
        }
        if (nodeToRemove == last) {
            last = nodeToRemove.prev;
        }
        size--;
        return nodeToRemove.item;
    }

    public int size() {
        return size;
    }

    class Node<E> {

        E item;
        Node<E> next;
        Node<E> prev;

        public Node(E item, Node<E> next, Node<E> prev) {
            this.item = item;
            this.next = next;
            this.prev = prev;
        }
    }
}
