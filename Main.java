class Main {
  public static void main(String[] args) {
    int[] arr = {1, 3, 9, 7};
    System.out.println ("Testing print....");
    print (arr);

    System.out.println ("Testing avg....");
    System.out.println (avg(arr));

    search (arr, 9);
    search (arr, 6);

    print (arr);
    insert (arr, 2, 1);
    print (arr);
  }

  // Insert value "val" at index "ix", move everything else to the right
  public static void insert (int[] a, int val, int ix) {
    System.out.println ("Inserting " + val + " at index " + ix);
    // Move things over
    System.out.println ("Moving things over to make room");
    for (int i = a.length - 1; i > ix; i--) {
      a[i] = a[i - 1];
      print (a);
    }
    System.out.println ("Jamming in the value");
    a[ix] = val;
    print (a);
  }

  // Return the first index containing val in a, or -1
  public static int search (int[] a, int val) {
    System.out.println ("Searching for " + val);
    for (int i = 0; i < a.length; i++) {
      System.out.println ("Checking index " + i + ", which has value " + a[i]);
      if (a[i] == val) {
        System.out.println ("Found it");
        return i;
      }
    }
    System.out.println ("No match");
    return -1;
  }

  // Print - prints an array
  public static void print (int[] a) {
    System.out.print ("[");
    for (int val : a) {
      System.out.print(val + ", ");
    }
    System.out.println ("]");
  }

  public static double avg (int[] a) {
    double sum = 0;
    for (int val : a)
      sum += val;
    return sum/a.length;
  }
}