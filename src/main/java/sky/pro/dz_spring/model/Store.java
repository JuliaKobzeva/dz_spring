package sky.pro.dz_spring.model;

public class Store {
    private final int id;
    private final String item;
    private static int counter;

    public Store(String item) {
        this.item = item;
        this.id = counter++;
    }

    public int getId() {
        return id;
    }

    public String getItem() {
        return item;
    }

    @Override
    public String toString() {
        return "Store{" +
                "id=" + id +
                ", item='" + item + '\'' +
                '}';
    }
}
