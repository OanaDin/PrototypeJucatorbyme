package ro.dp.sub2.g1087.Prototype;

import java.util.List;

public class Antrenament implements IAntrenament{
    String denumire;

    public Antrenament(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public String getAntrenament(int index) {
        return null;

    }

    @Override
    public void getTimpTotal() {

    }


    @Override
    public String toString() {
        return "Antrenament{" +
                "denumire='" + denumire + '\'' +
                '}';
    }
}
