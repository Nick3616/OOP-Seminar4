public class Task2 {
    public static void main(String[] args) {
        printArray print = new printArray();
        String[] people = new String[]{"Tom", "Alice", "Sam", "Kate", "Bob", "Helen"};
        Integer[] numbers = new Integer[]{1, 2, 34, 6, 12, 45, 8};
        print.print(people);
        print.print(numbers);
    }
}

class printArray {

    public <T> void print(T[] items) {
        for (T item : items) {
            System.out.println(item);
        }
    }
}
