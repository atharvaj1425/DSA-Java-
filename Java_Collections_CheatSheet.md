# 📚 Java Collections Framework Cheat Sheet

This document provides a structured overview of the Java Collections Framework, including interfaces, implementations, and common methods.

---

## 🧩 Overview

Java's collection framework is built around **interfaces**, with multiple concrete **implementations** that provide actual behavior.

```
           Iterable
               ↑
           Collection
        ↙      ↓       ↘
     List     Set     Queue
                     ↙    ↘
                 Deque  PriorityQueue
```

---

## ✅ Core Interfaces and Implementations

| **Interface** | **Common Implementations** | **Description** |
|---------------|-----------------------------|------------------|
| `List`        | `ArrayList`, `LinkedList`, `Vector`, `Stack` | Ordered collection with duplicates |
| `Set`         | `HashSet`, `LinkedHashSet`, `TreeSet` | Unordered, no duplicates |
| `Queue`       | `LinkedList`, `PriorityQueue`, `ArrayDeque` | FIFO, sometimes priority-based |
| `Deque`       | `ArrayDeque`, `LinkedList` | Double-ended queue |
| `Map`         | `HashMap`, `LinkedHashMap`, `TreeMap`, `Hashtable` | Key-value pairs |

---

## 🔍 Interface-wise Method Breakdown

### 📘 `Iterable<T>`

- `iterator()`

Used in **enhanced for-loops**.

---

### 📗 `Collection<T>` (Base for List, Set, Queue)

Common methods:

- `add(T e)`
- `addAll(Collection<? extends T> c)`
- `clear()`
- `contains(Object o)`
- `containsAll(Collection<?> c)`
- `isEmpty()`
- `iterator()`
- `remove(Object o)`
- `removeAll(Collection<?> c)`
- `retainAll(Collection<?> c)`
- `size()`
- `toArray()`

---

### 📙 `List<T>` extends `Collection<T>`

**Ordered**, duplicates allowed. Indexed access.

Additional methods:

- `get(int index)`
- `set(int index, T element)`
- `add(int index, T element)`
- `remove(int index)`
- `indexOf(Object o)`
- `lastIndexOf(Object o)`
- `listIterator()`

---

### 📕 `Set<T>` extends `Collection<T>`

**No duplicates**, unordered (unless using `LinkedHashSet` or `TreeSet`).

Uses only `Collection` methods.

---

### 📘 `Queue<T>` extends `Collection<T>`

Used for **FIFO** (except `PriorityQueue`).

Methods:

- `offer(T e)`
- `poll()`
- `peek()`

---

### 📙 `Deque<T>` extends `Queue<T>`

Double-ended queue.

Methods:

- `addFirst()`, `addLast()`
- `removeFirst()`, `removeLast()`
- `peekFirst()`, `peekLast()`
- `offerFirst()`, `offerLast()`
- `pollFirst()`, `pollLast()`
- `push()`, `pop()` → Stack behavior

---

### 📒 `Map<K, V>`

Not a subtype of `Collection`. Key-value pairs.

Methods:

- `put(K key, V value)`
- `get(Object key)`
- `remove(Object key)`
- `containsKey(Object key)`
- `containsValue(Object value)`
- `keySet()`, `values()`, `entrySet()`
- `putAll(Map<? extends K, ? extends V> m)`
- `clear()`
- `size()`, `isEmpty()`

---

## 🧪 Additional Interfaces (Advanced/Legacy)

| Interface       | Description |
|-----------------|-------------|
| `SortedSet`     | Extended by `TreeSet` |
| `SortedMap`     | Extended by `TreeMap` |
| `NavigableSet`  | Adds navigation methods to `SortedSet` |
| `NavigableMap`  | Adds navigation to `SortedMap` |
| `Enumeration`   | Used in legacy `Vector`, replaced by `Iterator` |

---

## 🧠 Summary Tips

- ✅ Use interfaces (`List`, `Set`, `Map`) on the left-hand side for flexibility
- ⚠️ Don’t use concrete classes unless needed
- 🧰 Default go-to: `HashMap`, `ArrayList`, `HashSet`