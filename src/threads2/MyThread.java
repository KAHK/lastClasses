package threads2;

public class MyThread extends Thread {
    private String name;
    private int iterator;

    private AllThreads allThreads;
    private Thread nextThread;

    public MyThread(String name, AllThreads allThreads){
        this.name = name;
        this.allThreads = allThreads;
        this.nextThread = nextThread;
    }

    public MyThread(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void run() {
        try{
            if (nextThread!=null) nextThread.join();
            while (iterator<10){
                iterator++;
                System.out.println(name + "it=" + iterator);
                allThreads.increase(name);
                this.sleep(500);
            }




        } catch (InterruptedException ie){
            System.out.println("Thread" + name + "interrupted");
        }


    }
}
