package �����豸������;

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
        System.out.println("�ڴ��СΪ " + Memory + " GB");
    }

    public void setMemory(int memory) {
        Memory = memory;
    }

    public void getCPU() {
        System.out.println("CPU�ͺ�Ϊ " + CPU);
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
