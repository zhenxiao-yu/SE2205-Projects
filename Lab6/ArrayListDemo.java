public class ArrayListDemo {
  public static void main(String[] args) {
    ArrayList < Integer > myArray = new ArrayList < >(10);
    Integer[] data = new Integer[10];

    for (int i = 0; i < 10; i++) {
      data[i] = i + 1;
    }
    myArray.fillArray(data);

    System.out.println("Printing list in reverse order: ");
    while (myArray.walk.hasNext()) {
      System.out.print(myArray.walk.next() + " ");
    }
    System.out.println("\n");

    myArray.reset(0);
    myArray.fillArray(data);

    //start removing the data one by one and shifting the index
    for (int count = 0; count < data.length; count++) {
      int numOfItemsRemoved = 0;
      myArray.remove(0);
      System.out.println("Items removed: " + (count + 1));
      System.out.print("List:  ");
      while (myArray.walk.hasNext()) {
        System.out.print(myArray.walk.next() + " ");
        numOfItemsRemoved++;
      }
      System.out.print("\nIndex: ");
      for (int i = 0; i < numOfItemsRemoved; i++) {
        System.out.print(i + " ");
      }
      System.out.println("\n");
      myArray.resetIt();
    }

    //print the data again
    myArray.reset(0);
    for (int c = 0; c < data.length; c++) {
      myArray.add(c, data[c]);
    }

    System.out.println("Printing list in proper order: ");
    while (myArray.walk.hasNext()) {
      System.out.print(myArray.walk.next() + " ");
    }
  }
}
