public class RiverCrossingChallenge {

    public boolean detectPhishing(String url) {
        // Simulated phishing detection logic
        return url.contains("unsafe");
    }

    public void startChallenge() {
        System.out.println("Welcome to the River Crossing Challenge!");
        String testUrl = "http://example.com/unsafe-path"; // Example test URL
        if (detectPhishing(testUrl)) {
            System.out.println("Phishing detected! You cannot cross the river.");
        } else {
            System.out.println("Safe URL. You can cross the river!");
        }
    }

    public static void main(String[] args) {
        RiverCrossingChallenge challenge = new RiverCrossingChallenge();
        challenge.startChallenge();
    }
}