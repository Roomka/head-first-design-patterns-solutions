package command;

public class Stereo {
    private static int DEFAULT_VOLUME = 5;

    private int volume;

    public Stereo() {
        volume = DEFAULT_VOLUME;
    }

    public void on() {
        System.out.println("The stereo is On");
    }

    public void off() {
        System.out.println("The stereo is Off");
    }

    public void setCd() {
        System.out.println("The CD is Set");
    }

    public void setDvd() {
        System.out.println("The DVD is Set");
    }

    public void setRadio() {
        System.out.println("The radio is Set");
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
