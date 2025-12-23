public class Computer {
    private Vga vga;

    public void view(String message) {
        System.out.println("********** Computer **********");
        vga.print(message);
        System.out.println("********** Computer **********");
    }

    public void setVga(Vga vga) {
        this.vga = vga;
    }
}
