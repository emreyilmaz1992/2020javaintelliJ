package Interview_Questions;

public class WarmUp {
    public static void main(String[] args) {


        int pushUps = 0;


        while(pushUps<20){
            System.out.println("Pushup"+(pushUps+1));
            try {
                Thread.sleep(300);
            }catch(Exception e){

            }

            pushUps++;

        }





    }
}
