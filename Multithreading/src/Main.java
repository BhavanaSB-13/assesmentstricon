//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Threading t=new Threading();
        Threading2 mt =new Threading2();
        Thread thread1=new Thread(t);//with sleep
        Thread thread2=new Thread(mt);
        System.out.println(thread1.getPriority());
        thread1.setName("Sleep threads");
        thread2.setName("Normal Threads");
        thread1.setPriority(10);
        thread2.setPriority(Thread.MIN_PRIORITY);
        System.out.println("t1->"+thread1.getPriority());
        System.out.println("t1->"+thread1.getName());
        System.out.println("t2->"+thread2.getPriority());
        System.out.println("t2->"+thread2.getName());
        thread2.start();
        thread1.start();
    }
}