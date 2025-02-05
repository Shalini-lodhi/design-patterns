// Subsystem classes remain the same
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

// Facade Class - Provides simple methods to start and shutdown the computer
class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void startComputer() {
        System.out.println("Starting Computer...");
        cpu.start();
        memory.load();
        hardDrive.read();
        System.out.println("Computer Started!\n");
    }

    public void shutdownComputer() {
        System.out.println("Shutting Down Computer...");
        hardDrive.write();
        memory.free();
        cpu.shutDown();
        System.out.println("Computer Shut Down!\n");
    }
}

// Client now interacts with the simple Facade class
public class withFacade {
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();

        // Client only calls high-level methods
        computer.startComputer();
        computer.shutdownComputer();
    }
}

