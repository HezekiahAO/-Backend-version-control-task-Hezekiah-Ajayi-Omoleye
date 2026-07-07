package games;

// Does NOT extend GameEntity or GameCharacter - a session isn't "a character",
// it's a controller/wrapper around a Player. That's why it's a plain class
// that just implements Playable instead of joining the character hierarchy.
public class GameSession implements Playable {

    private String sessionId;
    private String status;
    private Player player;

    public GameSession(String sessionId, Player player) {
        this.sessionId = sessionId;
        this.player = player;
        this.status = "NOT_STARTED";
    }

    public String getSessionId() { return sessionId; }
    public void setSessionId(String sessionId) { this.sessionId = sessionId; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public Player getPlayer() { return player; }
    public void setPlayer(Player player) { this.player = player; }

    @Override
    public String startGame() {
        status = "RUNNING";
        return "Session " + sessionId + " started for " + player.getName() + ".";
    }

    @Override
    public String pauseGame() {
        status = "PAUSED";
        return "Session " + sessionId + " paused.";
    }

    @Override
    public String endGame() {
        status = "ENDED";
        return "Session " + sessionId + " ended. Final score: " + player.getScore() + ".";
    }
}
