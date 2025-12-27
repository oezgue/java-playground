package codeWars;

public class HumanReadableTime {
    public static String makeReadable (int seconds){
        StringBuilder sb = new StringBuilder("::");
        int hours = seconds / (60*60);
        int minutes = (seconds % 3600) / 60;
        int secs = (seconds % 60);

        sb.insert(0, hours/10);
        sb.insert(1, hours%10);
        sb.insert(3, minutes/10);
        sb.insert(4, minutes%10);
        sb.insert(6, secs/10);
        sb.insert(7, secs%10);

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(makeReadable(66));
    }
}
