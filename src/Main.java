public class Main {
    public static void main(String[] args) {

        Smartphone myPhone = new SmartphoneBuilder()
                .setBrand("Apple")
                .setModel("iphone 15 pro")
                .setStorage(512)
                .setCpu("a 18 bionic")
                .setRam(8)
                .setScreenrefreshrate(120)
                .build();

        System.out.println(myPhone);

    }
}