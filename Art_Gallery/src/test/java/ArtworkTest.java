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
        assertThat(artwork.getTitle()).isEqualsTo("Cat");
    }

    @Test
    public void canSetTitle(){
        artwork.setTitle("Dog");
        String title = artwork.getTitle();
        assertThat(title).isEqualTo("Dog");
    }

    @Test
    public void canGetArtist(){
        Artist actual = artist.getName();
        assertThat(actual).isEqualTo("Picasso");
    }

    @Test
    public void canGetPrice(){
        assertThat(artwork.getPrice()).isEqualsTo(100);
    }

    @Test
    public void canSetPrice(){
        artwork.setPrice(1);
        String price = artwork.getPrice();
        assertThat(price).isEqualTo(1);
    }

}
