import java.math.BigDecimal;


public class OrderItem {
    private Integer quantity;
    private BigDecimal price;

    private Product product;

    public OrderItem(Integer quantity, BigDecimal price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    public BigDecimal subTotal(){
         BigDecimal total = price.multiply(BigDecimal.valueOf(quantity));
         return total;
    }

    @Override
    public String toString() {
        return product.getNome()+", R$"+
                getPrice()+
                ",  Quantity: "+getQuantity()+", SubTotal: R$"+subTotal();




    }
}
