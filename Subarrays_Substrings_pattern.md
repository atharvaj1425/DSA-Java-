# Sliding Window & Subarray/Substr Cheat Sheet

This is a quick reference guide for identifying the correct approach for various subarray and substring problems. Problems are categorized by goal (e.g., max length, count of subarrays) and solution strategy (sliding window, prefix sum + hashmap, etc.).

| Problem Type                   | Problem                                        | Input Types                        | Goal                                | Approach                           | Notes                             |
| ------------------------------ | ---------------------------------------------- | ---------------------------------- | ----------------------------------- | ---------------------------------- | --------------------------------- |
| **1. Max/Min Length Subarray** | Maximum Consecutive Ones                       | Binary array                       | Max length of contiguous 1s         | Sliding Window                     | Count 1s, track max stretch       |
|                                | Maximum Consecutive Ones 2                     | Binary array, flip at most one 0   | Max length of 1s                    | Sliding Window with at most 1 zero | Maintain zero count               |
|                                | Max Consecutive Ones III                       | Binary array, at most k 0s flipped | Max length of 1s                    | Sliding Window, shrink on >k zeros | Generalized version of above      |
|                                | Longest Substring Without Repeating Characters | String                             | Longest substring with unique chars | Sliding Window + HashMap           | Map stores last seen index        |
|                                | Longest Repeating Character Replacement        | String and k                       | Max substring with ≤k replacements  | Sliding Window + maxFreq tracking  | Maintain max char count in window |

\| **2. Max/Min Length Subarray With Given Sum** | Longest Subarray with Sum = K (positive nums) | Positive integers | Max length with sum = K | Sliding Window | Expand/shrink with running sum |
\|  | Longest Subarray with Sum = K (positives + negatives) | Any integers | Max length with sum = K | Prefix Sum + HashMap | Map stores first index for each sum |
\|  | Kadane's Algorithm | Any integers | Max sum subarray | Dynamic Programming / Sliding Window | Local max and global max |
\|  | Print subarray with max sum | Any integers | Print indices of subarray with max sum | Kadane's variation | Track start/end indices |

\| **3. Total Count of Valid Subarrays** | Binary Subarray With Sum | Binary array, target sum | Count subarrays with sum = target | Prefix Sum + HashMap | HashMap stores sum frequencies |
\|  | Count Number of Nice Subarrays | Integer array | Count subarrays with exactly k odd numbers | atMost(k) - atMost(k-1) trick | Sliding Window Count |
\|  | Number of Substrings Containing All 3 Characters | String of a,b,c | Count substrings containing at least 1 a, b, c | Sliding Window | Maintain last seen positions |

---

### Utility Functions/Patterns

#### `atMost(nums, k)`

```java
int atMost(int[] nums, int k) {
    int l = 0, res = 0;
    for (int r = 0; r < nums.length; r++) {
        if (nums[r] % 2 == 1) k--;
        while (k < 0) {
            if (nums[l] % 2 == 1) k++;
            l++;
        }
        res += r - l + 1;
    }
    return res;
}
```

Then:

```java
numberOfSubarrays = atMost(nums, k) - atMost(nums, k - 1);
```

---

# 🧭 When to Use What?

| Situation                          | Recommended Strategy           | Why                                           |
|------------------------------------|--------------------------------|-----------------------------------------------|
| All elements are positive          | Sliding Window                 | Can safely expand/shrink                      |
| Elements may be negative           | Prefix Sum + HashMap           | Sliding window breaks due to negative values  |
| Max/Min length of valid window     | Sliding Window                 | Efficiently track window length               |
| Total count of valid subarrays     | Prefix Sum or atMost Trick     | Frequency-based counting                      |
| Unique characters or replacements  | Sliding Window + Freq Array/Map| Need character-level tracking                 |

---

# 🧩 Extra Problems to Explore

| Problem                              | Hint/Technique                         |
|--------------------------------------|----------------------------------------|
| Subarrays with Product < K           | Sliding Window with multiplication     |
| Count Subarrays with Bounded Max     | Sliding Window with conditions         |
| Minimum Window Substring             | Hard; Two pointers + HashMap           |
| Max Sum Subarray of Size K           | Fixed Size Window                      |

---

# 🧱 Patterns Summary

- **Sliding Window** works well with **non-negative numbers** and **growing/shrinking windows**.
- **Prefix Sum + HashMap** is needed when values can be **negative** or **exact sums** are required.
- **`atMost(k) - atMost(k-1)`** is a great trick when counting subarrays with **exact constraints**.
- **Character frequency** problems (like replacements or unique substrings) benefit from **maps or arrays** for frequency tracking.

### Notes:

* Use **sliding window** when elements are non-negative and you can **shrink/grow** the window easily.
* Use **prefix sum + hashmap** when the array contains **negative numbers** or the window cannot be shrunk easily.
* For **exact count of subarrays**, `atMost(k) - atMost(k-1)` pattern works well.
* **Character replacement** problems generally track **max frequency** of a character in a window.

---

### More Problems To Explore:

* Subarrays with product less than k (positive integers)
* Count subarrays with bounded maximum
* Minimum window substring (harder)
* Maximum sum subarray of size k

Feel free to expand this table with new problems and patterns!



