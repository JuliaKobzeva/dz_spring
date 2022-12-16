package sky.pro.dz_spring.model;

public class Store {
    private int id;
    private String item;
    private int counter;

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

    public void setItem(String item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Store{" +
                "id=" + id +
                ", item='" + item + '\'' +
                '}';
    }
}
