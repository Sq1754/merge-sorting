# Merge Sort Algorithm Implementation

This Java program implements the Merge Sort algorithm to sort an array of integers.

## Description

The `MergeSort.java` program sorts an array of integers using the Merge Sort algorithm. Merge Sort is a divide-and-conquer algorithm that recursively divides the array into smaller subarrays, sorts them, and then merges them back together. The `conquer` method is used to merge two sorted subarrays, while the `divide` method recursively divides the array into halves until individual elements are reached.

## Features

- **Divide and Conquer**: The algorithm divides the array into smaller subarrays until individual elements are reached, then merges them back together in sorted order.
- **Merge Operation**: The `conquer` method merges two sorted subarrays into a single sorted array.
- **Recursion**: The algorithm uses recursion to divide the array into smaller subarrays and solve them individually.

## Example
Here's an example of the sorted array using the Merge Sort algorithm:

```
Input: [2, 1, 7, 9, 5, 3, 8, 4, 6, 4, 0]
Output: [0, 1, 2, 3, 4, 4, 5, 6, 7, 8, 9]
