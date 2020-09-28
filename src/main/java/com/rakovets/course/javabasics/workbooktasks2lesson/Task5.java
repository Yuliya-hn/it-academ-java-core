public class Task5 {
    public static void main(String[] args) {
        int playingTimeInSeconds = 6043800;
        int weeks = playingTimeInSeconds / 604800;
        playingTimeInSeconds = playingTimeInSeconds - (weeks * 604800);
        int days = playingTimeInSeconds / 86400;
        playingTimeInSeconds = playingTimeInSeconds - (days * 86400);
        int hours = playingTimeInSeconds / 3600;
        playingTimeInSeconds = playingTimeInSeconds - (hours * 3600);
        int minutes = playingTimeInSeconds / 60;
        playingTimeInSeconds = playingTimeInSeconds - (minutes * 60);

        System.out.println( weeks +" weeks " + days + " days " + hours + ":" + minutes + ":" + playingTimeInSeconds);
    }
}
