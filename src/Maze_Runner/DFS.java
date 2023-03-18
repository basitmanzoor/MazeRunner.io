package Maze_Runner;

import java.util.ArrayList;

public class DFS {
    public static boolean searchpath(int[][] maze, int x, int y, ArrayList<Integer> path ){
        //base case
        if(maze[y][x] == 9){
            path.add(x);
            path.add(y);
            return true;
        }
        if(maze[y][x] == 0){
            maze[y][x] = 2; //visited
            int dx = -1;
            int dy = 0;
            //for up direction
            if(searchpath(maze,x+dx, y+dy, path)){
                path.add(x);
                path.add(y);
                return true;
            }
            dx = 1;
            dy = 0;
            //for down direction
            if(searchpath(maze,x+dx, y+dy, path)){
                path.add(x);
                path.add(y);
                return true;
            }
            dx = 0;
            dy = -1;
            //for left direction
            if(searchpath(maze,x+dx, y+dy, path)){
                path.add(x);
                path.add(y);
                return true;
            }
            dx = 0;
            dy = 1;
            //for right direction
            if(searchpath(maze,x+dx, y+dy, path)){
                path.add(x);
                path.add(y);
                return true;
            }
        }
        return false;
    }
}
