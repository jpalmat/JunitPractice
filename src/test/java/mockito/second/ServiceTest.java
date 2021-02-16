package mockito.second;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ServiceTest {

    @Mock
    Database database;

    @Test
    public void testQuery(){
        assertNotNull(database);
        when(database.isAvailable()).thenReturn(true);
        Service service = new Service(database);
        boolean actual = service.query("* from t");
        assertTrue(actual);
    }

}