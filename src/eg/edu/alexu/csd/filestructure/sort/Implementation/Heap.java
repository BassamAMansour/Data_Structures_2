package eg.edu.alexu.csd.filestructure.sort.Implementation;

import eg.edu.alexu.csd.filestructure.sort.IHeap;
import eg.edu.alexu.csd.filestructure.sort.INode;

import java.util.Collection;

public class Heap<T extends Comparable<T>> implements IHeap<T> {
    @Override
    public INode<T> getRoot() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void heapify(INode<T> node) {

    }

    @Override
    public T extract() {
        return null;
    }

    @Override
    public void insert(T element) {

    }

    @Override
    public void build(Collection<T> unordered) {

    }
}
