public class Main {
    public static void main(String[] args) {
        System.out.println("Mobile Device");

        Tablet tablet1 = new Tablet();
        tablet1.setDeviceType("Samsung tabjakiśtam");
        tablet1.setOs("Android 8.0");
        tablet1.setCpu("Snap dragon 750");
        tablet1.setRamSize(8);
        tablet1.setPencilSupport(true);

        System.out.println();

        tablet1.showDeviceInfo();
        MobilePhone mobilePhone1 = new MobilePhone("ASUS Zenfone 7", "Android 12.0", "Snapdragon 750", 8, 6.2f, true);

        mobilePhone1.showDeviceInfo();
    }
}