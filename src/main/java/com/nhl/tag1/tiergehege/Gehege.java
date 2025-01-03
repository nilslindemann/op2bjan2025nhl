package com.nhl.tag1.tiergehege;

import java.util.HashSet;
import java.util.Set;

public class Gehege implements Viele {

    public int futterMenge = 0;
    private final Set<Sozialisiert> mitglieder = new HashSet<>();

    public Gehege(Sozialisiert... mitglieder) {
        for (Sozialisiert mitglied : mitglieder) {
            this.add(mitglied);
        }
    }

    public void fuettere(int futterMenge) {
        this.futterMenge += futterMenge;
        for (Sozialisiert mitglied : this.mitglieder) {
            mitglied.iss();
        }
    }

    public void starteNachtruhe() {
        int schlafzeit = Tools.stundenBis(8);
        for (Sozialisiert mitglied : this.mitglieder) {
            mitglied.schlafe(schlafzeit);
        }
    }

    @Override
    public void add(Sozialisiert mitglied) {
        this.mitglieder.add(mitglied);
        mitglied.setGehege(this);
    }

    @Override
    public void remove(Sozialisiert mitglied) {
        this.mitglieder.remove(mitglied);
        mitglied.setGehege(null);
    }
}
