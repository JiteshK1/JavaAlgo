package Recursion.backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        boolean[][] maze={
                {true,true,true},
                {true,true,true},
                {true,true,true}

        };
        int[][] paths = new int[maze[0].length][maze.length];
        allPaths("",maze,0,0);

        allPathsPrint("",maze,0,0,paths,1);

    }


    static void allPaths(String p, boolean[][] maze, int r, int c) {
      if (r==maze.length-1 && c== maze[0].length-1){
          System.out.println(p);
          return;
      }

      if (!maze[r][c]){
          return;
      }

      //so when a cell is visited mark that row as false
        maze[r][c]=false;
      if (r< maze.length-1){
          allPaths(p+'D',maze,r+1,c);
      }


        if (c< maze[0].length-1){
            allPaths(p+'R',maze,r,c+1);
        }
        if (r>0){
            allPaths(p+'U',maze,r-1,c);

        }

        if (c>0){
            allPaths(p+'L',maze,r,c-1);

        }
//after all visiting is done by 1 function call then the changes made by that function call should be reverted so

        maze[r][c]=true;

    }

    static ArrayList<String> allPathsList(String p, boolean[][] maze, int r, int c) {
        if (r==maze.length-1 && c== maze[0].length-1){
            ArrayList<String> list =new ArrayList<>();
            list.add(p);
            return list;
        }

        if (!maze[r][c]){
            ArrayList<String> list =new ArrayList<>();
            return list;
        }

        ArrayList<String> list =new ArrayList<>();

        //so when a cell is visited mark that row as false
        maze[r][c]=false;
        if (r< maze.length-1){
        list.addAll(allPathsList(p+'D',maze,r+1,c));
        }


        if (c< maze[0].length-1){
            list.addAll(allPathsList(p+'R',maze,r,c+1));
        }
        if (r>0){
            list.addAll(allPathsList(p+'U',maze,r-1,c));

        }

        if (c>0){
            list.addAll(allPathsList(p+'L',maze,r,c-1));

        }
//after all visiting is done by 1 function call then the changes made by that function call should be reverted so
        maze[r][c]=true;
        return  list;

    }

    static void allPathsPrint(String p, boolean[][] maze, int r, int c,int[][] path,int step) {
        if (r==maze.length-1 && c== maze[0].length-1){
            path[r][c]=step;
            for(int[] pa:path){
                System.out.println(Arrays.toString(pa));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if (!maze[r][c]){
            return;
        }

        //so when a cell is visited mark that row as false
        maze[r][c]=false;
        path[r][c]=step;
        if (r< maze.length-1){
            allPathsPrint(p+'D',maze,r+1,c,path,step+1);
        }


        if (c< maze[0].length-1){
            allPathsPrint(p+'R',maze,r,c+1,path,step+1);
        }
        if (r>0){
            allPathsPrint(p+'U',maze,r-1,c,path,step+1);

        }

        if (c>0){
            allPathsPrint(p+'L',maze,r,c-1,path,step+1);
        }
//after all visiting is done by 1 function call then the changes made by that function call should be reverted so

        maze[r][c]=true;
        path[r][c]=0;
    }

}

