import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class IntroComparator {
    // Create a class of student.
    static class Students {
        String name;
        int mraks;

        public Students(String name, int mraks) {
            this.name = name;
            this.mraks = mraks;
        }
    }

    // For Object Custom sorting using Comparator.
    static class SortByMarks implements Comparator<Students> {
        @Override
        public int compare(Students a, Students b) {
            return b.mraks - a.mraks; // ascending.
        }
    }

    // For array Custom sorting using Comparator.
    static class Sort2dArray implements Comparator<int[]> {
        @Override
        public int compare(int a[], int b[]) {
            return a[0] - b[0]; // Sort Ascending order.
        }
    }

    public static void main(String[] args) {
        // 📘 What is Comparator ?
        // -> In Java, a Comparator is an interface used to define a custom sorting
        // logic for objects.
        // -> It is part of the java.util package.

        // Create a array list and store some of the students object.
        ArrayList<Students> list = new ArrayList<>();
        list.add(new Students("John", 32));
        list.add(new Students("John", 56));
        list.add(new Students("John", 42));
        list.add(new Students("John", 70));

        // Sort using comparator  See line no 18.
        Collections.sort(list, new SortByMarks());

        // iterate list and print.
        for (Students data : list) {
            System.out.println(data.name + " : " + data.mraks);
        }

        // Create a 2d array then sort using Comparator.
        int arr[][] = {
                { 4, 6 },
                { 2, 5 },
                { 3, 9 }
        };
        print2dArr(arr);

        // Sorting.
        Arrays.sort(arr, new Sort2dArray()); // Custom sort see line no : 26.
        Arrays.sort(arr, Comparator.comparingInt((o1) -> o1[0])); // Uses lamda function to sort
        print2dArr(arr);

    }

    // Create function that print 2d array.
    public static void print2dArr(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
