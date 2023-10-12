import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {
     Gallery gallery;
     Artwork dame;
     Artwork curry;
     Artwork lebron;
     Artist artist;
     ArrayList<Artwork> stock;

     @BeforeEach
     public void setUp(){
         artist = new Artist("Michelangelo");

         dame = new Artwork("dame", artist, 100);
         curry = new Artwork("curry", artist, 1000);
         lebron = new Artwork("lebron", artist, 5000);

         stock = new ArrayList<>(Arrays.asList(lebron, curry, dame));

         gallery = new Gallery("Louvre", 10000, stock);
     }

     @Test
     public void canGetName(){
        assertThat(gallery.getName()).isEqualTo("Louvre");
     }

     @Test
     public void canSetName(){
         gallery.setName("Anfield");
         assertThat(gallery.getName()).isEqualTo("Anfield");
     }

    @Test
    public void canGetTill(){
        assertThat(gallery.getTill()).isEqualTo(10000);
    }

    @Test
    public void canSetTill(){
        gallery.setTill(5000);
        assertThat(gallery.getTill()).isEqualTo(5000);
    }

    @Test
    public void canGetStock(){
        assertThat(gallery.getStock()).isEqualTo(stock);
    }

    @Test
    public void canSetStock(){
        artist = new Artist("Michelangelo");

        Artwork szobo = new Artwork("Szobo", artist, 100);
        Artwork endo = new Artwork("Endo", artist, 1000);
        Artwork salah = new Artwork("Salah", artist, 5000);

        ArrayList<Artwork> stock2 = new ArrayList<>(Arrays.asList(szobo, endo, salah));

        gallery.setStock(stock2);
        assertThat(gallery.getStock()).isEqualTo(stock2);
    }

    @Test
    public void canSellStock(){
         gallery.sellStock(dame);
         assertThat(gallery.getStock().size()).isEqualTo(2);
    }

    @Test
    public void addTill(){
         gallery.addTill(100);
         assertThat(gallery.getTill()).isEqualTo(10100);
    }

 }
