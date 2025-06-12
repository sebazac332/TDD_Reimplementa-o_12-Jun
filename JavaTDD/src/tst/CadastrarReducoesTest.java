package tst;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import app.IRPF;

public class CadastrarReducoesTest {

    private IRPF irpf; 

    @Before
    public void setup(){
        irpf = new IRPF();
    }

    @Test
    public void testCadastrarPrevidenciaOficial(){
        irpf.CadastrarPrevidenciaOficial(700f);
        assertEquals(700f, irpf.getPrevidenciaOficial(), 0);
    }
    
}
