import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    private LocalDateTime moments;
    private OrderStatus orderStatus;
    private Client client;
    private List<OrderItem> items = new ArrayList<>();

    public Order(LocalDateTime moments, OrderStatus orderStatus, Client client) {
        this.moments = moments;
        this.orderStatus = orderStatus;
        this.client = client;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    public BigDecimal total() {
        return items.stream().map(OrderItem::subTotal).reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public String getMoments() {
        return moments.format(dateTimeFormatter);
    }

    public void setMoments(LocalDateTime moments) {
        this.moments = moments;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ");
        sb.append(getMoments() + "\n");
        sb.append("Order status: ");
        sb.append(getOrderStatus() + "\n");
        sb.append("Client: ");
        sb.append(client + "\n");
        sb.append("Order items:\n");
        for (OrderItem item : items) {
            sb.append(item + "\n");
        }
        sb.append("Total price: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }
}