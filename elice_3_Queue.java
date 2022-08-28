import java.util.LinkedList; //import
import java.util.Queue;
import java.util.Scanner;

public class elice_3_Queue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        int N = sc.nextInt();

        int count = N;
        int countQ = 0 ;

        while (count != 0){

            int x = sc.nextInt();
            if(x == 1){
                int in =sc.nextInt();
                queue.add(in);
                count--;
            }
            if(x == 2){
                if(queue.peek()!=null){
                    queue.remove();
                }
                count--;
            }
            if(x == 3){
                if(queue.peek()==null){
                    System.out.println("-1");
                }else{
                    System.out.println(queue.peek());
                }
                count--;
            }
            if(x == 4){
                System.out.println(queue.size());
                count--;

            }


        }

    }
}
