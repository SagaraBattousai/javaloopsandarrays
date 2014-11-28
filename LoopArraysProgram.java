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

   // printTable(numBuckets);
   // printHist(
 // }    
 // private static void printTable( {
    System.out.println("Bucket|Frequency (i)");
    System.out.println("============================");
   //for(int i = 0; i < numBuckets; i++){
      for(double j = min; j < max; j += inc){
        System.out.println(j + " <= i < " + (j + inc) + " | " + 
            freq [f]);
        f++;
      }
    
  
/*private static void printHist(   */ //{
      System.out.println("");
      for(int i = LoopArraysLibrary.maximum(freq); i > 0; i--){
      String gaps = "     ";
      System.out.print(i + " |");
        for(int j = 0; j < numBuckets; j++){
          if (freq[j] >= i){
            System.out.print("    ##    ");
   //         gaps += "    ";
          } else {
            System.out.print("          ");

       //   gaps += "      ";
          }
      }
      System.out.println("");
          }
      System.out.println("  +---------------------------------------------" +
         "----------------------->");
      System.out.print("   ");
      for(double j = min; j < max; j += inc){
        System.out.print(j + "_" + (j + inc) + " | ");
      } 
     System.out.println(""); 



        }
}
