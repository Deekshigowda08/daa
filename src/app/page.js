import React from 'react';

const fileList = [
  "BFS.java",
  "Binarytree.java",
  "Dfs.java",
  "fdij.java",
  "Edge.java",
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
  "Warhall.java",
];

const Home = () => {
  return (
    <div style={{ padding: '2rem', fontFamily: 'Arial' }}>
      <h1>Download Files</h1>
      <ul>
        {fileList.map((filename, index) => (
          <li key={index} style={{ margin: '10px 0' }}>
            <a
              href={`/${filename}`}
              download
              style={{ textDecoration: 'none', color: 'blue' }}
            >
              ⬇️ {filename}
            </a>
          </li>
        ))}
      </ul>
    </div>
  );
};

export default Home;
