package pizzabarprøveee;

public class Pizzaer {
    String navn;
    String ingredientser;
    double pris;

    public Pizzaer(String navn, String ingredientser, double pris) {
        this.navn = navn;
        this.ingredientser = ingredientser;
        this.pris = pris;
    }

    @Override
    public String toString() {
        return "Pizzaer{" + "navn=" + navn + ", ingredientser=" + ingredientser + ", pris=" + pris + '}';
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getIngredientser() {
        return ingredientser;
    }

    public void setIngredientser(String ingredientser) {
        this.ingredientser = ingredientser;
    }

    public double getPris() {
        return pris;
    }

    public void setPris(double pris) {
        this.pris = pris;
    }

}
