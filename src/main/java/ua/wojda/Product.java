package ua.wojda;

/**
 * Created by wojda on 29.02.2016.
 */
public class Product {
    public String name;
    public String type;
    public int proteins;
    public int fats;
    public int carbohydrates;
    public int calories;
    public int time;
    public int glycemicIndex;
    public int cellulose;

    private Product(String name, String type, int proteins, int fats, int carbohydrates, int calories, int time, int glycemicIndex, int cellulose) {
        this.name = name;
        this.type = type;
        this.proteins = proteins;
        this.fats = fats;
        this.carbohydrates = carbohydrates;
        this.calories = calories;
        this.time = time;
        this.glycemicIndex = glycemicIndex;
        this.cellulose = cellulose;
    }

    public static Product newProduct(String name, String type, int proteins, int fats, int carbohydrates, int calories, int time, int glycemicIndex, int cellulose) {
        return new Product(name, type, proteins, fats, carbohydrates, calories, time, glycemicIndex, cellulose);
    }
}
