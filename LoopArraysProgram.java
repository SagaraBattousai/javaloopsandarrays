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
    for(int j = 0; j < numBuckets; j++){
      for(int i = LoopArraysLibrary.maximum(freq); i > 0; i--){
        if (freq[j] == i){
          switch(j){
            case 0: System.out.println(i + "|#");
            case 1: System.out.println(i + "| #");
            case 2: System.out.println(i + "|  #");
            case 3: System.out.println(i + "|   #");
            case 4: System.out.println(i + "|    #");
            case 5: System.out.println(i + "|     #");
          }
        }
      } 
    }
  }
  }

/*




















  private static String spaces(int s){
    if (s == 0){
      return "";
    }
    return spacePrime("", s);
  }

  private static String spacePrime(String a, int s){
    if (s == 0){
      return a + "";
    }
    return spacePrime(a + " ", s -1);
  }*/

