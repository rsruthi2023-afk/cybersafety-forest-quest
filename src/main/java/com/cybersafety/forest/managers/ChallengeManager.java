import java.util.HashMap;
import java.util.Map;

public class ChallengeManager {
    private Map<String, Challenge> challenges;

    public ChallengeManager() {
        challenges = new HashMap<>();
    }

    public void addChallenge(String id, Challenge challenge) {
        challenges.put(id, challenge);
    }

    public void startChallenge(String id) {
        Challenge challenge = challenges.get(id);
        if (challenge != null) {
            challenge.start();
        }
    }

    public void completeChallenge(String id) {
        Challenge challenge = challenges.get(id);
        if (challenge != null) {
            challenge.complete();
        }
    }

    public Challenge getChallenge(String id) {
        return challenges.get(id);
    }
}

class Challenge {
    private String name;
    private boolean isActive;
    private boolean isCompleted;

    public Challenge(String name) {
        this.name = name;
        this.isActive = false;
        this.isCompleted = false;
    }

    public void start() {
        this.isActive = true;
    }

    public void complete() {
        this.isActive = false;
        this.isCompleted = true;
    }

    public boolean isCompleted() {
        return isCompleted;
    }
}