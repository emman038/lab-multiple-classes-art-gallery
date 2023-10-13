import org.junit
        .jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomerTest {
    Customer customer;
    Gallery gallery;
    Artwork dame;
    Artwork curry;
    Artwork lebron;
    Artist artist;
    ArrayList<Artwork> stock;

    @BeforeEach
    public void setUp() {
        artist = new Artist("Michelangelo");

        dame = new Artwork("dame", artist, 100);
        curry = new Artwork("curry", artist, 1000);
        lebron = new Artwork("lebron", artist, 5000);

        stock = new ArrayList<>(Arrays.asList(lebron, curry, dame));

        gallery = new Gallery("Louvre", 10000, stock);

        customer = new Customer("John", 100000);
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
        assertThat(customer.getWallet()).isEqualTo(100000);
    }

    @Test
    public void canSetWallet() {
        customer.setWallet(100);
        assertThat(customer.getWallet()).isEqualTo(100);
    }

    @Test
    public void canGetArtCollection(){
        ArrayList<Artwork> artwork = new ArrayList<>(Arrays.asList(dame));
        customer.setArtCollection(artwork);
        assertThat(customer.getArtCollection()).isEqualTo(artwork);
    }

    @Test
    public void canModifyArtCollection(){
        customer.modifyArtCollection(dame);
        ArrayList<Artwork> expected = new ArrayList<>(Arrays.asList(dame));
        assertThat(customer.getArtCollection()).isEqualTo(expected);
    }

    @Test
    public void canWithdraw(){
        customer.withdraw(10000);
        assertThat(customer.getWallet()).isEqualTo(90000);
    }

    @Test
    public void canBuyArtwork(){
//        Remove artwork by name
//        stock reduces by 1
//        money in wallet reduces
//        money in till increases

        customer.buyArtwork("dame", gallery);

        int expected = 100000 - dame.getPrice();
        assertThat(customer.getWallet()).isEqualTo(expected);
    }
}
