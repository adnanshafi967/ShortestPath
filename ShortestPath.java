
import java.util.*;
import java.io.*;

public class ShortestPath {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String [] args) throws IOException {
        Scanner sc = new Scanner (new File ("test.txt"));
        String s = sc.nextLine();
        int numberOfNodes = Integer.parseInt(s);
        int adjMat[][] = new int[numberOfNodes][numberOfNodes];
    
        while (sc.hasNextLine()) {
            String line= sc.nextLine();
            StringTokenizer st= new StringTokenizer(line," ");
     
            while (st.hasMoreTokens()) {
                String firstNode = st.nextToken();
                String secondNode = st.nextToken();
                String weight = st.nextToken();
                int u = Integer.parseInt(firstNode);
                int v = Integer.parseInt(secondNode);
                int w = Integer.parseInt(weight);
                adjMat[u][v] = w;
                adjMat[v][u] = w;
            }
        }
    //System.out.print(Arrays.deepToString(adjMat));
        sc.close();
        
        Dijkstra dijkstra = new Dijkstra(adjMat);
        dijkstra.runDjikstra();
        dijkstra.print();
         dijkstra.printPath();
        
//        BellmanFord bellmanFord = new BellmanFord(adjMat);
//        bellmanFord.runBellmanFord();
    }
}
