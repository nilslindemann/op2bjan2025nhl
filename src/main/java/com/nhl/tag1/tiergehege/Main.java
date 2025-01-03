package com.nhl.tag1.tiergehege;

public class Main {
    public static void main(String[] args) {
        Gruppe alle = new Gruppe("Alle Tiere im Gehege",
            new Gruppe("Elefanten aus Afrika",
                new Elefant("Else"),
                new Elefant("Karl"),
                new Elefant("Jenny")
            ),
            new Gruppe("Elefanten vom Zoo Düsseldorf",
                new Elefant("Klaus"),
                new Elefant("Susanne")
            ),
            new Gruppe("Kühe vom nahegelegenen Bauernhof",
                new Gruppe("Nette Kühe",
                    new Kuh("Dieter"),
                    new Kuh("Edeltraut")
                ),
                new Gruppe("Wilde Kühe",
                    new Kuh("Django")
                )
            )
        );

        Gehege gehege = new Gehege(alle);

        System.out.println("--- Eat ---");
        gehege.fuettere(25);

        System.out.println("--- Sleep ---");
        gehege.starteNachtruhe();

        System.out.println("--- Play ---");
        alle.tolleHerum();

        System.out.println("--- Repeat ---");
        gehege.fuettere(69);
    }
}
