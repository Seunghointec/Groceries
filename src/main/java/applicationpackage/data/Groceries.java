package applicationpackage.data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Entity
public class Groceries implements CostRelated{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int itemsID;
    @NotEmpty
    @NotBlank(message = "item can't be left blank!")
    @Column(length = 1000)
    private String name;
    private int amount;
    private double price;

    public Groceries() {
    }

    public Groceries(int itemsID, String name, int amount, double price) {
        this.itemsID = itemsID;
        this.name = name;
        this.amount = amount;
        this.price = price;
        computeCost();
    }

    public int getItemsID() {
        return itemsID;
    }

    public void setItemsID(int itemsID) {
        this.itemsID = itemsID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {this.amount = amount;}

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
        computeCost();
    }

    @Override
    public void computeCost() {
        double totalCost = this.amount * this.price;
    }
}
