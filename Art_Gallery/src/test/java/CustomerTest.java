import org.junit
        .jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomerTest {
    Customer customer;

    @BeforeEach
    public void setUp() {
        customer = new Customer("John", 1000);
    }

    @Test
    public void canGetName() {
        assertThat(customer.getName()).isEqualTo("John");
    }

    @Test
    public void canSetName() {
        customer.setName("Michael");
        assertThat(customer.getName()).isEqualTo("Michael");
    }

    @Test
    public void canGetWallet() {
        assertThat(customer.getWallet()).isEqualTo(1000);
    }

    @Test
    public void canSetWallet() {
        customer.setWallet(100);
        assertThat(customer.getWallet()).isEqualTo(100);
    }

}
