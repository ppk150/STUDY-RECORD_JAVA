import java.io.*;

public class java_20220810_1_num {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] TT = bf.readLine().split(" ");
        int T_1 = Integer.parseInt(TT[0]);// TT[0] ù��° ����
        int T_2 = Integer.parseInt(TT[1]);// TT[1] �ι�° ����

        int a = Integer.parseInt(TT[0]);// TT[0] ù��° ����
        int b = Integer.parseInt(TT[1]);// TT[0] ù��° ����

        int end = 0;
        int result =0 ;

        while(end == 0 ){

            //----------------------�ִ�����--------------
            if(T_1 % T_2 ==0){
                result = T_2;
                end=1;
                break;
            } else if (T_2 % T_1 ==0) {
                result = T_1;
                end=1;
                break;
            }

            if(T_1 > T_2){
                T_1 =  T_1 % T_2;
            } else if (T_1 < T_2) {
                T_2 =  T_2 % T_1;
            }

            //------------------------�ִ����� ��-----------


        }
        System.out.println(result);
        if(result !=0) {
            System.out.println((a * b) / (result)); // �ּҰ���� = a*b/a,b�� �ִ�����
        }else{
            System.out.println((a * b));
        }


    }
}
