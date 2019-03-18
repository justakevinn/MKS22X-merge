/*

mergesort(data,lo,hi):
  if lo >= hi :
    return
  mergesort left side
  mergesort right side
  merge */


public class Merge{

  public static void mergesort(int[]data){
    return mergesortH(data, 0, data.length);
  }

  public static void mergesortH(int data, int lo, int hi){
    if (lo >= hi){
      return;
    }
    int half = hi / 2;
  }

  private static void swap(int[] data, int x, int y){
    int hold = data[x];
    data[x] = data[y];
    data[y] = hold;
  }

  public static String toString(int[] data){
    String s = "[";
    for (int i = 0; i < data.length; i++){
      s = s + data[i] + ", ";
    }
    s += "]";
    return s;
  }

}
