public class Tablet extends MobileDevice{
    private boolean pencilSupport;

    public boolean isPencilSupport() {
        return pencilSupport;
    }

    public void setPencilSupport(boolean pencilSupport) {
        this.pencilSupport = pencilSupport;
    }

    @Override
    public void showDeviceInfo() {
        System.out.println("Typ urządzenia: "+getDeviceType());
        System.out.println("System operacyjny: "+getOs());
        System.out.println("Procesor: "+ getCpu());
        System.out.println("Rozmiar pamięci RAM: "+getRamSize());
        System.out.println("Rozmiar wyświetlacza: "+getDisplaySize());
        System.out.println("Czy obsługuje rysik: " +isPencilSupport());
    }
}
