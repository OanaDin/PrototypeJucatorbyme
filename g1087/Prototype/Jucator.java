package ro.dp.sub2.g1087.Prototype;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Jucator extends AJucator implements Cloneable{
    private static List<String> listaMedicamenteInterzise1=new ArrayList<>();

     Jucator(String nume,ETipJucator tipJucator) {
         this.numeJucator=nume;
        this.listaAntrenamente=new ArrayList<>();
        this.tipJucator=tipJucator;

        if(this.tipJucator==ETipJucator.HANDBAL){
            listaAntrenamente.add(new Antrenament("Antrenament handbal 1") );
            listaAntrenamente.add(new Antrenament("antrenament handbal"));

        }
        else if(tipJucator==ETipJucator.TENIS){
            listaAntrenamente.add(new Antrenament("antrenament tenis 1"));
            listaAntrenamente.add(new Antrenament("antrenament tenis 2"));
        }
        else if(tipJucator==ETipJucator.FOTBAL){
            listaAntrenamente.add(new Antrenament("antrenament fotbal 2"));
            listaAntrenamente.add(new Antrenament("antrenament fftobal 1"));
        }
        this.listaMedicamenteInterzise=listaMedicamenteInterzise1;


    }

    @Override
    protected Jucator clone() throws CloneNotSupportedException {
        Jucator jucator=(Jucator) super.clone();
        jucator.listaAntrenamente=new ArrayList<>(this.listaAntrenamente);
        jucator.listaMedicamenteInterzise=this.listaMedicamenteInterzise;


        return jucator;
    }

    @Override
    public void executaAntrenament(int index) {

        IAntrenament antrenament=listaAntrenamente.get(index);

        System.out.println("Antrenamentul "+ antrenament+ "a fost executat");

    }

    @Override
    public float getNivelForta() {
        float nivelForta=0;
        if(listaAntrenamente.size()>1){
            nivelForta+=10;
        }
        System.out.println("Nivelul de forta este: "+nivelForta);

        return 0;
    }

    @Override
    public void addMedicamentInterzis(String medicament) {
        if(this.listaMedicamenteInterzise1==null){
            this.listaMedicamenteInterzise1=new ArrayList<>();
        }
        this.listaMedicamenteInterzise1.add(medicament);
    }

    @Override
    public boolean testareAntiDoping() {
         List<String> medicamenteInterzise=new ArrayList<>();
         medicamenteInterzise.add("unu");
         medicamenteInterzise.add("doi");
         //String medicamentInterzis="medInt";

         for(String m:listaMedicamenteInterzise){
             for(String mi:medicamenteInterzise){
                 if(Objects.equals(m, mi)){ System.out.println("Test antiDoping esuat!");
                     return true ;
             }

         }}
        System.out.println("Test antiDoping reusit!");
        return false;
    }

    @Override
    public String toString() {
        return "Jucator{" +
                "numeJucator='" + numeJucator + '\'' +
                ", listaAntrenamente=" + listaAntrenamente +
                ", listaMedicamenteInterzise=" + listaMedicamenteInterzise +
                ", tipJucator=" + tipJucator +
                '}';
    }
}
