import java.io.*;

public class java_20220808_4_map {
    public static long[] NUM;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] TT = bf.readLine().split(" ");
        long[] T = new long[TT.length]; // // 나무 수, 필요 미터 받는 곳
        int t = Integer.parseInt(TT[0]);// TT[0] -> 나무 수
        long len = Long.parseLong(TT[1]);// TT[1]  필요 미터

        NUM = new long[t];
        long max = 0;



        //-------------나무 길이 입력 ------------------------------

        String[] AF = bf.readLine().split(" ");

        for (int j = 0; j < t; j++) {

            long num = Long.parseLong(AF[j]);
            NUM[j] = num;
            if (max < NUM[j]) {
                max = NUM[j]; // 최댓값 저장
            }
        }
        binarySearch(max,len);

    }


    //--------------------------------이분 탐색-------------------------------

    public static void binarySearch( long max, long target) { // 이분탐색
        long start = 0; // 시작점
        long end = max; // 종점
        long mid; // 중앙

        while (start + 1 < end) { // 시작과 종점이 같아질 때까지
            mid = (start + end) / 2;

            if (cutterDetermin(mid) >= target) // 자른 값이 목표값보다 크거나 같으면
                start = mid;
            else {
                end = mid;
            }
        }
        System.out.println(start);
    }

    public static long cutterDetermin(long mid) { // 절단기로 자른 나무 길이 계산하여 반환
        long sum = 0;

        for (int i = 0; i < NUM.length; i++) {
            if (NUM[i] - mid > 0) {
                sum += (NUM[i] - mid);
            }
        }
        return sum;
    }
}

