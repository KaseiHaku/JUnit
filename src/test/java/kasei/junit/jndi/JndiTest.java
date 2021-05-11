package kasei.junit.jndi;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import javax.naming.NamingException;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class JndiTest {

    @Test
    void getJndiProp() throws NamingException {
        log.error("aaaaaa");
        new Jndi().getJndiProp("");
        
    }
}
