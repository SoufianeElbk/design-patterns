public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.setVga(new Monitor());
        computer.view("Hello GLSID");
        HdmiToVgaAdapter adapter = new HdmiToVgaAdapter();
        adapter.setHdmi(new Tv());
        computer.setVga(adapter);
        computer.view("Hello Again");
    }
}
