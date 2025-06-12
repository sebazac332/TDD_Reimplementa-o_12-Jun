import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CadastroRendimentosTest { 

    private IRPF irpf; 

    @Before
    public void setup(){
        irpf = new IRPF();
    }

    @Test
    public void testCadastrarSalario(){
        irpf.CadastrarSalario(5000f);
        assertEquals(5000f, irpf.getTotalSalario(), 0);
        //fail("not implemented yet");
    }
}