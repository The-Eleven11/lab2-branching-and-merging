public class DataTypes {
    // TODO TASK 1: fix this code so that it passes the test in DataTypesTest.java

//    public static void main(String[] args) {
//        sum([5,6,7]);
//    }

    public static long sum(int[] numbers) {
        long s = 0; // variable to accumulate the sum in!
        // below is a "foreach" loop which iterates through numbers
        for (int x : numbers) {
            s += x;
        }
        return s;
    }
}
