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

public void removeMax() {
    arr[0] = arr[count-1];
    arr[count-1] = 0;

    count -= 1;
    siftDown(0);

    printHeap();
}



//this should check and alter the tree after an item is inserted

//3 points

private int siftUp(int index) {
    if(index<1) {
        return 0;
    }
    // if parent is smaller than child
    if(arr[(index - 1) /2] < arr[index]) {
        //System.out.println("recursive end (" + index + ")");
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

private int siftDown(int index) {
    if(index>=count-1) {
        return 0;
    }

    //left child is smaller than parent
    if(arr[(2*index)+1] < arr[index] && arr[(2*index)+1] > 0) {
        int savedNum = arr[(2*index)+1];
        arr[(2*index)+1] = arr[index];
        arr[index] = savedNum;
        //System.out.println("sifted down left child");
        return siftDown((2*index)+1);
    }
    
    //right child is smaller than parent
    if(arr[(2*index)+2] < arr[index] && arr[(2*index)+2] > 0) {
        int savedNum = arr[(2*index)+2];
        arr[(2*index)+2] = arr[index];
        arr[index] = savedNum;
        //System.out.println("sifted down right cild");
        return siftDown((2*index)+2);
    }
    return 0;
}

 

//4 points for syntax conventions.

private void printHeap() {
    for(int i = 0; i<count; i++) {
        System.out.println(arr[i]);
    }
    System.out.println("Count: " + count);
}

}