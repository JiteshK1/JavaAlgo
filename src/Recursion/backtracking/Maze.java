package Recursion.backtracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        path("", 3, 3);
        System.out.println(pathListDiagonal("", 3, 3));
        boolean[][] maze={
                {true,true,true},
                {true,false,true},
                {true,true,true}

        };
        pathRestricted("",maze,0,0);
    }

    static int count(int row, int column) {
        if (row == 1 || column == 1) {
            return 1;
        }

        int left = count(row - 1, column);
        int right = count(row, column - 1);

        return left + right;
    }

    static void path(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }
        if (r > 1) {
            path(p + 'D', r - 1, c);
        }

        if (c > 1) {
            path(p + 'R', r, c - 1);
        }
    }

    static ArrayList<String> pathList(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        if (r > 1) {
            list.addAll(pathList(p + 'D', r - 1, c));
        }

        if (c > 1) {
            list.addAll(pathList(p + 'R', r, c - 1));
        }

        return list;
    }

    static ArrayList<String> pathListDiagonal(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        if (r > 1) {
            list.addAll(pathListDiagonal(p + 'V', r - 1, c));
        }
        if (c > 1) {
            list.addAll(pathListDiagonal(p + 'H', r, c - 1));
        }
        if (r > 1 && c > 1) {
            list.addAll(pathListDiagonal(p + 'D', r - 1, c - 1));
        }
        return list;
    }

    static void pathRestricted(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!maze[r][c]) {
            return;
        }
        if (r < maze.length - 1) {
            pathRestricted(p + 'D', maze, r + 1, c);
        }

        if (c < maze[0].length - 1) {
            pathRestricted(p + 'R', maze, r, c + 1);
        }
    }
}
