package ro.dp.sub2.g1087.Main;

import ro.dp.sub2.g1087.Prototype.ETipJucator;
import ro.dp.sub2.g1087.Prototype.Jucator;
import ro.dp.sub2.g1087.Prototype.JucatorPrototypeFactory;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Jucator hanbal1= JucatorPrototypeFactory.getPrototype(ETipJucator.HANDBAL);
        Jucator hanbal2= JucatorPrototypeFactory.getPrototype(ETipJucator.HANDBAL);
        Jucator fotbal= JucatorPrototypeFactory.getPrototype(ETipJucator.FOTBAL);
        Jucator tenis= JucatorPrototypeFactory.getPrototype(ETipJucator.TENIS);
        Jucator tenis2= JucatorPrototypeFactory.getPrototype(ETipJucator.TENIS);

        hanbal1.executaAntrenament(1);
        String nou="unu99";
        hanbal1.addMedicamentInterzis(nou);
        fotbal.addMedicamentInterzis("interzis!!!");
        hanbal1.testareAntiDoping();
        System.out.println(hanbal1);
        System.out.println(fotbal);

    }
}
