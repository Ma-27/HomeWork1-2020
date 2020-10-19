package Lv3;

class Dishes {
    String dishName;
    int dishPrice;
    int dishNumber;

    public Dishes(String dishName, int dishPrice, int dishNumber) {
        this.dishName = dishName;
        this.dishPrice = dishPrice;
        this.dishNumber = dishNumber;
    }

    public String getDishName() {
        return dishName;
    }

    public int getDishPrice() {
        return dishPrice;
    }

    public int getDishNumber() {
        return dishNumber;
    }
}
