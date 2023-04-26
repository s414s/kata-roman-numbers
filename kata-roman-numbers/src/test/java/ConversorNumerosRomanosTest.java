import org.junit.jupiter.api.Test;
import org.sanvalero.ConversorNumerosRomanos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class ConversorNumerosRomanosTest {

    //Para correr los tests, ejecuta 'mvn test' en la linea de commando
    @Test
    public void testConvertToRoman() {
        assertEquals("I", new ConversorNumerosRomanos().convertirARomano(1));
        assertEquals("X", new ConversorNumerosRomanos().convertirARomano(10));
        assertEquals("VII", new ConversorNumerosRomanos().convertirARomano(7));
        assertEquals("MCMXLIX", new ConversorNumerosRomanos().convertirARomano(1949));
        assertEquals("MMXVIII", new ConversorNumerosRomanos().convertirARomano(2018));
    }

}
