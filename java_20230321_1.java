import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
// 연결 요소의 개수 11724번
public class java_20230321_1 {


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

        T = sc.nextInt(); // 정점의 갯수

        graph = new boolean [T+1][T+1];

        visited = new boolean[T+1];

        int pare = sc.nextInt(); // 간선의 갯수

        for(int i = 0 ; i < pare ;i++){ //  행렬 형태로 저장

            int one =sc.nextInt();

            int two = sc.nextInt();

            // 행렬 형태로 그래프 저장됨
            putEdge(graph ,one, two);

        }

        int count = 0 ;
        for(int i = 1 ; i <=T; i++ ){
            if(!visited[i]){
                dfs(i);
                count++;

            }

        }

        System.out.println(count);


    }

    public static void dfs(int i ){
        visited[i] = true;
        for(int j = 1 ; j <=T ; j++){
            if(graph[i][j] == true && !visited[j]){
                dfs(j);

            }
        }
    }
}
