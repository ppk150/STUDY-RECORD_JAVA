import java.util.Scanner;

public class elice_2_3_20220906 {
    public static void main(String[] args) {

        int x;
        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();

        String[] str = new String[x];
        int[] count = new int[x];
        int result = 0;


        for(int i = 0 ; i < x ; i++){ // ���ڿ� �Է�
            str[i] = sc.next();
        }

        for(int i = 0 ; i < x ; i ++){
            for(int j = 0 ; j < x ; j++ ){
                if(str[i].equals(str[j]) &&i !=j && str[i].length() == str[j].length() ){
                    count[i]++; // ���� Ƚ���� ���� �迭�� �ִ´�
                }
            }
        }

        for(int i =0 ; i <x ; i ++){

            if(result <= count[i]){
                result = count[i]; // ���� ���� ���� Ƚ�� �Ǻ�
            }

       }

        for(int i = 0 ; i <x ; i ++){
            if(count[i] == result){
                System.out.println(str[i]);
                break;
            }
        }
    }
}
