/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0007;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class UndirectedGraphs {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        UndirectedGraphs graph = new UndirectedGraphs(6);
        graph.addEdge(1, 4);
        graph.addEdge(2, 4);
        graph.addEdge(2, 5);
        graph.addEdge(3, 5);
        graph.addEdge(4, 5);
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the start point: ");
        int start = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Enter the end point: ");
        int end = scanner.nextInt();
        
        System.out.println("This is " + 
                (graph.isEdge(start, end) ? "" : " not ") + " an edge");
    }
    
    private boolean adjacencyMatrix[][];
    private int vertexCount;

    public UndirectedGraphs(int vertexCount) {
        this.vertexCount = vertexCount;
        adjacencyMatrix = new boolean[vertexCount][vertexCount];
    }

    public void addEdge(int i, int j) {
        if (i >= 0 && i < vertexCount && j > 0 && j < vertexCount) {
            adjacencyMatrix[i][j] = true;
            adjacencyMatrix[j][i] = true;
        }
    }

    public void removeEdge(int i, int j) {
        if (i >= 0 && i < vertexCount && j > 0 && j < vertexCount) {
            adjacencyMatrix[i][j] = false;
            adjacencyMatrix[j][i] = false;
        }
    }

    public boolean isEdge(int i, int j) {
        if (i >= 0 && i < vertexCount && j > 0 && j < vertexCount) {
            return adjacencyMatrix[i][j] || adjacencyMatrix[j][i];
        } else {
            return false;
        }
    }
}