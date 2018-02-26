package eg.edu.alexu.csd.filestructure.sort.Implementation;

import eg.edu.alexu.csd.filestructure.sort.INode;

public class Node<T extends Comparable<T>> implements INode<T> {

    private INode leftChild;
    private INode rightChild;
    private INode parent;
    private T value;

    public Node(INode<T> leftChild, INode<T> rightChild, INode<T> parent, T value) {
        this.leftChild = leftChild;
        this.rightChild = rightChild;
        this.parent = parent;
        this.value = value;
    }

    public Node(T value) {
        new Node<T>(null, null, null, value);
    }

    public Node() {
        new Node<T>(null, null, null, null);
    }

    public void setLeftChild(INode<T> leftChild) {
        this.leftChild = leftChild;
    }

    public void setRightChild(INode<T> rightChild) {
        this.rightChild = rightChild;
    }

    public void setParent(INode<T> parent) {
        this.parent = parent;
    }

    @Override
    public INode<T> getLeftChild() {
        return leftChild;
    }

    @Override
    public INode<T> getRightChild() {
        return rightChild;
    }

    @Override
    public INode<T> getParent() {
        return parent;
    }

    @Override
    public T getValue() {
        return value;
    }

    @Override
    public void setValue(T value) {
        this.value = value;
    }
}
