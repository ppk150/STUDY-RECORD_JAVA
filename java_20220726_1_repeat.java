import java.io.InputStream;
import java.util.Scanner;

public class java_20220726_1_repeat {
    public static void main(String[] args) {
        InputStream in = System.in;
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        System.out.println("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.");
        repeat(T, 0);
        System.out.println("��� �亯�Ͽ���.");






    }
    public static int repeat(int num , int i ){
        if ( num == i){
            System.out.println("____".repeat(num) + "\"����Լ��� ������?\"");
            System.out.println("____".repeat(num) + "\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"" );
            for (int k =0; k < num ; k++ ){
                System.out.println("____".repeat(num - k) +"��� �亯�Ͽ���.");
            }

            return 0;
        }else{
            System.out.println("____".repeat(i) + "\"����Լ��� ������?\"");
            System.out.println("____".repeat(i) + "\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.");
            System.out.println("____".repeat(i) + "���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.");
            System.out.println("____".repeat(i) + "���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"");


            return repeat(num, i+1);
        }

    }

}
