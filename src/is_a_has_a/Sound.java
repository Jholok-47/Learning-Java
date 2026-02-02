// This class represents a Sound with specific attributes.
package is_a_has_a;

public class Sound {
    private String soundType;
    private int volume;
    private String pitch;

    public Sound(String soundType, int volume, String pitch) {
        this.soundType = soundType;
        this.volume = volume;
        this.pitch = pitch;
    }

    public String toString() {
        return "Sound[type=" + soundType + ", volume=" + volume + ", pitch=" + pitch + "]";
    }
}
