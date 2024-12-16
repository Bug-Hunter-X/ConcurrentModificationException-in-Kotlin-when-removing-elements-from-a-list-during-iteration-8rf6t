# ConcurrentModificationException in Kotlin List Iteration

This repository demonstrates a common error in Kotlin when removing elements from a mutable list while iterating over it.  The standard `for` loop and direct removal lead to a `ConcurrentModificationException`.  A safe solution using `removeIf` is provided.

## Problem

Attempting to modify a list (add or remove elements) while iterating over it using a standard `for` loop in Kotlin (or many other languages) results in a `ConcurrentModificationException`. This is because the iterator's internal state becomes inconsistent with the list's structure.

## Solution

The recommended approach is to use the `removeIf` function, which iterates internally in a thread-safe manner. This avoids the concurrent modification issue.

## Usage

1. Clone this repository.
2. Open the project in your preferred Kotlin IDE.
3. Run the `bug.kt` file to see the `ConcurrentModificationException`.
4. Then, run `bugSolution.kt` to see the safe and correct way to remove elements.