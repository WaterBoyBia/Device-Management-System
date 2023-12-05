package 电子设备部管理;

public class Computer extends Electronics {
    private int Memory;
    private String CPU;

    public Computer() {
    }

    public Computer(int memory, String CPU) {
        Memory = memory;
        this.CPU = CPU;
    }

    public void getMemory() {
        System.out.println("内存大小为 " + Memory + " GB");
    }

    public void setMemory(int memory) {
        Memory = memory;
    }

    public void getCPU() {
        System.out.println("CPU型号为 " + CPU);
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }
    public void getinformation()
    {
        getName();
        getWeight();
        getPrice();
        getPowerConsumption();
        getManufacturer();
        getMemory();
        getCPU();
    }
}
