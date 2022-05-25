package observer;

import howToNameIt.Game;

public abstract class IObserver {
    /**
     * Send a notification.
     */
    public void update(Game game) {
        System.out.println("COMING SOON!");
        System.out.println(game.getPlan() + " between " + game.getClub1() + " and " + game.getClub2());
        System.out.print("Date: ");
        System.out.println(game.getDate());
        System.out.print("Place: ");
        System.out.println(game.getPlace());
    }
}
