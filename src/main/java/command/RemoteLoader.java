package command;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        Light livingRoomLight = new Light("Living Room");
        Stereo stereo = new Stereo();
        CeilingFan ceilingFan = new CeilingFan("Living Room");


        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand lightRoomLightOff = new LightOffCommand(livingRoomLight);
        StereoOnWithCDCommand stereoOnCommand = new StereoOnWithCDCommand(stereo);
        StereoOffWithCDCommand stereoOffCommand = new StereoOffWithCDCommand(stereo);
        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        remoteControl.setCommand(0, livingRoomLightOn, lightRoomLightOff);
        remoteControl.setCommand(1, stereoOnCommand, stereoOffCommand);
        remoteControl.setCommand(3, ceilingFanHigh, ceilingFanOff);
        remoteControl.setCommand(4, ceilingFanMedium, ceilingFanOff);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(0);
        remoteControl.offButtonWasPushed(1);
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(3);
        remoteControl.onButtonWasPushed(4);
        remoteControl.undoButtonWasPushed();
        System.out.println(remoteControl);
    }


}
