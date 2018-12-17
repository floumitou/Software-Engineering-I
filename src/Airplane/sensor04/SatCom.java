package Airplane.sensor04;

public class SatCom implements ISatCom {
    private String manufacturer;
    private String type;
    private String id;
    private boolean isConnected;
    private boolean isOn;

    public SatCom(String manufacturer, String type, String id, boolean isConnected, boolean isOn) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.id = id;
        this.isConnected = isConnected;
        this.isOn = isOn;
    }

    @Override
    public String version() {
        return "<" + id + "> - <" + type + ">";
    }

    @Override
    public void on() {
        this.isOn = true;
    }

    @Override
    public void connect(String satellite, String frequency) {

    }

    @Override
    public void send(String request) {

    }

    @Override
    public String recieve() {
        return null;
    }

    @Override
    public void off() {
        this.isOn = false;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isConnected() {
        return isConnected;
    }

    public void setConnected(boolean connected) {
        isConnected = connected;
    }
}