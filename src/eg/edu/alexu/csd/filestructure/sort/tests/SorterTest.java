package eg.edu.alexu.csd.filestructure.sort.tests;

import eg.edu.alexu.csd.filestructure.sort.Implementation.Sorter;
import org.junit.Test;

import java.util.ArrayList;

public class SorterTest {

    ArrayList<Integer> numbers = new ArrayList<>();
    Sorter<Integer> sorter = new Sorter<>();


    @Test
    public void sortFast() {

        for (int i = 10; i > 0; i--) {
            numbers.add(i);
        }

        System.out.print(numbers);
        sorter.sortFast(numbers);
        System.out.print(numbers);
    }
}