import java.util.Arrays;

public class LoopArraysTestSuite {

    public static void main(String[] args) {
        System.out.println("Running tests...");

        fibTests();
        maximumTests();
        frequencyTableTests();
        matrixMultiplyTests();

        System.out.println("...tests complete.");
    }

    public static void fibTests() {
        testFib(5, 5);
        testFib(1, 1);
        testFib(2, 1);
        testFib(8, 21);
        testFib(7, 13);
               
    }

    public static void maximumTests() {
        testMaximum(new int[] { 1, 3, 2 }, 3);
        testMaximum(new int[] { 543, 0, -153 }, 543);
        testMaximum(new int[] { 1,-4335475,-453742}, 1);
        testMaximum(new int[] { 354354,4543387,4563647}, 4563647);

    }

    public static void frequencyTableTests() {
        testFrequencyTable(-1.5, 1.5, 6
                          ,new double[] { -1.1, 1.1, 1.2, -0.8, 1.6 }
                          ,new int[] { 1, 1, 0, 0, 0, 2 });
        testFrequencyTable(0, 10, 5
                          ,new double[] { 4, 1.7, 1.2, 5, 2.5 }
                          ,new int[] { 2, 1, 2, 0, 0 });
        testFrequencyTable(0, 10, 5
                          ,new double[] { 1.7, 5, 2.3, 6, 2.7 }
                          ,new int[] {1, 2, 1, 1, 0 });
        testFrequencyTable(-20, 5, 10
                          ,new double[] {-17, -5, -12, -1.2, -1.7, -25,
                            -6, -18, -19, -1.25 }
                          ,new int[] { 2, 1, 0, 1, 0, 1, 1,  3, 0, 0 });
    }

    public static void matrixMultiplyTests() {

        testMatrixMultiply(new double[][] { { 1, 2, 3, 4 }
                                          , { 5, 6, 7, 8 }
                                          , { 9, 1, 2, 3 }
                                          }
                          ,new double[][] { { 1, 2, 3 }
                                          , { 4, 5, 6 }
                                          , { 7, 8, 9 }
                                          , { 1, 2, 3 }
                                          }
                          , new double[][] { { 34, 44, 54 }
                                           , { 86, 112, 138 }
                                           , { 30, 45, 60 } });
        testMatrixMultiply(new double[][] { { 1, 6 }
                                          , { 3, 8 }
                                          }
                          ,new double[][] { { 2, 2 }
                                          , { 9, 7 }
                                          }
                          , new double[][] { { 56, 44 }
                                           , { 78, 62 } });
/*        testMatrixMultiply(new double[][] { { 331, 349, 367, 383 }
                                          , { 337, 353, 373, 389 }
                                          , { 347, 359, 379, 397 }
                                          , { 509, 547, 487, 587 }
                                          , { 1033, 1039, 1049, 1051 }
                                          , { 1061, 1063, 1069, 1087 } 
                                          }
                          ,new double[][] { { 683, 691, 701, 709, 719, 727 }
                                          , { 733, 739, 743, 751, 757, 761 }
                                          , { 769, 773, 787, 797, 809, 811 }
                                          , { 821, 823, 827, 829, 839, 853 }
  
                          , new double[][] { { 34, 44, 54 }
                                           , { 86, 112, 138 }
                                           , { 30, 45, 60 } });
    */}

    private static final double EPSILON = 0.001;

    private static boolean approxEqualDouble(double a, double b) {
      return a == b
          || Math.abs(a - b) / Math.max(Math.abs(a), Math.abs(b)) < EPSILON;
    }

    private static boolean approxEqualDoubleArrays(double[][] x, double[][] y) {
      if (x.length != y.length){
        return false;
      }
      /*By initialising c and d at the beginning and by adding c = a (line71)
      and d = b (line77) there is no need to increment c and d at specific
      loop ending and so read-ability is far increased over random
      initialsation and increment of b and c at random placing.*/
      int c,d = 0;
      for(int a = 0; a < x.length; a++){
        c = a;
        if (x[a].length != y[c].length){
          return false;
          }
          for(int b = 0; b < x[a].length; b++){
            d = b;
            if (!approxEqualDouble(x[a][b], y[c][d])){
              return false;
            }
          }
        }
        return true;
    }

    private static void testFib(int n, int expected) {
        int actual = LoopArraysLibrary.fib(n);
        if (expected != actual) {
            System.out.println("fib(" + n + "); expected: " + expected
                    + " got: " + actual);
        }
    }

    private static void testMaximum(int[] vs, int expected) {
        int actual = LoopArraysLibrary.maximum(vs);
        if (expected != actual) {
            System.out.println("maximum(" + Arrays.toString(vs)
                    + "); expected: " + expected + " got: " + actual);
        }
    }

    private static void testFrequencyTable(double minimum, double maximum,
            int numBuckets, double[] data, int[] expected) {
        int[] actual = LoopArraysLibrary.frequencyTable(minimum, maximum,
                numBuckets, data);

        if (!Arrays.equals(expected, actual)) {
            System.out.println("frequencyTable(" + minimum + ", " + maximum
                    + ", " + numBuckets + ", " + Arrays.toString(data)
                    + "); expected: " + Arrays.toString(expected) + " got: "
                    + Arrays.toString(actual));
        }
    }

    private static void testMatrixMultiply(double[][] m, double[][] n,
            double[][] expected) {
        double[][] actual = LoopArraysLibrary.matrixMultiply(m, n);

        if (!approxEqualDoubleArrays(expected, actual)) {
            System.out.println("matrixMultiply(" + Arrays.deepToString(m)
                    + ", " + Arrays.deepToString(n) + "); expected: "
                    + Arrays.deepToString(expected) + ", got: "
                    + Arrays.deepToString(actual));
        }
    }

}
