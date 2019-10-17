
package pizzabarprøveee;
import java.util.ArrayList;

public class Pizzabarprøve {

 
    public static void main(String[] args) {
        //making the menu
        System.out.println("Pizza Menu");
        System.out.println("1 med peperoni, ost"
                + "\n2 med peperoni, skinke, ost"
                + "\n3 med gorgonzola, oksekød og ost"
                + "\n4 Med tomat, ost, gorgonzola, champignon og grøn peber"
                + "\n5 Med tomat, ost, skinke og champignon"
                + "\n6 Med tomat, ost, hakket oksekød, champignon og løg"
                + "\n7 Med tomat, ost, skinke, salami og champignon"
                + "\n8 Med tomat, ost, skinke, bacon og æg"
                + "\n9 Med tomat, ost, kylling, løg og paprika"
                + "\n10 Med tomat, ost, kebab og løg"                
                + "\n11 Med tomat, ost, skinke og ananas"
                + "\n12 Med tomat, ost, skinke og pepperoni"
                + "\n13 Med tomat, ost, skinke og bacon"
                + "\n14 Med tomat, ost, parmaskinke, rucolasalat og pesto"
                + "\n15 Med tomat, ost, skinke og cocktailpølser"
                + "\n16 Med tomat, ost, skinke, kødsauce, shawarma, kødboller, rejer og ananas"
                + "\n17 Med tomat, ost, champignon, løg, ananas, asparges og paprika"                                               
                + "\n18 Med tomat, ost, skinke, pepperoni, cocktailpølser og bacon"
                + "\n19 Med tomat, ost, kebab, løg, fetaost og tomatskiver"
                + "\n20 Med tomat, ost, kylling, friske tomater, paprika, løg og bacon "                
                + "\n21 Med tomat, ost, shawarma og champignon"
                + "\n22 Med tomat, ost, kebab, pepperoni, grøn peber, chili og hvidløg"
                + "\n23 Med tomat, ost, hakket oksekød, grøn peber, shawarma, chili og hvidløg"
                + "\n24 Med tomat, ost, hakket oksekød, grøn peber og gorgonzola"
                + "\n25 Med tomat, ost, skinke, bacon og løg"
                + "\n26 Med tomat, ost, skinke, kødsauce og champignon"
                + "\n27 Med tomat, ost, skinke, hakket oksekød og bearnaisesauce"
                + "\n28 Med tomat, ost, shawarma, gorgonzola, hvidløg og chili"
                + "\n29 Med tomat, ost, rucola salat, kylling og pesto"
                + "\n30 Med tomat, ost, kebab, bacon, hvidløg, pepperoni og løg");                                                                   
        //making the pizza with the price                                                                                                      
        Pizzaer pizza1 = new Pizzaer("Tomato pepo Special"," peperoni, ost", 70);
        Pizzaer pizza2 = new Pizzaer("Tomato peposkinke Special"," peperoni, ost, skinke", 75);
        Pizzaer pizza3 = new Pizzaer("Gorgo","gorgonzola, oksekød, ost,champignon,grøn peber", 68);
        Pizzaer pizza4 = new Pizzaer("Champinjo","tomat, ost, skinke og champignon", 70);
        Pizzaer pizza5 = new Pizzaer("Tomato pepo Special"," tomat, ost, hakket oksekød, champignon og løg", 71);       
        Pizzaer pizza6 = new Pizzaer("Tomato"," tomat, ost, skinke, salami og champignon", 70);       
        Pizzaer pizza7 = new Pizzaer("oschampo"," tomat, ost, skinke, salami og champignon", 75);
        Pizzaer pizza8 = new Pizzaer("skinkbaco"," tomat, ost, skinke, bacon og æg", 100);
        Pizzaer pizza9 = new Pizzaer("papriko"," tomat, ost, kylling, løg og paprika", 100);
        Pizzaer pizza10 = new Pizzaer("kebabo"," tomat, ost, kebab og løg", 100);        
        Pizzaer pizza11 = new Pizzaer("ananas"," tomat, ost, skinke og ananas", 70);
        Pizzaer pizza12 = new Pizzaer("PEPERONI"," tomat, ost, skinke og pepperoni", 75);
        Pizzaer pizza13 = new Pizzaer("bacon","Med tomat, ost, skinke og bacon", 68);
        Pizzaer pizza14 = new Pizzaer("pesto","tomat, ost, parmaskinke, rucolasalat og pesto", 70);
        Pizzaer pizza15 = new Pizzaer("coctail"," tomat, ost, skinke og cocktailpølser", 100);       
        Pizzaer pizza16 = new Pizzaer("kødboller"," tomat, ost, skinke, kødsauce, shawarma, kødboller, rejer og ananas", 70);       
        Pizzaer pizza17 = new Pizzaer("oschampo"," tomat, ost, champignon, løg, ananas, asparges og paprika", 75);
        Pizzaer pizza18 = new Pizzaer("baconeg"," tomat, ost, skinke, bacon og æg", 100);
        Pizzaer pizza19 = new Pizzaer("fetatomat"," tomat, ost, kebab, løg, fetaost og tomatskiver", 100);
        Pizzaer pizza20 = new Pizzaer("kyllingen"," tomat, ost, kylling, friske tomater, paprika, løg og bacon", 100);        
        Pizzaer pizza21 = new Pizzaer("swapino"," tomat, ost, shawarma og champignon", 70);
        Pizzaer pizza22 = new Pizzaer("hvidløg"," tomat, ost, kebab, pepperoni, grøn peber, chili og hvidløg", 75);
        Pizzaer pizza23 = new Pizzaer("peber","tomat, ost, hakket oksekød, grøn peber, shawarma, chili og hvidløg", 68);
        Pizzaer pizza24 = new Pizzaer("Champinjo","tomat, ost, hakket oksekød, grøn peber og gorgonzola", 70);
        Pizzaer pizza25 = new Pizzaer("løgskinke"," tomat, ost, skinke, bacon og løg", 100);       
        Pizzaer pizza26 = new Pizzaer("køsaucen"," tomat, ost, skinke, kødsauce og champignon", 70);       
        Pizzaer pizza27 = new Pizzaer("bernei"," tomat, ost, skinke, hakket oksekød og bearnaisesauce", 75);
        Pizzaer pizza28 = new Pizzaer("shawagorgo"," tomat, ost, shawarma, gorgonzola, hvidløg og chili", 100);
        Pizzaer pizza29 = new Pizzaer("pestokylling"," tomat, ost, rucola salat, kylling og pesto", 100);
        Pizzaer pizza30 = new Pizzaer("løg"," tomat, ost, kebab, bacon, hvidløg, pepperoni og løg", 100);
        //making an odrer
        Bestillingsliste best= new Bestillingsliste();
        Odrer odrer= new Odrer("odrer1");
        Odrer odrer2= new Odrer("odrer2");
        odrer.addPizza(pizza1);
        odrer.addPizza(pizza2);
        odrer.addPizza(pizza3);
        
        odrer2.addPizza(pizza1);
        odrer2.addPizza(pizza2);
        odrer2.addPizza(pizza3);
        best.addOdrer(odrer);
        best.addOdrer(odrer2);

        System.out.println(odrer.samletAfgift());
        System.out.println(odrer2.samletAfgift());
        System.out.println(best.samletAfgiftforalt());
        System.out.println(best.toString());
    }
    
}
