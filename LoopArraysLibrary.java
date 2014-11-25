public class LoopArraysLibrary {

  public static int fib(int n) {
    assert (n > 0):"There is no Zero term and I use regular Fib ie start at 1!";
    if (n == 1 || n == 2){
      return 1;
    }
    int a = 1, b = 1;
    int c = 0;  
    for(int i = 3; i <= n; i++){     
      c = a + b;
      a = b;
      b = c;
    }
    return c;
  }

  public static int maximum(int[] ms) {
    int h = 0;
    for (int s : ms){
      if (s > h){
        h = s;
      }
    }
    return h;
  }

  public static int[] frequencyTable(double minimum, double maximum,
    int numBuckets, double[] data) {
    assert (minimum <= maximum):
      "Invalid, Minimum cannot be greater than the Maximum";
    assert (numBuckets >= 0): "You gotta have some numBuckets!";
    
    double inc = (Math.abs(maximum - minimum)) / numBuckets;
    int [] freq = new int[numBuckets];
          

    for (int j = 0; j < data.length; j++){
      int k = 0;
      for (double i = minimum; i < maximum; i += inc){
          
          if (data[j] >= i && data[j] < (i + inc)){
            freq[k] += 1;
            break; // no point looking at other rows therefore exit to top loop.
          }      
          k ++;
        } 
      } 
    return freq;



  }

  public static double[][] matrixMultiply(double[][] m, double[][] n) {
    // TODO: Implement this
    return null;
  }
}
