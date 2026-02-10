import java.util.Arrays;

public class main {

public static void main(String[] args) {

  Heap testHeap = new Heap();

  testHeap.add(10);
  testHeap.add(20);
  testHeap.add(30);
  testHeap.add(5);

  System.out.println("--Now testing remove--");

  testHeap.removeMax();
  testHeap.removeMax();
  testHeap.removeMax();


}

}
