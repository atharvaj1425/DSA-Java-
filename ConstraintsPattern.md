# ⚡ DSA Constraints & Approach Cheat Sheet

---

## ✅ Quick Decision Table

| Constraint Range | Recommended Approach | Reason |
|------------------|----------------------|--------|
| n ≤ 10³          | Brute Force, Hashing | O(n²) is acceptable |
| n ≤ 10⁵ - 10⁶    | Sorting, Prefix Sum, Two Pointers, Sliding Window | Efficient linear or near-linear approaches needed |
| n ≥ 10⁷          | Single Pass O(n), Greedy, Counting Sort | Only O(n) or better allowed |
| Streaming Input or n ≥ 10⁸ | Bitwise, O(1) space, Math Tricks | Very tight space and time required |
| Element values ≤ 10³ | Frequency Array, Hashing | Small auxiliary array size is acceptable |
| Sorted Array Input | Binary Search, Two Pointers | Leverage order for speed |
| Subarray/Subsequence | Sliding Window, Two Pointers, DP | Structured search patterns |
| Find Pairs/Sums | HashMap, Set | Efficient lookup for complements |
| Unique/Repeats | HashSet or Frequency Map | Direct detection |

---

## 🔥 Common Problem Patterns

| Problem Type | Constraints | Best Approach |
|--------------|-------------|---------------|
| K-th Missing Positive | n ≤ 1000 | Hash Array |
| K-th Missing Positive | n > 1000 | Two Pointer |
| Max Subarray Sum | Any n | Kadane's Algorithm |
| Find Pair Sum | n ≤ 10⁵ | HashMap |
| Subarray Sum = K | n ≤ 10⁵ | Prefix Sum + HashMap |
| Sorted Array Pair Sum | Any n | Two Pointer |
| Range Sum | Any n | Prefix Sum |
| Duplicate Check | n ≤ 10⁵ | HashSet or Frequency Map |
| Flip Zeros / Longest Ones | n ≤ 10⁵ | Sliding Window |

---

## 📜 Scenario-Based Advice

- **Find K-th Missing Number (small n)** → Hash Array
- **Find K-th Missing Number (large n)** → Two Pointer
- **Max Consecutive Ones with K flips** → Sliding Window
- **Check Palindrome in Linked List** → Reverse second half, then compare
- **Find Subarray With Given Sum** → Prefix Sum + HashMap
- **Sorted Array Sum** → Two Pointer
- **Count Subarrays with Condition** → Sliding Window / Two Pointer
- **Detect Cycle in Linked List** → Floyd’s Tortoise-Hare Algorithm

---

## 💡 Golden Rules

- If **n ≤ 1000** → Brute Force is safe.
- If **array is sorted** → Use **Binary Search** or **Two Pointers**.
- If asked about **sum of subarrays** → Use **Prefix Sum**.
- If the question involves **distinct elements or repeats** → Use **Set/Map**.
- If time and space is tight → Think **Greedy**, **O(1)** space tricks.

---

