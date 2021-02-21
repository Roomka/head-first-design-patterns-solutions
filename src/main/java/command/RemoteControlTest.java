package command;

public class RemoteControlTest {

    public static void main(String[] args) {
        Light light = new Light("Living Room");
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        SimpleRemoteControl remote = new SimpleRemoteControl();
        remote.setCommand(lightOnCommand);
        remote.buttonWasPressed();

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);
        remote.setCommand(garageOpen);
        remote.buttonWasPressed();

    }
}
