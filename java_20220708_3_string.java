import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

public class java_20220708_3_string {
    public static void main(String[] args) {

        InputStream in = System.in;
        Scanner sc = new Scanner(System.in);

        String[] A = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

        int[] B = new int[26]; // A 와 C를 비교하여 해당 글자의 순서, 유무 넣는 배열
        Arrays.fill(B,-1);


        String C = sc.nextLine(); // 입력받을 구문 받는 배열
        String[] D = C.split("");

        int count = 0;
        int T = C.length();

        for (int i =0; i < T ; i++ ){

            for (int k = 0 ; k < 26 ; k++ ){

                if (D[i].equals(A[k])) {

                    if(B[k] == -1) {

                        B[k] = count;
                        count++;
                        break;

                    }else{
                        count++;
                    }

                }


            }

        }

        for (int j = 0 ; j < 26 ; j++){

            System.out.print(B[j]+" ");

        }


    }
}
