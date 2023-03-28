# MazeRunner
 Maze Solver is a Java application with a graphical user interface (GUI) that can solve a maze using the Depth-First Search (DFS) algorithm. The application has been developed using Java and Java Swing for the GUI.

The goal of this project is to find the path from the start point to the end point in a maze without passing through any blockages. The user can provide the input maze using a 2D grid of integers, where 1 represents a blockage, 0 represents an open path, and 9 represents the end point. The application will display the solved maze on the GUI.
<p float="left">
  <img src="/SS/maze.png" width="600" />
  
</p>
Requirements:
To run this application, you need to have Java 8 or later installed on your computer.

Usage
To use the Maze Solver, you need to provide an input maze as a 2D array of integers. For example, the following input maze can be represented as the 2D array:

int[][] maze = {
    {1, 1, 1, 1, 1, 1},
    {1, 0, 1, 0, 0, 1},
    {1, 0, 0, 0, 1, 1},
    {1, 1, 1, 0, 0, 1},
    {1, 0, 0, 0, 1, 9},
    {1, 1, 1, 1, 1, 1}
};

The "1" represents a wall/boundary of the maze
The "0" represents the path that can be taken to traverse the maze
The "9" represents the end point of the maze
The start point is the first time we encounter "0" while traversing the maze.

To start the application, run the MazeSolver.java file. The GUI will be displayed, and you can enter the input maze as a 2D array of integers. After entering the maze, click on the "Solve Maze" button, and the application will solve the maze and display the result on the GUI.

Algorithm
The Maze Solver application uses the DFS algorithm to solve the maze. The DFS algorithm starts from the starting point and explores each path until it reaches the end point. If it encounters a dead end or a blockage, it backtracks to the previous point and continues exploring other paths.

Credits:
This application has been developed by Basit Manzoor. If you have any questions or suggestions, please feel free to contact me.
