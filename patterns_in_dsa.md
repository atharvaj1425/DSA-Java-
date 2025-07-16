# 🚀 DSA Pattern-Based Approach Cheat Sheet

---

## 🧭 Patterns & When to Use Them

| 🧩 Pattern                 | ✅ When to Use                                                                 | 📌 Common Problems & Examples |
|---------------------------|----------------------------------------------------------------------------------|------------------------------|
| **Two Pointers** 🧩       | Sorted arrays, linked lists, or comparing ends                                 | `Two Sum (sorted)`, `Container With Most Water`, `Reverse Linked List` |
| **Sliding Window** 🌊     | Subarrays or substrings (fixed/variable length)                                | `Max Subarray of Size K`, `Longest Substring without Repeating Characters` |
| **Fast & Slow Pointers** 🐢🐇 | Detect cycle, find middle of LL, palindrome LL                                | `Cycle in Linked List`, `Middle of Linked List`, `Palindrome Linked List` |
| **Prefix Sum** ➕          | Use cumulative sums to eliminate nested loops                                   | `Subarray Sum = K`, `Pivot Index`, `Running Sum Queries` |
| **HashMap / HashSet** 🗝️ | Use when needing O(1) lookups/frequency counting                                | `Two Sum`, `Group Anagrams`, `Longest Consecutive Sequence` |
| **Binary Search** 🔍       | Sorted arrays or when looking for boundaries                                   | `Search in Rotated Array`, `Kth Missing Positive`, `Binary Search on Answer` |
| **Greedy** ✅             | Locally optimal choices → globally optimal results                               | `Jump Game`, `Gas Station`, `Partition Labels` |
| **Backtracking** 🧠        | Generate all combinations/permutations                                         | `N-Queens`, `Subsets`, `Combination Sum` |
| **DFS / BFS** 🌐           | Traversing trees, graphs, or matrix                                             | `Clone Graph`, `Flood Fill`, `Number of Islands` |
| **Dynamic Programming** 💡 | Overlapping subproblems & optimal substructure                                 | `Fibonacci`, `House Robber`, `Longest Palindromic Subsequence` |
| **Heap / Priority Queue** 📈 | Needing repeated access to min/max                                             | `Kth Largest Element`, `Top K Frequent Elements`, `Merge K Sorted Lists` |
| **Union-Find (DSU)** 🔗    | Graph connectivity or merging sets                                             | `Connected Components`, `Redundant Connection` |
| **Bit Manipulation** ⚙️   | Binary operations, subsets, toggling bits                                      | `Single Number`, `Sum of Two Integers`, `Subset Enumeration` |
| **Monotonic Stack/Queue** 📋 | Next/previous greater/smaller elements                                        | `Daily Temperatures`, `Next Greater Element`, `Sliding Window Maximum` |

---

## 🛠️ Quick Tips

- **Sorted array + search** → Try **Two Pointers** or **Binary Search**  
- **Subarrays Questions** → Go for **Sliding Window** or **Prefix Sum**  
- **Frequency or existence checks** → Use **HashMap / Set**  
- **Linked List mid/cycle** → Use **Fast & Slow Pointers**  
- **Generate combinations/subsets** → Opt for **Backtracking**  
- **Repeating max/min queries** → Use a **Heap / Priority Queue**

---

## 🏆 Interview Strategy

1. Start with **Brute Force** (ensure correctness).  
2. See if **sorting** helps (O(n log n)) → Then add **Two Pointers**.  
3. Consider **Hashing / Prefix Sum** (O(n), O(1) extra).  
4. Move to **Sliding Window** for subarray problems.  
5. For sorted constraints, use **Binary Search**.  
6. If greedy logic works, apply it.  
7. Use **DFS/BFS** or **Backtracking** for recursive or graph/tree tasks.  
8. Last resort for optimal → **Dynamic Programming**.  
9. Specialized scenarios → **Union-Find**, **Bit Manipulation**, **Heap**, or **Monotonic Stack**.

---

## 📘 Example Walkthroughs

- **Find 3rd Missing Positive in [2,3,4,7,11]** → *Binary Search using missing = arr[i] – (i+1)*  
- **Longest Subarray with ≤ k Zeros** → *Sliding Window (expand + shrink)*  
- **Longest Palindromic Substring** → *Dynamic Programming (expand around center)*  
- **Detect Cycle in Linked List** → *Fast & Slow Pointers*

---

Keep this guide handy during your practice and interviews—happy coding! 🚀