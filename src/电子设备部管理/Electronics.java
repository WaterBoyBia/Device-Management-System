package �����豸������;

public class Electronics {
    private String Name;
    private int Weight;
    private int Price;
    private int PowerConsumption;
    private String Manufacturer;


    public Electronics() {
    }

    public Electronics(String name, int weight, int price, int powerConsumption, String manufacturer) {
        Name = name;
        Weight = weight;
        Price = price;
        PowerConsumption = powerConsumption;
        Manufacturer = manufacturer;
    }

    public void getName() {
        System.out.println("��Ʒ��Ϊ " + Name);
    }

    public String GetName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public void getWeight() {
        //return Weight;
        System.out.println("����Ϊ " + Weight + " ��");
    }

    public void setWeight(int weight) {
        Weight = weight;
    }

    public void getPrice() {
        System.out.println("�۸�Ϊ " + Price + " Ԫ");
    }

    public void setPrice(int price) {
        Price = price;
    }

    public void getPowerConsumption() {
        System.out.println("�ĵ���Ϊ " + PowerConsumption + " ��");
    }

    public void setPowerConsumption(int powerConsumption) {
        PowerConsumption = powerConsumption;
    }

    public void getManufacturer() {
        System.out.println("������Ϊ " + Manufacturer);
    }

    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }
}
