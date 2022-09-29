public class MobilePhone extends MobileDevice{
    public boolean isLteSupport() {
        return lteSupport;
    }

    public void setLteSupport(boolean lteSupport) {
        this.lteSupport = lteSupport;
    }

    private boolean lteSupport;

    public MobilePhone(String deviceType, String os, String cpu, int ramSize, float displaySize, boolean lteSupport) {
        this.lteSupport = lteSupport;
        setDeviceType(deviceType);
        setOs(os);
        setCpu(cpu);
        setRamSize(ramSize);
        setDisplaySize(displaySize);
    }

    @Override
    public void showDeviceInfo() {
        System.out.println("Typ urządzenia: "+getDeviceType());
        System.out.println("System operacyjny: "+getOs());
        System.out.println("Procesor: "+ getCpu());
        System.out.println("Rozmiar pamięci RAM: "+getRamSize());
        System.out.println("Rozmiar wyświetlacza: "+getDisplaySize());
        System.out.println("Czy obsługuje LTE: " +isLteSupport());
    }
}
