import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        String data = sc.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate nascimento = LocalDate.parse(data, formatter);
        Client client = new Client(name, email, nascimento);
        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        String orderStatus = sc.next();
        OrderStatus orderStatus1 = OrderStatus.valueOf(orderStatus);
        Order order = new Order(LocalDateTime.now(), orderStatus1, client);
        System.out.print("How many items to this order? ");
        int qnt = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < qnt; i++) {
            System.out.println("Enter #" + (i + 1) + " item data:");
            System.out.print("Product name: ");
            String nameP = sc.nextLine();
            System.out.print("Product price: ");
            double precu = sc.nextDouble();
            sc.nextLine();
            BigDecimal preci = BigDecimal.valueOf(precu);
            Product product = new Product(nameP, preci);
            System.out.print("Quantity: ");
            int qntity = sc.nextInt();
            OrderItem orderItem = new OrderItem(qntity, product.getPreco(), product);

            order.addItem(orderItem);


        }
        System.out.println();
        System.out.println("ORDER SUMMARY:");
        System.out.println(order);

    }
}
