package com.nhl.tag1.tiergehege;

import java.util.Set;
import java.util.HashSet;

public class Gruppe implements Viele, Sozialisiert {
    public final String bezeichner;
    private final Set<Sozialisiert> mitglieder = new HashSet<>();

    public Gruppe(String bezeichner, Sozialisiert... mitglieder) {
        this.bezeichner = bezeichner;
        for (Sozialisiert mitglied : mitglieder) {
            this.add(mitglied);
        }
    }

    @Override
    public void add(Sozialisiert mitglied) {
        this.mitglieder.add(mitglied);
    }

    @Override
    public void remove(Sozialisiert mitglied) {
        this.mitglieder.remove(mitglied);
    }

    @Override
    public void sage(String nachricht) {
        for (Sozialisiert mitglied : mitglieder) {
            mitglied.sage(nachricht);
        }
    }

    @Override
    public void iss() {
        for (Sozialisiert mitglied : mitglieder) {
            mitglied.iss();
        }
    }

    @Override
    public void schlafe(int stunden) {
        for (Sozialisiert mitglied : mitglieder) {
            mitglied.schlafe(stunden);
        }
    }

    @Override
    public void tolleHerum() {
        for (Sozialisiert mitglied : mitglieder) {
            mitglied.tolleHerum();
        }
    }

    @Override
    public void setGehege(Gehege gehege) {
        for (Sozialisiert t : mitglieder) {
            t.setGehege(gehege);
        }
    }
}
