package 电子设备部管理;

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
        System.out.println("商品名为 " + Name);
    }

    public String GetName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public void getWeight() {
        //return Weight;
        System.out.println("重量为 " + Weight + " 克");
    }

    public void setWeight(int weight) {
        Weight = weight;
    }

    public void getPrice() {
        System.out.println("价格为 " + Price + " 元");
    }

    public void setPrice(int price) {
        Price = price;
    }

    public void getPowerConsumption() {
        System.out.println("耗电量为 " + PowerConsumption + " 瓦");
    }

    public void setPowerConsumption(int powerConsumption) {
        PowerConsumption = powerConsumption;
    }

    public void getManufacturer() {
        System.out.println("制造商为 " + Manufacturer);
    }

    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }
}
