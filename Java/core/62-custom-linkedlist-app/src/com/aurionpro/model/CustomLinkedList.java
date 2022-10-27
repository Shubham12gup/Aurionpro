package com.aurionpro.model;

import java.util.Iterator;

public class CustomLinkedList {

	static class Node {

		private int data;
		private Node nextNode;

		public Node(int data) {
			this.data = data;
		}

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}

		public Node getNextNode() {
			return nextNode;
		}

		public void setNextNode(Node nextNode) {
			this.nextNode = nextNode;
		}
	}

	private Node head;
	private int size;

	public void insert(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node currentNode = head;
			while (currentNode.getNextNode() != null) {
				currentNode = currentNode.getNextNode();
			}
			currentNode.setNextNode(newNode);
		}
		size++;
	}

	public void insertNodeAt(int index, int data) {
		Node newNode = new Node(data);
		Node node = head;
		Node temp = null;
		if (index == 0) {
			newNode.setNextNode(head);
			head = newNode;
		} else {
			for (int i = 1; i < index; i++) {
				node = node.getNextNode();
			}
			temp = node.getNextNode();
			node.setNextNode(newNode);
			newNode.setNextNode(temp);
		}
		size++;

	}

	public void insertHead(int data) {
		Node newNode = new Node(data);
		newNode.setNextNode(head);
		head = newNode;
		size++;
	}

	public void remove(int data) {
		Node currNode = head, prev = null;

		if (currNode != null && currNode.data == data) {
			head = currNode.getNextNode(); // Changed head
			System.out.println(data + " found and deleted");
		} else {

			while (currNode != null && currNode.data != data) {
				prev = currNode;
				currNode = currNode.getNextNode();
			}

			if (currNode != null) {
				prev.nextNode = currNode.getNextNode();
				System.out.println(data + " found and deleted");
			}

			if (currNode == null) {
				System.out.println(data + " not found");
			}
		}
		size--;
	}

	public void removeNodeAt(int index) {
		if (index < size) {
		Node node = head;
		if (index == 0) {
			head = node.getNextNode();
		} else {
			for (int i = 0; i < index - 1; i++) {
				node = node.getNextNode();
			}
		}
		node.setNextNode(node.getNextNode().getNextNode());
		size--;
		} else {
			System.out.println("Index out of bound, enter index within size");
		}
	}

	public void display() {
		if (head != null) {
			Node currentNode = head;
			while (currentNode.getNextNode() != null) {
				System.out.println(currentNode.getData());
				currentNode = currentNode.getNextNode();
			}
			System.out.println(currentNode.getData());
		}
	}

	public Iterator<Integer> iterator() {
		return new LinkedListIterator();
	}

	public class LinkedListIterator implements Iterator<Integer> {

		Node current = head;

		@Override
		public boolean hasNext() {
			return current != null;
		}

		@Override
		public Integer next() {
			if (hasNext()) {
				int data = (int) current.data;
				current = current.nextNode;
				return data;
			}
			return null;
		}
	}
	
}
