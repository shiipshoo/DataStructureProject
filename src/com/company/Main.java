package com.company;

public class Main {

    //(A) operation performed by the method do not change based on input size
    private static void simpleFunction(int n){
        System.out.println("Input arg is : " + n);
    }
    //(B) the default toString() implementation does not iterate over array elements
    private static void simpleFuncArray(int[] array){
        System.out.println("Simple array.toString() " + array.toString());
    }
    //(C) Operations performed depends on the number of elements in the array
    //were iterating what every element in the input array. N is the number of elements in the input array
    //should consider worst time complexity like in this example we used if block statement
    //this is considered as O(N)
    private static void simpleForLoop(int[] array){
        if(array.length % 2 !=0){ // Note: This is O(1)
            System.out.println("Length of array is odd");
        }else{//Note: This is O(N)
            for(int i = 0; i<array.length; i++){ //for(int i = 0; i<array.length / 2; i++) ~O(N/2) = O(N)
                System.out.println("Number: " + array[i] + " Square: " + array[i]*array[i]);
            }
        }

    }

    public static void main(String[] args) {
	    //(A) constant time O(1)
        System.out.println("Simple function demo constant time O(1)");
        simpleFunction(2);

        System.out.println("\nSimple function demo constant time O(1) with array & toString()");
        //(B) constant time O(1) || only display data type and memory location
        // doesn't depend on array size
        int[] array = {1};
        simpleFuncArray(array);
        int[] array1 = {1,2};
        simpleFuncArray(array1);

        System.out.println("\nSimple function demo linear time O(N)");
        //(C) linear time O(n) || the number of operations performed by our code is
        // directly proportional to the size of the input
        int[] array2 = {4,5};
        int[] array3 = {4,5,6};
        int[] array4 = {4,5,6,7};
        System.out.println("Array1");
        simpleForLoop(array2);
        System.out.println("Array2");
        simpleForLoop(array3);
        System.out.println("Array3");
        simpleForLoop(array4);

    }
}
