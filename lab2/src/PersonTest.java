import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.Test;

class PersonTest {
    @Test
    void testEqualsAndHashcode() {
        EqualsVerifier.simple().forClass(Person.class).verify();
    }
}