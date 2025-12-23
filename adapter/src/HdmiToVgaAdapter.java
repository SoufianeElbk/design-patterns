public class HdmiToVgaAdapter implements Vga{
    private Hdmi hdmi;
    @Override
    public void print(String message) {
        System.out.println("********** HdmiToVgaAdapter **********");
        hdmi.plot(message.getBytes());
        System.out.println("********** HdmiToVgaAdapter **********");
    }

    public void setHdmi(Hdmi hdmi) {
        this.hdmi = hdmi;
    }
}
