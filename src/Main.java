public class Main {

    public static void main(String[] args) {
        long[] arr = {30, 90, 150};
        SalesManager salesManager = new SalesManager(arr);
        long max = salesManager.max();
        System.out.println(max);
    }
}
