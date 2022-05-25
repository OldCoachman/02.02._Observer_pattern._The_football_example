package observable;

import howToNameIt.Game;
import observer.IObserver;

interface IObservable {
    void add(IObserver observer);
    void remove(IObserver observer);
    void inform(Game game);
}
