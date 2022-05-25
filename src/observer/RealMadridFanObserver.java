package observer;

import howToNameIt.Game;

/**
 * Real Madrid fans-subscribers.
 */
public class RealMadridFanObserver extends IObserver { @Override
    public void update(Game game) {
        super.update(game);
    }

    @Override
    public String toString() {
        return "Real Madrid fan community";
    }
}
