package com.backtracking;

public class PathWithObstacle {
	static void pathWithObstacle(String p,int[][] maze,int r,int c) {
		if(r==maze.length-1&&c==maze[0].length-1) {
			System.out.println(p);
			return;
		}
		if(maze[r][c]==0) {
			return;
		}
		if(r<maze.length-1) {
			pathWithObstacle(p+'D',maze,r+1,c);
		}
		if(c<maze[0].length-1) {
			pathWithObstacle(p+'R',maze,r,c+1);
		}
	}
	public static void main(String[] args) {
		int[][] board={
			{1,1,1},
			{1,0,1},
			{1,1,1}
		};
		pathWithObstacle("",board,0,0);
	}
} 
