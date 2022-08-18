import java.io.*;

public class java_20220808_3_map {
    public static void main(String[] args)  throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String TT = bf.readLine();
        int T  = Integer.parseInt(TT); // M개의 카드
        int[] NUM = new int[T];
        int[] count = new int[20000001];



        //-------------숫자 카드 입력 ------------------------------
        String[] AF = bf.readLine().split(" ");

        for (int j = 0 ; j < T ; j++){ // M개의 숫자 카드 (-10000000 부터 넣어야 되서 +10000000 함)

            int  num  = Integer.parseInt(AF[j]);
            NUM[j] = num+10000000;
        }

        String TT_2 = bf.readLine();
        int T_2  = Integer.parseInt(TT_2); // 상근이가 가진 카드의 수
        int[] NUM_2 = new int[T_2];
        int[] result = new int[T_2]; // 카드 유무 담는 부분
        String[] AF_2 = bf.readLine().split(" ");


        for (int j = 0 ; j < T_2 ; j++){ // 상근이가 가지고 있는 숫자 카드
            int  num  = Integer.parseInt(AF_2[j]);
            NUM_2[j] = num;
        }

//---------------------------------숫자 카드 카운팅 정렬 ---------------------
        int[] sorted = new int[T];
        int count_sorted = 0;
        for(int i = 0 ; i <T ; i++){ // M개의 숫자카드 정렬
            count[NUM[i]]++;
        }

        for(int i=0; i<count.length; i++) {
            if(count[i] >= 0) {
                for(int k=0; k<count[i]; k++) {

                    sorted[count_sorted] = i - 10000000; // 정렬된 수 배열 만들기
                    count_sorted++;
                }
            }
        }
        //--------------------------------이분 탐색-------------------------------


        for(int i = 0 ; i < T_2 ; i++){
            int count_by =1;
            int spot = T-1; // 이분탐색으로 중간 나누는 기준점 되는 변수

            for(int j = 0 ; j < T ; j++) {
                if (NUM_2[i] > sorted[spot]) {

                    spot = spot + T / (count_by * 2);


                } else if (NUM_2[i] < sorted[spot]) {

                    spot = spot / (count_by * 2);

                } else if (NUM_2[i] == sorted[spot]) {
                    result[i] = 1;
                    break;
                }

                if (spot == 0 && NUM_2[i] != sorted[spot]) {
                    result[i] = 0;
                    break;
                }
            }
            bw.write(result[i]+ " ");
        }
        bw.flush();
        bw.close();
    }
}
