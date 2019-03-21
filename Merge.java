import java.util.*;


public class Merge{

  public static void insertionsort(int[] data, int lo, int hi){
        for (int i = lo; i < hi+1; i ++) {
            int k = data[i];
            for (int x = i; x > lo && k < data[x-1]; x --) {
                data[x] = data[x-1];
            }
            data[x] = k;
        }

    }



  public static void mergesort(int[]data){
  /* int[] temp = new int[data.length];
    for (int i = 0; i < data.length; i++){
      temp[i] = data[i];
    }*/
    mergesortH(data, 0, data.length-1);
  }

  public static void mergesortH(int[] data, int lo, int hi){
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
      merge(data, left, right);
    }
    else{
      System.out.println(Arrays.toString(data));
      return;
    }
  }

  public static void merge(int[] dest, int[] s1, int[] s2){
    int l = 0;
    int r = 0;
    int x = 0;
    while(l < s1.length && r < s2.length){
      if (s1[l] < s2[r]){
        dest[x] = s1[l];
        l++;
      }
      else{
        dest[x] = s2[r];
        r++;
      }
      x++;
    }
    while(l < s1.length){
      dest[x] = s1[l];
      x++;
      l++;
    }
    while(r < s2.length){
      dest[x] = s2[r];
      x++;
      r++;
    }
  }



  private static void swap(int[] data, int x, int y){
    int hold = data[x];
    data[x] = data[y];
    data[y] = hold;
  }

  public static void main(String[] args){
    int[] ary =  new int[] {4, 76, 3, 9 , 1, 2, 32, 5314, 754523, 123,76,35,2,65,235,453141,67325,3415,236};
    System.out.println(Arrays.toString(ary));
    mergesort(ary);
    System.out.println(Arrays.toString(ary));
  }
}
