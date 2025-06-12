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

    @Test
    public void testCadastrarPrevidenciaOficial2(){
        irpf.CadastrarPrevidenciaOficial(800f);
        assertEquals(800f, irpf.getPrevidenciaOficial(), 0);
    }

    @Test
    public void testCadastrarPrevidenciaOficial3(){
        irpf.CadastrarPrevidenciaOficial(900f);
        assertEquals(900f, irpf.getPrevidenciaOficial(), 0);
    }
    
}
