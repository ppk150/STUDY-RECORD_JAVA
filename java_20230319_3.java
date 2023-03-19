import java.util.ArrayList;
import java.util.Queue;
import java.util.*;

public class java_20230319_3 {
//    static ArrayList<Integer>[] graph; // 인접 리스트 그래프 만드는 리스트

    static boolean[][] graph;

//    static int count;

    static boolean[] visited; // 댕겨온곳 저장

    static int T;

    public static void putEdge(boolean[][] graph,int x, int y) { // 그래프에 표시

        graph[x][y] = true;
        graph[y][x] = true;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        T = sc.nextInt(); // 콤퓨타 수

        graph = new boolean [T+1][T+1];

        visited = new boolean[T+1];

        int computer_pare = sc.nextInt(); // 컴퓨터 쌍의 수

        for(int i = 0 ; i < computer_pare ;i++){ //  행렬 형대로 저장

            int one =sc.nextInt();

            int two = sc.nextInt();

            putEdge(graph ,one, two);

        }

        System.out.println(bfs(1));


    }

    public static int bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.offer(start);

        int count = 0;

        while (!queue.isEmpty()) {
            int node = queue.poll();

            for (int i =1 ; i <= T ;i++) {
                if (graph[node][i]&&!visited[i]) {
                    queue.offer(i);
                    visited[i] = true;
                    count++;
                }
            }
        }

        return count;
    }



}
