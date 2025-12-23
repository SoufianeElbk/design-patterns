public class Tv implements Hdmi {
    @Override
    public void plot(byte[] data) {
        System.out.println("********** Tv **********");
        System.out.println(new String(data));
        System.out.println("********** Tv **********");
    }
}
