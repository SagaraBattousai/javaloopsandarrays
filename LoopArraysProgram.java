public class LoopArraysProgram {

  public static void main(String[] args) {

    System.out.println("Please enter the amount of data you have (n) and" +
        " the the n values, each separated by a space: ");

    int n = IOUtil.readInt();
    double[] values = new double[n];
    for(int i = 0; i < n; i++){
      values[i] = IOUtil.readDouble(); 
    }
    System.out.println("Please enter the minimum and maximum values" +
       " respectivly followed by the number of ranges (Buckets) :");

    double min = IOUtil.readDouble();
    double max = IOUtil.readDouble();
    int numBuckets = IOUtil.readInt();
    double inc = (Math.abs(max - min)) / numBuckets;
    int f = 0;
    int[] freq = LoopArraysLibrary.frequencyTable(min, max, numBuckets,
        values);
//    double [][] buckets = new double [numBuckets][2]; //2 is for the two limits
//  public static void       
    System.out.println("Bucket|Frequency (i)");
    System.out.println("============================");
   //for(int i = 0; i < numBuckets; i++){
      for(double j = min; j < max; j += inc){
        System.out.print(j + " <= i < " + (j + inc) + " ");
        System.out.println( " | " + freq [f]);
        f++;
      }
  
  
  
  
  
  
  
  
  
  }
  
  
  
  
  
  
  
  
  
  
  
  }
