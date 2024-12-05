public class Hilo extends Thread{

    @Override
    public void run() {
        for (int i=0;i<5;i++){
            System.out.println(i+ "hilo1");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Soy el hilo 1");
    }
}
