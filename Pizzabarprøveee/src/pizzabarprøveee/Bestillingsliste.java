package pizzabarprøveee;

import java.util.ArrayList;

public class Bestillingsliste {
ArrayList<Odrer> bestillingsliste= new ArrayList<Odrer>();

    public Bestillingsliste() {
        
    }


public void addOdrer(Odrer odrer){
        bestillingsliste.add(odrer);       
        }
public double samletAfgiftforalt(){ 
        
     double prisodrer=0;     
        for(Odrer o:bestillingsliste){
            prisodrer+=o.samletAfgift();
            
        }
       
        return prisodrer;
}
public String toString() {
        String result="";
        for (Odrer o:bestillingsliste){ 
            result+=o.toString();
            result+="\n";
        }
        return"\n"+result;
    }
}

