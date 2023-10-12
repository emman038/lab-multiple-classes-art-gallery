import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtistTest {
    Artist artist;

    @BeforeEach
    public void setUp() {
        artist = new Artist("Picasso");
    }

    @Test
    public void canGetName() {
        assertThat(artist.getName()).isEqualTo("Picasso");
    }

    @Test
    public void canSetName(){
        artist.setName("Michelangelo");
        String actual = artist.getName();
        String expected = "Michelangelo";
        assertThat(actual).isEqualTo(expected);
    }
}
