import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Client {
    private static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("(dd/MM/yyyy)");
    private String nome;
    private String email;
    private LocalDate nascimento;

    private Order order;

    public Client(String nome, String email, LocalDate nascimento) {
        this.nome = nome;
        this.email = email;
        this.nascimento = nascimento;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNascimento() {
        return nascimento.format(dateTimeFormatter);
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    @Override
    public String toString() {
        return "Client: " +
                getNome() + '\'' +
                getNascimento() +
                " - " + getEmail()
                ;
    }
}
