# DSA Pattern-Based Approach Cheat Sheet

| Pattern Name            | When to Use                                                                                 | Common Problems                                        |
|-------------------------|---------------------------------------------------------------------------------------------|--------------------------------------------------------|
| **Two Pointers**        | When dealing with sorted arrays, linked lists, or comparing elements at both ends          | Reverse Linked List, Two Sum (Sorted), Container With Most Water |
| **Sliding Window**      | When finding subarrays or substrings with specific properties (fixed size or variable)     | Maximum Subarray Sum of Size K, Longest Substring Without Repeating Characters |
| **Fast & Slow Pointers (Floyd’s Cycle)** | For detecting cycles, finding middle of linked list, palindrome linked list   | Linked List Cycle, Middle of Linked List, Palindrome LL |
| **Prefix Sum**          | When cumulative sums help reduce nested loops or check sums in range                       | Subarray Sum Equals K, Pivot Index, Running Sum |
| **Hashing/HashMap**     | When you need constant time lookup or frequency counting                                   | Two Sum, Group Anagrams, Longest Consecutive Sequence |
| **Binary Search**       | When the array is sorted or you are looking for a boundary/position                        | Search in Rotated Array, Kth Missing Positive, BS on Answer |
| **Greedy**              | When making a locally optimal choice leads to a global optimum                             | Jump Game, Gas Station, Partition Labels |
| **Backtracking**        | When trying all possible combinations or permutations                                      | N-Queens, Subsets, Combination Sum |
| **DFS/BFS**             | When exploring all nodes in a tree, graph, or matrix                                       | Clone Graph, Flood Fill, Number of Islands |
| **Dynamic Programming** | When you have overlapping subproblems and optimal substructure                             | Fibonacci, House Robber, Longest Palindromic Subsequence |
| **Heap/Priority Queue** | When needing access to largest/smallest elements repeatedly                                | Kth Largest Element, Top K Frequent Elements, Merge K Sorted Lists |
| **Union Find (DSU)**    | For connectivity problems in graphs                                                         | Number of Connected Components, Redundant Connection |
| **Bit Manipulation**    | When dealing with binary operations, subsets, toggling bits                                | Single Number, Sum of Two Integers, Subsets |
| **Monotonic Stack/Queue** | When needing previous/next greater or smaller elements                                  | Daily Temperatures, Next Greater Element, Sliding Window Maximum |

---

## 📌 Tip:
- If **sorted array + search → Binary Search or Two Pointers**  
- If **consecutive or subarray questions → Sliding Window or Prefix Sum**  
- If **unordered lookup/frequency → HashMap/Set**  
- If **cycle/middle element → Fast & Slow Pointers**  
- If **subsequences/combinations → Backtracking**  
- If **repeated max/min access → Heap**  

---

## ⭐ Recommended Approach Order (General):
1. Brute Force  
2. Sorting + Two Pointers  
3. HashMap/PrefixSum  
4. Sliding Window / Two Pointers  
5. Binary Search  
6. Greedy  
7. DFS/BFS / Backtracking  
8. Dynamic Programming  
9. Union Find / Bit Manipulation  

---