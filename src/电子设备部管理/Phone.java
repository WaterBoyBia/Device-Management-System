package 电子设备部管理;

public class Phone extends Electronics {
    private String OS;
    private int Disk;

    public Phone() {
    }

    public Phone(String OS, int disk) {
        this.OS = OS;
        Disk = disk;
    }

    public void getOS() {
        System.out.println("操作系统为 " + OS);
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public void getDisk() {
        System.out.println("储存大小为 " + Disk + " GB");
    }

    public void setDisk(int disk) {
        Disk = disk;
    }
    public void getinformation()
    {
        getName();
        getWeight();
        getPrice();
        getPowerConsumption();
        getManufacturer();
        getDisk();
        getOS();
    }
}
