package locks.read_write_lock;

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource(0);

        Thread read1 = new Thread(
            () -> sharedResource.readValue()
        );

        Thread read2 = new Thread(
            () -> sharedResource.readValue()
        );

        Thread write1 = new Thread(
            () -> sharedResource.writeValue(10)
        );

        Thread write2 = new Thread(
            () -> sharedResource.writeValue(20)
        );

        
        write1.start();
        write2.start();
        read1.start();
        read2.start();


    }
}
