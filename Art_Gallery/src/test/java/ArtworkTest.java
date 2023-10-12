import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtworkTest {
    Artwork artwork;
    Artist artist;

    @BeforeEach
    public void setUp(){
        artist = new Artist("Picasso");
        artwork = new Artwork("Cat", artist, 100);
    }

    @Test
    public void canGetTitle(){
        assertThat(artwork.getTitle()).isEqualTo("Cat");
    }

    @Test
    public void canSetTitle(){
        artwork.setTitle("Dog");
        String title = artwork.getTitle();
        assertThat(title).isEqualTo("Dog");
    }

    @Test
    public void canGetArtist(){
        Artist actual = artwork.getArtist();
        assertThat(actual).isEqualTo(artist);
    }

    @Test
    public void canSetArtist(){
        Artist michelangelo = new Artist("Michelangelo");
        artwork.setArtist(michelangelo);
        Artist actual = artwork.getArtist();
        assertThat(actual).isEqualTo(michelangelo);
    }

    @Test
    public void canGetPrice(){
        assertThat(artwork.getPrice()).isEqualTo(100);
    }

    @Test
    public void canSetPrice(){
        artwork.setPrice(1);
        int price = artwork.getPrice();
        assertThat(price).isEqualTo(1);
    }

}
