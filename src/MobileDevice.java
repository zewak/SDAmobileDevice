public abstract class MobileDevice {
    private float displaySize;
    private int ramSize;
    private String cpu;
    private String os;
    private String deviceType;


    public float getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(float displaySize) {
        this.displaySize = displaySize;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    MobileDevice(String deviceType, String os, String cpu, float displaySize, int ramSize){  // czy to ma sens chyba nie bardzo bo i tak nie można tak robić objektów?
        this.deviceType = deviceType;
        this.cpu = cpu;
        this.os = os;
        this.displaySize = displaySize;
        this.ramSize = ramSize;
    }


    public abstract void showDeviceInfo();
}
