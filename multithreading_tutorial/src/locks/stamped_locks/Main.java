package locks.stamped_locks;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        Point point = new Point(10, 20);

        Thread read1 = new Thread(
            () -> {
                double result = point.power();
                System.out.println("The result is : "+result);
            }
        );

        Thread write1 = new Thread(
            () -> {
                point.setX(90);
                double result = point.power();
                System.out.println("The result is : "+result);
            }
        );

        read1.setName("Read-Thread");
        write1.setName("Write-Thread");
        read1.start();
        Thread.sleep(500);
        write1.start();


    }
}
