# 🚀 DSA Pattern-Based Approach Cheat Sheet

---

## 🧭 Patterns & When to Use Them

| 🧩 Pattern                 | ✅ When to Use                                                                 | 📌 Common Problems & Examples |
|---------------------------|----------------------------------------------------------------------------------|------------------------------|
| **Two Pointers** 🧩       | Sorted arrays, linked lists, or comparing ends                                 | `Two Sum (sorted)`, `Container With Most Water`, `Reverse Linked List` |
| **Sliding Window** 🌊     | Subarrays or substrings (fixed/variable length)                                | `Max Subarray of Size K`, `Longest Substring Without Repeating Characters` |
| **Fast & Slow Pointers** 🐢🐇 | Detect cycle, find middle of LL, palindrome LL                                | `Cycle in Linked List`, `Middle of Linked List`, `Palindrome Linked List` |
| **Prefix Sum** ➕          | Use cumulative sums to eliminate nested loops                                   | `Subarray Sum = K`, `Pivot Index`, `Running Sum Queries` |
| **HashMap / HashSet** 🗝️ | Constant time lookup, frequency counting                                       | `Two Sum`, `Group Anagrams`, `Longest Consecutive Sequence` |
| **Binary Search** 🔍       | Sorted arrays or looking for boundaries/positions                              | `Search in Rotated Array`, `Kth Missing Positive`, `Binary Search on Answer` |
| **Greedy** ✅             | Locally optimal choice leads to globally optimal solution                       | `Jump Game`, `Gas Station`, `Partition Labels` |
| **Backtracking** 🧠        | Explore all possibilities/combinations/permutations                            | `N-Queens`, `Subsets`, `Combination Sum` |
| **DFS / BFS** 🌐           | Tree/Graph traversal, Matrix exploration                                       | `Clone Graph`, `Flood Fill`, `Number of Islands` |
| **Dynamic Programming** 💡 | Optimal substructure + overlapping subproblems                                 | `Fibonacci`, `House Robber`, `Longest Palindromic Subsequence` |
| **Heap / Priority Queue** 📈 | Repeated access to smallest/largest elements                                   | `Kth Largest Element`, `Top K Frequent Elements`, `Merge K Sorted Lists` |
| **Union-Find (DSU)** 🔗    | Graph connectivity, Disjoint Sets                                              | `Connected Components`, `Redundant Connection` |
| **Bit Manipulation** ⚙️   | Toggle bits, check subsets, binary operations                                  | `Single Number`, `Sum of Two Integers`, `Subset Enumeration` |
| **Monotonic Stack/Queue** 📋 | Find next/previous greater or smaller elements                               | `Daily Temperatures`, `Next Greater Element`, `Sliding Window Maximum` |

---

## 🛠️ Quick Tips for Pattern Recognition

- **Sorted array + search** → Use **Two Pointers** or **Binary Search**
- **Consecutive elements or subarray problems** → Use **Sliding Window** or **Prefix Sum**
- **Frequency or existence check** → Use **HashMap / HashSet**
- **Linked List cycle or middle node problems** → Use **Fast & Slow Pointers**
- **Generating combinations/permutations** → Use **Backtracking**
- **Repeated min/max retrieval** → Use **Heap / Priority Queue**
- **Graph traversal** → Use **DFS / BFS**
- **Optimal substructure with overlaps** → Use **Dynamic Programming**
- **Connected components in graphs** → Use **Union-Find**
- **Binary operations or subset problems** → Use **Bit Manipulation**

---

## 🏆 Recommended Approach Order (General)

1. 💡 Start with **Brute Force** for clarity.
2. 🔀 Consider **Sorting + Two Pointers** if ordering helps.
3. 🗝️ Check **HashMap / Prefix Sum** for lookup/counting.
4. 🌊 Use **Sliding Window** for subarray/window-based problems.
5. 🔍 Apply **Binary Search** on sorted or boundary questions.
6. ✅ Use **Greedy** when local choices can lead to global solution.
7. 🌐 Explore **DFS / BFS** or **Backtracking** when exhaustive search is required.
8. 💡 Use **Dynamic Programming** when overlapping subproblems exist.
9. 🔗 Consider **Union-Find**, **Bit Manipulation**, **Heap**, or **Monotonic Stack** for specialized problems.

---

## 📘 Example Walkthroughs

- **Find 3rd Missing Positive in `[2,3,4,7,11]`** → *Binary Search with `missing = arr[i] – (i+1)`*
- **Longest Subarray with ≤ k Zeros** → *Sliding Window (Expand + Shrink window)*
- **Longest Palindromic Substring** → *Dynamic Programming (Expand Around Center)*
- **Detect Cycle in Linked List** → *Fast & Slow Pointers*

---

## 💡 Interview Strategy Summary

- ✅ Start with a brute-force sketch
- 🔀 Check if sorting helps simplify the problem
- 🗝️ Check if hashing can optimize it to linear time
- 🌊 If the problem involves consecutive elements — think **Sliding Window**
- 🔍 If sorted with search — think **Binary Search**
- ✅ Greedy if decisions seem straightforward for max/min problems
- 🌐 Explore graphs or trees with **DFS/BFS**
- 💡 Consider **DP** for overlapping subproblems
- 📈 Use specialized structures like **Heap**, **DSU**, **Bit Manipulation** when applicable

---

📝 **Keep this handy before interviews or problem-solving practice. Mastering the art of choosing the right pattern unlocks a new level of efficiency in solving DSA problems.**

🎯 Happy Coding & Problem Solving! 🚀