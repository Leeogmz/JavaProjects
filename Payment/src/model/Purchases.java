package model;
public class Purchases implements Comparable<Purchases> {

    private String product;
    private Double value;


    public Purchases (String product, Double value) {
        this.product = product;
        this.value = value;        
    }  




    public String getProduct() {
        return product;
    }

    public Double getValue() {
        return value;
    }

    @Override
    public String toString() {
        
        return "Descrição da compra: " + product + "; Valor da compra: " + value;
    }




    @Override
    public int compareTo(Purchases otherPurchase) {

        return Double.valueOf(this.value).compareTo(Double.valueOf(otherPurchase.value));

        
    }


    
}
