# Sliding Window & Subarray/Substr Cheat Sheet

This is a quick reference guide for identifying the correct approach for various subarray and substring problems. Problems are categorized by goal (e.g., max length, count of subarrays) and solution strategy (sliding window, prefix sum + hashmap, etc.).

# 🧪 Subarray & Substring Patterns Cheat Sheet

---

## 🧱 1. Max/Min Length Subarray or Substring

| Problem                                     | Input Types                          | Goal                                 | Approach                            | Notes                                  |
|--------------------------------------------|--------------------------------------|--------------------------------------|-------------------------------------|----------------------------------------|
| Maximum Consecutive Ones                   | Binary array                         | Max length of contiguous 1s          | Sliding Window                      | Count 1s, track max stretch            |
| Maximum Consecutive Ones II                | Binary array, flip at most one 0     | Max length of 1s                     | Sliding Window with at most 1 zero  | Maintain zero count                    |
| Max Consecutive Ones III                   | Binary array, flip at most k 0s      | Max length of 1s                     | Sliding Window, shrink if >k zeros  | Generalized version of above           |
| Longest Substring Without Repeating Chars  | String                               | Longest substring with unique chars  | Sliding Window + HashMap            | Map stores last seen index             |
| Longest Repeating Character Replacement    | String and k                         | Max substring with ≤k replacements   | Sliding Window + maxFreq tracking   | Maintain max char count in window      |

---

## 🎯 2. Max/Min Length Subarray With Given Sum

| Problem                                     | Input Types                          | Goal                                 | Approach                            | Notes                                  |
|--------------------------------------------|--------------------------------------|--------------------------------------|-------------------------------------|----------------------------------------|
| Longest Subarray with Sum = K (positive)   | Positive integers                    | Max length with sum = K              | Sliding Window                      | Expand/shrink with running sum         |
| Longest Subarray with Sum = K (with neg)   | Any integers                         | Max length with sum = K              | Prefix Sum + HashMap                | Map stores first index for each sum    |
| Kadane's Algorithm                         | Any integers                         | Max sum of subarray                  | Sliding Window / Dynamic Programming| Local max and global max               |
| Print Subarray with Max Sum                | Any integers                         | Print indices of subarray with max sum| Kadane’s variation                 | Track start/end indices                |

---

## 🔢 3. Total Count of Valid Subarrays or Substrings

| Problem                                     | Input Types                          | Goal                                 | Approach                            | Notes                                  |
|--------------------------------------------|--------------------------------------|--------------------------------------|-------------------------------------|----------------------------------------|
| Binary Subarray With Sum                   | Binary array, target sum             | Count subarrays with sum = target    | Prefix Sum + HashMap   or atMost(k) - atMost(k-1)              | HashMap stores sum frequencies         |
| Count Number of Nice Subarrays             | Integer array                        | Count subarrays with exactly k odd   | atMost(k) - atMost(k-1)             | Sliding Window Count                   |
| Number of Substrings Containing a, b, c    | String of a, b, c                    | Count substrings with all 3 chars    | Sliding Window                      | Maintain last seen positions           |

---

## 📘 Summary

| Situation                          | Recommended Strategy            | Reason                                      |
|-----------------------------------|----------------------------------|---------------------------------------------|
| All elements are positive         | Sliding Window                   | Can safely expand/shrink                    |
| Elements may be negative          | Prefix Sum + HashMap             | Sliding window fails on negatives           |
| Max/Min valid window length       | Sliding Window                   | Efficient length tracking                   |
| Total count of valid subarrays    | Prefix Sum or atMost Trick       | Frequency-based counting                    |
| Unique characters or replacements | Sliding Window + Freq Map/Array  | Character-level state needed                |

---

## 💡 Extra Problems to Explore

| Problem                              | Hint/Technique                         |
|--------------------------------------|----------------------------------------|
| Subarrays with Product < K           | Sliding Window with multiplication     |
| Count Subarrays with Bounded Max     | Sliding Window with conditions         |
| Minimum Window Substring             | Two Pointers + HashMap (Hard)          |
| Max Sum Subarray of Size K           | Fixed Size Sliding Window              |

---

> ✅ **Pro Tips:**
> - Use `atMost(k) - atMost(k-1)` when counting subarrays with **exact** properties.
> - Use a **HashMap** when dealing with **prefix sums**, especially with **negatives**.
> - Use **frequency arrays** or **hashmaps** for character-based string problems.


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



