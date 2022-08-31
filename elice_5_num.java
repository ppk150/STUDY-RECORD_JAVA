import java.io.InputStream;
import java.util.Scanner;

public class elice_5_num {
    public static void main(String[] args) {

        InputStream in = System.in;
        Scanner sc = new Scanner(System.in);

        String[] A = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

        int[] B = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}; // A 와 C를 비교하여 해당 글자의 순서, 유무 넣는 배열


        String C = sc.nextLine(); // 입력받을 구문 받는 배열
        String[] D = C.split("");

        int count = 1;
        int T = C.length();
        int countchar = 0;

        for (int i =0; i < T ; i++ ){

            for (int k = 0 ; k < 26 ; k++ ){
                if (D[i].equals(A[k])) {
                        B[k] = count;
                        break;
                }
            }
        }

        for(int i = 0 ; i < 26 ; i++){
            if(B[i]!=0){
                countchar = countchar+1;
            }

        }

        if(countchar<=2){
            System.out.println("0");
        }else{
            System.out.println(countchar-2);
        }


    }
}