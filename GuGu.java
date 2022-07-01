public class GuGu {

    public void dan(int n){

        for (int i = 1 ; i < 10 ; i++){
            System.out.println(n*i);
        }
    }


    public static void main(String[] args){
        int n = 3 ;
        GuGu gugu = new GuGu();

        for (int i = 2; i < 10 ; i++){
            gugu.dan(i);
        }
    }
}
