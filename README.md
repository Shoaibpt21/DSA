Selection Sort
This project provides a simple implementation of the Selection Sort algorithm, which is a comparison-based sorting algorithm.

📋 Description
Selection Sort divides the input list into two parts: the sublist of items already sorted, which is built up from left to right, and the sublist of items remaining to be sorted. The algorithm repeatedly selects the smallest (or largest, depending on sorting order) element from the unsorted sublist and moves it to the end of the sorted sublist.

Time Complexity:
Worst Case: O(n²)

Average Case: O(n²)

Best Case: O(n²)

Space Complexity:
O(1) – In-place sorting

Stability:
Not stable

🛠️ How It Works
Find the minimum element in the unsorted part of the array.

Swap it with the first unsorted element.

Repeat until the entire array is sorted.
