import java.util.Scanner;

public class elice_2 {
    public static void main(String[] args) {
        int x;
        String IN = new String("");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();

        String[] A = new String[x];
        IN = sc.next();
        A = IN.split("");

        int[] count_1 = new int[4];
        int result = 0;




        for(int i = 0 ; i < x ; i++){
            if(A[i].equals("[")){
                count_1[0]++;
            }else if(A[i].equals("]")){
                count_1[1]++;
            }else if(A[i].equals("(")){
                count_1[2]++;
            }else if(A[i].equals(")")){
                count_1[3]++;
            }
        }

        if(count_1[0] == count_1[1] &&count_1[2] == count_1[3] ){
            result = 1;
        }else{
            result = 0 ;
        }
        System.out.println(result);
    }
}
