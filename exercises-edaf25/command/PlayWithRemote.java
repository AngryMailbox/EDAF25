package command;

public class PlayWithRemote {

    public static void main(String[] args) {
        Device tv = Remote.getDevice();
        turnTVon on = new turnTVon(tv);
        DeviceButton btn = new DeviceButton(on);
        btn.press();
    }

}
