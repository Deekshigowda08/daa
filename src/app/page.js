import React from 'react';

const fileList = [
  "BFS.java",
  "Binarytree.java",
  "Dfs.java",
  "dij.java",
  "Heapsort.java",
  "hoorspool.java",
  "knapsack.java",
  "kruskal.java",
  "Mergesort.java",
  "nqueen.java",
  "prins.java",
  "Quicksort.java",
  "sum.java",
  "travelings.java",
  "Warshall.java",
  "Topo.java"
];

const file={
  "BFS.java":"BFS - Breadth First Search Algorithm",
  "Binarytree.java":"Binary Tree Traversal",
  "Dfs.java":"Dfs 7a - Depth First Search Algorithm",
  "dij.java":"Dijkstra's Algorithm",
  "Heapsort.java":"Heapsort Algorithm",
  "hoorspool.java": "Horspool's Algorithm",
  "knapsack.java": "Knapsack Problem",
  "kruskal.java": "Kruskal's Algorithm",
  "Mergesort.java": "Mergesort Algorithm",
  "nqueen.java": "N-Queens Problem",
  "prins.java": "Prims Algorithm",
  "Quicksort.java": "Quicksort Algorithm",
  "sum.java": "Subset Sum Problem",
  "travelings.java": "Traveling Salesman Problem",
  "Warshall.java": "Warshall's and Floyd's Algorithm",
  "Topo.java": "Topological Sort Algorithm"
}

const Home = () => {
  return (
    <div style={{ padding: '1rem', fontFamily: 'Arial' }}>
      <h1>Download Files And Enjoy Bro...</h1>
      <ul>
        {fileList.map((filename, index) => (
          <li key={index} style={{ margin: '10px 0' }}>
            <a
              href={`/${filename}`}
              download
              style={{ textDecoration: 'none', color: 'blue' }}
            >
              ⬇️ {file[filename]}
            </a>
          </li>
        ))}
      </ul>
    </div>
  );
};

export default Home;
