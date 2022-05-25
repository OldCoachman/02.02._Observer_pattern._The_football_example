package observer;

import howToNameIt.Game;

/**
 * Barcelona fans-subscribers.
 */
public class BarcelonaFanObserver extends IObserver {
    @Override
    public void update(Game game) {
        super.update(game);
    }

    @Override
    public String toString() {
        return "Barcelona fan community";
    }
}
