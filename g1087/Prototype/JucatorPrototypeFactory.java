package ro.dp.sub2.g1087.Prototype;

import java.util.HashMap;
import java.util.Map;

public class JucatorPrototypeFactory {

    private static Map<ETipJucator,Jucator> listaJucatori;


    static{
        listaJucatori=new HashMap<>();
        listaJucatori.put(ETipJucator.FOTBAL,new Jucator("Andrei",ETipJucator.FOTBAL));
        listaJucatori.put(ETipJucator.HANDBAL,new Jucator("Ionut",ETipJucator.HANDBAL));
        listaJucatori.put(ETipJucator.TENIS,new Jucator("Mihai",ETipJucator.TENIS));
    }

    public static Jucator getPrototype(ETipJucator tipJucator) throws CloneNotSupportedException {

        if(listaJucatori.containsKey(tipJucator)){
            try {
                return listaJucatori.get(tipJucator).clone();
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        }

        return null;
    }

}
