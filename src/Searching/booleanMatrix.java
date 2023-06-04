package Searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class booleanMatrix {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); // Number of test cases

        StringBuilder output = new StringBuilder();

        while (t > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken()); // Number of rows
            int n = Integer.parseInt(st.nextToken()); // Number of columns

            int[][] matrix = new int[m][n];

            // Read the matrix elements and modify the matrix
            for (int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            // Modify the matrix using row indices with 1
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (matrix[i][j] == 1) {
                        for (int k = 0; k < n; k++) {
                            matrix[i][k] = 1;
                        }
                        break;
                    }
                }
            }

            // Append the modified matrix to the output
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    output.append(matrix[i][j]).append(" ");
                }
                output.append("\n");
            }

            t--;
        }

        // Print the output
        System.out.print(output);
    }
}
