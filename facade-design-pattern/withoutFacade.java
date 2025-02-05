// Subsystem classes
class CPU {
    void start() { System.out.println("CPU is starting..."); }
    void shutDown() { System.out.println("CPU is shutting down..."); }
}

class Memory {
    void load() { System.out.println("Memory is loading..."); }
    void free() { System.out.println("Memory is freeing..."); }
}

class HardDrive {
    void read() { System.out.println("HardDrive is reading data..."); }
    void write() { System.out.println("HardDrive is writing data..."); }
}

// Client must call all these methods separately
public class withoutFacade {
    public static void main(String[] args) {
        CPU cpu = new CPU();
        Memory memory = new Memory();
        HardDrive hardDrive = new HardDrive();

        // Client has to handle all the steps
        cpu.start();
        memory.load();
        hardDrive.read();

        System.out.println("Computer Started!");

        // Now shutting down
        hardDrive.write();
        memory.free();
        cpu.shutDown();

        System.out.println("Computer Shut Down!");
    }
}
