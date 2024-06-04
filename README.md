## Multiple Knapsack Problem Solver

This project provides solutions to the Multiple Knapsack Problem (MKP) using three different algorithms: Depth-First Search (DFS), Breadth-First Search (BFS), and the A* heuristic algorithm. The goal of the MKP is to distribute a set of items with specific values and weights into multiple knapsacks with different capacities to maximize the total value without exceeding the capacities of the knapsacks.

### Project Structure

* **`src`**: Contains the source code for the algorithms.
* **`Projet_meta`**: Contains the project report.
* **`README.md`**: Project overview and instructions.

### Problem Definition

* **The Multiple Knapsack Problem is defined as follows:**

  * Given a set of items, each with a weight and a value.
  * Given multiple knapsacks, each with a specific capacity.
  * The objective is to maximize the total value of items placed in the knapsacks without exceeding the capacity of any knapsack.

### Example

Suppose we have 4 items and 2 knapsacks:

Knapsack capacities: [10, 7]
Items (weight, value): [(9, 3), (7, 3), (6, 7), (1, 5)]

The optimal solution would be to place:

Item (9, 3) and (1, 5) in the first knapsack.
Item (6, 7) in the second knapsack.

### Algorithms

#### Depth-First Search (DFS)

DFS explores all possible combinations of items in knapsacks by going as deep as possible in the state space before backtracking. This algorithm ensures finding a solution, but may not be efficient for large problem sizes due to its exhaustive nature.

#### Breadth-First Search (BFS)

BFS explores all possible combinations by expanding all nodes at the present depth level before moving on to nodes at the next depth level. This algorithm can also find a solution but may suffer from high memory usage.

#### A* Heuristic Algorithm

A* uses a heuristic to guide the search towards the most promising nodes, balancing exploration and exploitation. It uses a cost function f(n) = g(n) + h(n) where g(n) is the cost to reach the current node and h(n) is the heuristic estimate of the cost to reach the goal. This algorithm is more efficient for large problem sizes.

### Experimentation

Experiments were conducted using different problem sizes to evaluate the performance of each algorithm. The metrics for comparison included:

* Number of nodes developed.
* Execution time.
* Best performance achieved.

### Usage

#### Prerequisites

* Java

#### Required Libraries

* JavaFX

#### Running the Algorithms

1. Clone the repository:

   ```bash
   git clone https://github.com/chafaaouchaou/projet-meta-part1.git
   ```

**Part 2 of this project contains the genetic and the bee swarm algorithms for solving the multiple knapsack problem.**

## Contributors

* Chafaa Ouchaou
* Kenza Taouci
