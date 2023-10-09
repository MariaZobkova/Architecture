package Models;

/**
 * Модель перевозчика
 */
public class Carrier {

    private long cardNumber;
    private int id;
    private int[] zones;


    public Carrier(int id, long cardNumber) {
        this.id = id;
        this.cardNumber = cardNumber;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public int getId() {
        return id;
    }
}
