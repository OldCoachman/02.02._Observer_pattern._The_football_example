package observable;

import howToNameIt.Game;
import observer.IObserver;

import java.util.ArrayList;
import java.util.List;

public class Fifa implements IObservable {
    /**
     * List of observers.
     */
    private final List<IObserver> observers = new ArrayList<>();

    /**
     * Subscribe.
     */
    @Override
    public void add(IObserver observer) {
        observers.add(observer);
        System.out.println(observer.toString() + " is subscribed");
    }

    /**
     * Remove observers from the collection.
     */
    @Override
    public void remove(IObserver observer) {
        System.out.println(observer.toString() + " is unsubscribed");
        observers.remove(observer);
    }

    /**
     * Each observer is notified.
     */
    @Override
    public void inform(Game game) {
        String clubRealMadrid = "Real Madrid";
        String clubBarcelona = "Barcelona";

        for (IObserver observer : observers)
            if (((game.getClub1().contains(clubRealMadrid) || game.getClub2().contains(clubRealMadrid)) &&
                    observer.toString().contains(clubRealMadrid)) || (game.getClub1().contains(clubBarcelona) ||
            game.getClub2().contains(clubBarcelona)) && observer.toString().contains(clubBarcelona))
                observer.update(game);
    }

    /**
     * A game is in a week, so, it is a time to notify subscribers.
     */
    public void gameInWeek(Game game) {
        inform(game);
    }
}

