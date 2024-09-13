public class Synchronization extends Thread{
    public static synchronized void method(String message){
        System.out.println(message);
        try{
            Thread.sleep(2000);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Synchronization s=new Synchronization();
        Thread t1=new Thread(()-> {
        for(int i = 0;i<5;i++)

            {
                method("Hello ");
            }
        });
        Thread t2=new Thread(()->{
        for (int i=0;i<5;i++) {
            method("Welcome Aboard");}
        });
        t1.start();
        t2.start();
    }
}

