public class GuesserGameTest {

    public static void main(String[] args) {

        int low = Integer.parseInt(args[0]);
        int high = Integer.parseInt(args[1]);

        GuesserGame Jim = new GuesserGame(low, high);

        Jim.start();


    }

}
