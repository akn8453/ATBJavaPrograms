package Task.Task_29102024;

public class Task29_1_Arrays_Sort {
    /*
    What is the Arrays.sort()?

The Arrays are a class from the java.util package that which provides the pre-defined sort() method.
Arrays.sort() is a static method which returns no value. When the sort array is called in Java,
it traverse through each element of an array and sorts it in ascending or descending order as specified.
The array can be of various data types, including int, long, char, and float.

Syntax of the Arrays.sort()?

The general syntax of the Arrays.sort() method is:
public static void sort(int[] ar, int from_index, int to_index)

In the above syntax:

ar: It is short for the array name
from_index: Parameter that marks the index (inclusive) of the element where the sorting begins.
to_index: Parameter that denotes the index (exclusive) of the element where the sorting ends.

What are the others ways of sort() in java?

1) Sort the Array in Java in Descending Order.
To sort an array in Java in descending order, you have to use the reverseOrder() method from the Collections class.
The reverseOrder() method does not parse the array. Instead, it will merely reverse the natural ordering of the array.
It means that you will first use the sort array in Java to sort it in ascending order and then reverse it with the reverseOrder() method.
One more thing worth noting is that the Collections.reverseOrder() does not support primitive type.
Hence, you must use “Integer” instead of “int” to define the integer data type array.

2) Sort Subarray in Java
Subarray is nothing but a part of a bigger array. For instance, if you take your ar array from the previous examples, it contains ten values.
If you sort only a few elements instead of the entire array, it is called sorting a subarray.
This can be done using the full syntax of the sort() method and providing the optional parameters from_index and to_index.
When you sort a subarray, the rest of the elements remain unchanged.

3) Sort an Array of Strings in Java in Alphabetical Order
For this type of sorting, we can use the normal arrays.sort method, without any parameters.
For the ascending order, use the Arrays.sort() method.
For the decending order, use the reverseOrder() method.


     */
}
