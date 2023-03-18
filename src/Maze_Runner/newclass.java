package Maze_Runner;

import java.util.*;
import javax.swing.*;
import java.awt.*;

public class newclass extends JFrame {
    private int[][] maze =
                           {{1,1,1,1,1,1,1,1,1,1,1,1,1},
                            {1,0,1,0,1,1,1,1,1,1,0,0,1},
                            {1,0,1,0,0,0,1,1,0,0,1,0,1},
                            {1,0,1,1,1,0,1,1,0,0,1,0,1},
                            {1,0,1,1,1,1,1,1,1,0,1,0,1},
                            {1,0,0,0,0,0,0,0,1,1,1,1,1},
                            {1,1,0,1,1,0,1,1,1,1,1,1,1},
                            {1,1,0,1,1,0,0,0,0,0,1,1,1},
                            {1,1,0,1,1,1,1,1,1,0,0,9,1},
                            {1,1,1,1,1,1,1,1,1,1,1,1,1}
                            };
    public ArrayList<Integer> path = new ArrayList<>();//for storing the coordinates on my path

    public newclass(){
        setTitle("Blade Runner Maze Game");
        setSize(800,700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(400,100);
        DFS.searchpath(maze, 1,1,path);
        System.out.println(path);
    }

    @Override
    public void paint(Graphics g){
        g.translate(200,200);
        for(int i=0; i<maze.length; i++){
            for(int j=0; j<maze[0].length; j++){
                Color color;
                switch (maze[i][j]){
                    case 1 : color = Color.BLACK; break;
                    case 9 : color = Color.RED; break;
                    default : color = Color.WHITE; break;
                }
                g.setColor(color);
                g.fillRect(30*j, 30*i, 30,30);
                g.setColor(Color.RED);
                g.drawRect(30*j,30*i,30,30);

            }
        }

        for(int i=0; i<path.size(); i+=2){
            int pathx = path.get(i);
            int pathy = path.get(i+1);
            System.out.println("x coordinates" +pathx);
            System.out.println("y coordinates" +pathy);

            g.setColor(Color.GREEN);
            g.fillRect(30*pathx, 30*pathy, 20,20);
        }
    }

    public static void main(String[] args){
        newclass view = new newclass();
        view.setVisible(true);
    }


}
