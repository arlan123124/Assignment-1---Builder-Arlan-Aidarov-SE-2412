public class Smartphone {
    private final String brand;
    private final String model;
    private final int storage;
    private final String cpu;
    private final String gpu;
    private final int ram;
    private final int screenrefreshrate;


    Smartphone(String brand, String model, int storage, String cpu, String gpu, int ram, int screenrefreshrate) {
        this.brand = brand;
        this.model = model;
        this.storage = storage;
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
        this.screenrefreshrate = screenrefreshrate;
    }
}