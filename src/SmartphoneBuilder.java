public class SmartphoneBuilder {
    private String brand;
    private String model;
    private int storage;
    private String cpu;
    private int ram;
    private int screenrefreshrate;

    public SmartphoneBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public SmartphoneBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public SmartphoneBuilder setStorage(int storage) {
        this.storage = storage;
        return this;
    }

    public SmartphoneBuilder setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    public SmartphoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public SmartphoneBuilder setScreenrefreshrate(int screenrefreshrate) {
        this.screenrefreshrate = screenrefreshrate;
        return this;
    }

    public Smartphone build() {
        return new Smartphone(brand, model, storage, cpu, ram, screenrefreshrate);
    }
}
