package Practice4;

import java.util.*;

public class ZooClub {
    private Map<Person, ArrayList<Pet>> mapa;

    public ZooClub(Map<Person, ArrayList<Pet>> mapa) {
        this.mapa = mapa;
    }

    public Map<Person, ArrayList<Pet>> getMapa() {
        return mapa;
    }

    public void setMapa(Map<Person, ArrayList<Pet>> mapa) {
        this.mapa = mapa;
    }


}
