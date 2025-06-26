import React from 'react';

const fileList = [
  "file1.pdf",
  "file2.pdf",
  "file3.pdf",
  "file4.pdf",
  "file5.pdf",
  "file6.pdf",
  "file7.pdf",
  "file8.pdf",
  "file9.pdf",
  "file10.pdf",
  "file11.pdf",
  "file12.pdf",
  "file13.pdf",
  "file14.pdf",
  "file15.pdf",
];

const Home = () => {
  return (
    <div style={{ padding: '2rem', fontFamily: 'Arial' }}>
      <h1>Download Files</h1>
      <ul>
        {fileList.map((filename, index) => (
          <li key={index} style={{ margin: '10px 0' }}>
            <a
              href={`/files/${filename}`}
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
