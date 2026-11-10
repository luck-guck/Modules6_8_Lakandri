public class LoopPracticePartC {
    public static void main(String[] args) {
        int counter = 0;
        boolean keepRunning = true;

        do {
            System.out.println("Hello");
            counter++;

            // Change the flag when the counter reaches 3 to stop the loop
            if (counter >= 3) {
                keepRunning = false;
            }
        } while (keepRunning);
    }
}

