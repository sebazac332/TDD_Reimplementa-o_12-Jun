package tst;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import app.IRPF;

public class CadastroDepententesTest {

    private IRPF irpf; 

    @Before
    public void setup(){
        irpf = new IRPF();
    }

    @Test
    public void testCadastrarUmDependente(){
        irpf.CadastrarDependente("Joao");
        assertEquals(189.99f, irpf.getDeducaoDependentes(), 0);
    }
    
}
