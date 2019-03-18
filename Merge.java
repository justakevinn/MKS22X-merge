/*

mergesort(data,lo,hi):
  if lo >= hi :
    return
  mergesort left side
  mergesort right side
  merge */


public class Merge{

  public static void mergesort(int[]data){
    int[] temp = new int[data.length];
    for (int i = 0; i < data.length; i++){
      temp[i] = data[i];
    }
    return mergesortH(data, temp, 0, data.length-1);
  }

  public static void mergesortH(int[] data, int[] temp; int lo, int hi){
    int half = (hi + lo) / 2;
    if (lo < hi){
      int[] left = new int [half-lo+1];
      int[] right = new int [hi - half];
      for (int i = 0; i < left.length; i++) {
        left[i] = data[lo+i];
      }
      for (int i = 0; i < right.length; i++) {
        right[i] = data[half+i+1];
      }
      mergesortH(left, 0, left.length-1);
      mergesortH(right, 0, right.length-1);
    }
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
