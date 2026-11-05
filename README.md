# DSA Practice (Java)

> A single-source-of-truth repo for Data Structures & Algorithms (DSA) practice — solved *famous* problems, organized by concept, with clear templates, tests, and notes. Made for learning, interviewing, and flexing algorithmic muscles. 💪

It also contains coampny specific questions, striver's A2Z sheet and apna college DSA sheet as well. 

---

## 📌 Project Overview

This repository is a continuous, evolving collection of DSA problems solved in **Java**. Each problem includes:

* A clear problem statement or link to the original problem (LeetCode / GFG / Codeforces / etc.)
* A clean, well-commented Java implementation
* Time & space complexity analysis
* Edge cases and short explanation
* (Optional) multiple approaches when useful

Goal: cover **every core DSA concept** through curated, famous problems so you can revise quickly and prepare for interviews.

---

## 📁 Repository Structure (recommended)

```
DSA-Practice-Java/
├── README.md
├── CONTRIBUTING.md
├── LICENSE
├── build/                 # compiled classes (gitignored)
├── src/
│   ├── array/
│   │   ├── TwoSum.java
│   │   └── ...
│   ├── linkedlist/
│   ├── stack/
│   ├── queue/
│   ├── tree/
│   ├── graph/
│   ├── dp/
│   ├── greedy/
│   ├── math/
│   └── utils/             # helper classes (IO, Pair, ListNode, TreeNode)
├── tests/                 # simple test runners or JUnit tests
└── notes/                 # short writeups, diagrams, complexity tables
```

**Naming convention:** `ProblemName.java` (use CamelCase). If multiple solutions exist, suffix with `Solution1`, `Solution2` (e.g. `KnapsackDP.java`, `KnapsackGreedy.java`).

---

## 🚀 How to run (simple)

**Using `javac` and `java` (no build tool):**

1. Compile:

```bash
javac -d build src/<concept>/ProblemName.java
```

2. Run:

```bash
java -cp build <package?>ProblemName
```

(If you use packages, compile from repo root and run with the package-qualified class name.)

**Using Maven or Gradle (recommended for bigger test suites):**

* Add a `pom.xml` or `build.gradle` and place sources under `src/main/java` and tests under `src/test/java`.

---

## 🧭 Problem File Template

When adding a new problem, use this header at the top of the Java file (commented):

```java
/*
Problem: Two Sum
Platform: LeetCode #1
Difficulty: Easy
Link: https://leetcode.com/problems/two-sum/
Approach: HashMap single pass
Time: O(n)
Space: O(n)
Notes: Return indices of numbers that add up to target.
*/

public class TwoSum {
    // implementation...
}
```

This keeps things consistent and searchable.

---

## ✅ Concepts & Example Problems (Roadmap)

Each bullet is a folder in `src/` and should contain a mix of easy → hard problems.

* Arrays & Strings: Two Sum, 3-Sum, Subarray Sum, Sliding Window problems
* Linked List: Reverse Linked List, Cycle Detection, Merge K Lists
* Stack & Queue: Valid Parentheses, Min Stack, Sliding Window Max
* Trees & BSTs: Inorder/Preorder/Postorder, LCA, Serialize/Deserialize
* Graphs: BFS/DFS, Shortest Path (Dijkstra), Topological Sort, SCC
* Dynamic Programming: Knapsack, Longest Increasing Subsequence, Edit Distance
* Greedy: Interval Scheduling, Huffman, Minimum Platforms
* Math & Number Theory: Primes, GCD, Modular Exponentiation
* Backtracking: N-Queens, Permutations, Sudoku Solver
* Bit Manipulation: Single Number, Counting Bits
* Advanced: Segment Trees, Fenwick Trees, Union-Find, Tries

(If a concept is missing — add it. This repo is a living document.)

---

## 🛠️ Coding Style & Best Practices

* Use descriptive variable names — `i` is fine for loops, but prefer `left`, `right` where applicable.
* Add short comments explaining non-obvious steps.
* Include complexity analysis in the file header.
* Avoid unused imports and dead code.
* If using custom `ListNode`/`TreeNode`, keep them in `src/utils/`.

Sample `ListNode` (put in `src/utils/ListNode.java`):

```java
public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) { val = x; }
}
```

---

## 🔁 Testing

* Add quick `main()` based sanity checks inside each problem file for manual testing.
* Prefer to add JUnit tests in `tests/` for regression checks.
* Keep test inputs small and focused.

---

## 🤝 Contributing

Love contributions. Keep it tidy:

1. Fork the repo
2. Create a branch: `feature/<concept>-<problem>`
3. Add your solution, update `notes/` if needed
4. Open a PR with a short description and link to the problem

**Checklist for PRs:**

* [ ] File placed in correct folder
* [ ] Header comment with link, difficulty, complexity
* [ ] Code compiles and runs
* [ ] Tests (if applicable)

---

## 📚 Resources & References

* LeetCode, GeeksforGeeks, HackerRank, Codeforces
* *Introduction to Algorithms* — Cormen et al. (for deep theory)
* *Competitive Programming* — Steven & Felix Halim (for contests)

---

## 🧾 Roadmap / TODO

* Add JUnit setup and CI (GitHub Actions) for auto test runs
* Add interactive README badges (build, coverage)
* Complete `dp/`, `graph/`, and `advanced/` folders

---

## 🧑‍💻 Contact / Author

If something's broken or you want mentoring/feedback on solutions, open an issue or PR.

---

> Keep solving. Keep explaining. Code like someone else will read it. (Because they will.) 🧠🔥
