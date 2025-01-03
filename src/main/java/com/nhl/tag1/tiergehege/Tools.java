package com.nhl.tag1.tiergehege;

import org.joda.time.DateTime;

public class Tools {
    public static int stundenBis(int dannStunde) {
        int jetztStunde = new DateTime().getHourOfDay();
        int delta = dannStunde - jetztStunde;
        return delta < 0 ? 24 - delta : delta;
    }
}
