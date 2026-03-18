# ⚡ Quick-Sort & Merge Utility (Java)

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)

This project demonstrates core computer science algorithms by implementing **Quick-Sort** from scratch and providing a custom utility to merge arrays while eliminating duplicate values.

## 🧠 Core Algorithms Implemented

### 1. Quick-Sort (Divide and Conquer)
Instead of relying on built-in sorting libraries, this project implements a custom recursive Quick-Sort.
- **Pivot Selection:** Chooses the last element as the pivot.
- **Partitioning:** Rearranges the array so that elements smaller than the pivot are on the left, and larger elements are on the right.
- **Time Complexity:** Average case $O(n \log n)$, making it highly efficient for large datasets.

### 2. Merge Utility with Duplicate Elimination
The `MergeUtility` class takes two independently sorted arrays and merges them into a single sorted array.
- **Smart Merging:** It uses a dual-pointer approach ($i$ and $j$) to compare elements step-by-step.
- **Duplicate Handling:** If an element exists in both arrays, it is only added once to the final merged array, ensuring clean and distinct data.

## 🚀 How to Run the Demo
The `Demo` class provides an interactive console interface:
1. Run the program.
2. Enter up to 50 unsorted integers for the first array (type `-1` to stop).
3. Enter up to 50 unsorted integers for the second array (type `-1` to stop).
4. The program will independently sort both arrays using Quick-Sort, merge them, remove duplicates, and print the final clean array.
