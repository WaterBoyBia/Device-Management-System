package �����豸������;

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
        System.out.println("����ϵͳΪ " + OS);
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public void getDisk() {
        System.out.println("�����СΪ " + Disk + " GB");
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
