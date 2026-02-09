import java.util.Arrays;

public class Heap {

//the actual storage structure for your heap

private int[] arr;
private int count = 0;

 

//constructor for your heap
//feel free to make one that takes in an array if you prefer for your testing purposes.
//note that we will not be inserting more than 100 elements into our array so you need not worry about re-sizing the array

public Heap() {

arr = new int[100];

}


//create this function to add elements to your heap
//all heap properties must be preserved
// 5 points

public void add(int toAdd) {
    arr[count] = toAdd;

    //recursive
    siftUp(count);
    count += 1;
    printHeap();
}


//remove the largest element of the heap (the root) and re-heapafy

//5 points

public void removeMax() {}

 

//this should check and alter the tree after an item is inserted

//3 points

private int siftUp(int index) {
    if(index<1) {
        return 0;
    }
    // if parent is smaller than child
    if(arr[(index - 1) /2] < arr[index]) {
        System.out.println("recursive end (" + index + ")");
        return 0;
    }

    System.out.println("swapped " + arr[index] + " with " + arr[(index - 1) /2]);
    int parentNode = arr[(index - 1) /2];
    
    arr[(index - 1) /2] = arr[index];
    arr[index] = parentNode;
    
    return siftUp((index - 1) /2);
}

 

//this should check and alter the tree after an item is deleted.

//3 points

private void siftDown(int index) {}

 

//4 points for syntax conventions.

private void printHeap() {
    for(int i = 0; i<arr.length; i++) {
        if(arr[i] > 0) {
            System.out.println(arr[i]);
        }
        else {
            break;
        }
    }
}

}