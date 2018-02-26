package eg.edu.alexu.csd.filestructure.sort.Implementation;

import eg.edu.alexu.csd.filestructure.sort.IHeap;
import eg.edu.alexu.csd.filestructure.sort.ISort;

import java.util.ArrayList;

public class Sorter<T extends Comparable<T>> implements ISort<T> {

    @Override
    public IHeap<T> heapSort(ArrayList<T> unordered) {
        return null;
    }

    @Override
    public void sortSlow(ArrayList<T> unordered) {

    }

    @Override
    public void sortFast(ArrayList<T> unordered) {

        ArrayList<T> tempArray = (ArrayList<T>) unordered.clone();

        mergeSort(unordered, tempArray, 0, unordered.size() - 1);
    }

    private void mergeSort(ArrayList<T> unorderedArray, ArrayList<T> tempArray, int startIndex, int endIndex) {

        if (startIndex >= endIndex) {
            return;
        }

        int middleIndex = (startIndex + endIndex) / 2;

        mergeSort(unorderedArray, tempArray, startIndex, middleIndex);
        mergeSort(unorderedArray, tempArray, middleIndex + 1, endIndex);
        mergeHalves(unorderedArray, tempArray, startIndex, endIndex);
    }

    private void mergeHalves(ArrayList<T> unorderedArray, ArrayList<T> tempArray, int startIndex, int endIndex) {

        int middleIndex = (startIndex + endIndex) / 2;
        int leftHalfIterator = startIndex;
        int rightHalfIterator = middleIndex + 1;
        int tempArrayIndex = startIndex;

        while (leftHalfIterator <= middleIndex && rightHalfIterator <= endIndex) {
            if (unorderedArray.get(leftHalfIterator).compareTo(unorderedArray.get(rightHalfIterator)) <= 0) {
                tempArray.set(tempArrayIndex, unorderedArray.get(leftHalfIterator));
                leftHalfIterator++;
            } else {
                tempArray.set(tempArrayIndex, unorderedArray.get(rightHalfIterator));
                rightHalfIterator++;
            }
            tempArrayIndex++;
        }

        copyToArrayList(unorderedArray, tempArray, tempArrayIndex, leftHalfIterator);
        copyToArrayList(unorderedArray, tempArray, tempArrayIndex, rightHalfIterator);

        copyToArrayList(tempArray, unorderedArray, startIndex, endIndex);
    }

    private void copyToArrayList(ArrayList<T> origin, ArrayList<T> destination, int originStartIndex, int destinationStartIndex) {



    }

}
