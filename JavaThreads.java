import java.util.Scanner;

class WorkerThread extends Thread {

    int id;
    WorkerThread(int id) {
        this.id = id;
    }




    public void run() {
        for (int i = 1; i <= 5; i++) {
        System.out.println("Thread Worker " + id + " : " + i);
        }
    }
}



class WorkerRunnable implements Runnable {

    int id;

    WorkerRunnable(int id) { this.id = id; }
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Runnable Worker " + id + " : " + i);
        }
    }
}

public class JavaThreads {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of workers: ");
int n = sc.nextInt();

System.out.println("Class");
        for (int i = 1; i <= n; i++) {
            WorkerThread t = new WorkerThread(i);
            t.start();
        }
System.out.println("Interface");
        for (int i = 1; i <= n; i++) {
            WorkerRunnable r = new WorkerRunnable(i);
            Thread t = new Thread(r);
            t.start();
        }
    }
}