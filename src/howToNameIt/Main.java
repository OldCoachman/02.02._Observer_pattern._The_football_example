package howToNameIt;

import observable.Fifa;
import observer.BarcelonaFanObserver;
import observer.RealMadridFanObserver;

class Main {
    public static void main(String[] args) {
        Fifa fifa = new Fifa();

        // Initialize the game between Real Madrid and Spartak football clubs.
        Game gameOfRealMadridAndSpartak = new Game("01.01.1000", "Moon", "the open-air game", "Real Madrid", "Spartak");

        // Initialize Real Madrid fan community and subscribe it to observable.Fifa.
        RealMadridFanObserver observerRealMadrid = new RealMadridFanObserver();
        fifa.add(observerRealMadrid);
        System.out.println();

        fifa.gameInWeek(gameOfRealMadridAndSpartak);
        System.out.println();

        // Initialize the game between Zenit and Barcelona.
        Game gameOfZenitAndBarcelona = new Game("10.11.2080", "russian barn", "the indoor game",
                "Zenit", "Barcelona");
        BarcelonaFanObserver observerBarcelona = new BarcelonaFanObserver();
        fifa.add(observerBarcelona);
        System.out.println();

        fifa.gameInWeek(gameOfZenitAndBarcelona);
        System.out.println();

        // Initialize the match between Spartak and Zenit.
        Game gameOfSpartakAndZenit = new Game("01.02.1880", "bear cave", "the very indoor game",
                "Spartak", "Zenit");

        // Unsubscribe the Barcelona fan community
        fifa.remove(observerBarcelona);

        // The console will not show the game notification because Real Madrid does not participate in this game.
        fifa.gameInWeek(gameOfSpartakAndZenit);
    }
}
