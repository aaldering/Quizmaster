import org.junit.Test;
import static org.junit.Assert.*;


public class PlayerTest {

    @Test
    public void shouldHaveName(){
        Player player = new Player();
        player.setName("Bryan");
        assertNotNull(player.getName());
        assertEquals("Bryan", player.getName());
    }
}
