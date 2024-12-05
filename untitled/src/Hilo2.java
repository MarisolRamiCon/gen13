public class Hilo2 implements Runnable{
    @Override
    public void run() {
        for (int i=0;i<5;i++){
            System.out.println(i+ "hilo2");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Provengo del hilo2");
    }
}
