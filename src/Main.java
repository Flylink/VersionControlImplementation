public class Main {

    public static void main(String[] args) {
        int[] arr = {30, 90, 150};
        SalesManager salesManager = new SalesManager(arr);
        int max = salesManager.max();
        System.out.println(max);
    }
}
