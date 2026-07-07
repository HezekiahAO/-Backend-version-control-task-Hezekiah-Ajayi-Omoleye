package games;

public interface Scorable {
    int getScore();
    void addScore(int points);
    void resetScore();
}
