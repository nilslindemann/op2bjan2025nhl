package com.nhl.tag1.tiergehege;

public class Tier implements Sozialisiert {
    public Gehege gehege;
    public final String name;
    public final String id;
    public int energiebedarf;  // 1 Energie = 1 Futter = 1 Stunde Schlafenszeit.

    public Tier(String name) {
        this.name = name;
        this.id = this.getClass().getSimpleName() + " " + this.name;
        this.energiebedarf = 10;
    }

    @Override
    public void setGehege(Gehege gehege) {
        this.gehege = gehege;
    }

    @Override
    public void sage(String nachricht) {
        StringBuilder tiernachricht = new StringBuilder(this.id).append(": ").append(nachricht.trim());
        if (this.energiebedarf > 0) {
            tiernachricht.append(", Energiebedarf ").append(this.energiebedarf);
        }
        System.out.println(tiernachricht);
    }

    @Override
    public void tolleHerum() {
        if (this.energiebedarf == 10) {
            this.sage("Kann nicht herumtollen");
        } else {
            this.energiebedarf = Math.min(this.energiebedarf + 5, 10);
            this.sage("Ich tolle herum");
        }
    }

    @Override
    public void iss() {
        int futterMenge = this.gehege.futterMenge;
        if (futterMenge == 0) {
            this.sage("nichts zu essen da");
        } else {
            if (this.energiebedarf == 0) {
                this.sage("Ich bin satt");
            } else {
                int essensmenge = Math.min(futterMenge, this.energiebedarf);
                this.energiebedarf -= essensmenge;
                this.sage("nom ".repeat(essensmenge));
                this.gehege.futterMenge -= essensmenge;
            }
        }
    }

    @Override
    public void schlafe(int stunden) {
        if (this.energiebedarf == 0) {
            this.sage("Ich bin ausgeschlafen");
        } else {
            stunden = Math.min(stunden, Math.min(this.energiebedarf, 8));
            if (stunden > 0) {
                this.energiebedarf -= stunden;
                this.sage("z".repeat(stunden));
            } else {
                this.sage("Es ist schon morgen");
            }
        }
    }
}
