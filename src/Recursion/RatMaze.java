package Recursion;

import java.util.Scanner;

public class RatMaze {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        int m=s.nextInt();
        int n=s.nextInt();

        String[][] maze=new String[m][n];
        int[][] v=new int[m][n];
        int[][] sol=new int[m][n];
        for(int i=0;i<m;i++)
        {

            String str=s.next();
            for(int k=0;k<str.length();k++) {
                char cc=str.charAt(k);
                if(cc=='X') {
                    v[i][k]=1;
                }
            }

        }
        m--;
        n--;
        boolean ans =solveMaze(v,sol,0,0,m,n);
        if(ans==false){
            System.out.println("-1");
        }

    }

    public static boolean solveMaze(int[][] v,int[][] sol,int i,int j,int m,int n) {
        if(i==m && j==n){

            sol[i][j] = 1;


            for(int x=0;x<=m;x++){
                for(int y=0;y<=n;y++){
                    System.out.print(sol[x][y]+" ");
                }
                System.out.println();
            }
            return true;
        }
        if(v[i][j]==1)
            return false;
        v[i][j]=1;
        ///Recursive Case
        ///Assuming path exists from i,j
        sol[i][j] = 1;
        ///1. Go Right
        if(j+1<=n && v[i][j+1]==0){
            boolean pathMila = solveMaze(v,sol,i,j+1,m,n);
            if(pathMila==true){
                return true;
            }
        }
        /// 2. Go Down
        if(i+1<=m && v[i+1][j]==0){
            boolean pathMila = solveMaze(v,sol,i+1,j,m,n);
            if(pathMila==true){
                return true;
            }
        }


        ///Backtracking
        sol[i][j] = 0;
        return false;
    }
}
