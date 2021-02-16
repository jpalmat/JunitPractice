package mockito.second;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Properties;

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

    @Test
    public void testMockitoThrows(){
        Properties properties = Mockito.mock(Properties.class);
        when(properties.get(Mockito.anyString())).thenThrow(new IllegalArgumentException("test"));
        assertThrows(IllegalArgumentException.class, ()-> properties.get("A"));
        Throwable throwable = assertThrows(IllegalArgumentException.class, ()-> properties.get(""));
        assertEquals("test", throwable.getMessage());
    }
}