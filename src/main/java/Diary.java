import java.util.ArrayList;

public class Diary {
    private ArrayList<Entry> entryList;
    private int pin;
    private boolean isLocked;

    public Diary(ArrayList<Entry> entryList, int pin, boolean isLocked) {
        this.entryList = entryList;
        this.pin = pin;
        this.isLocked = isLocked;
    }

    public Diary(int pin, boolean isLocked) {
        this.pin = pin;
        this.isLocked = isLocked;
    }

    public ArrayList<Entry> getEntryList() {
        return entryList;
    }

    public void setEntryList(ArrayList<Entry> entryList) {
        this.entryList = entryList;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    public static boolean unlock(int enteredPin, int pin) {
//        if(pin == enteredPin) {
//
//            return true;
//        }
        return pin == enteredPin;
    }
}
