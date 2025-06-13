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
        assertEquals(189.59f, irpf.getDeducaoDependentes(), 0);
    }

    @Test
    public void testCadastrarDoisDependentes(){
        irpf.CadastrarDependente("Joao");
        irpf.CadastrarDependente("Maria");
        assertEquals(2 * 189.59f, irpf.getDeducaoDependentes(), 0);
    }

    @Test
    public void testCadastrarTresDependentes(){
        irpf.CadastrarDependente("Joao");
        irpf.CadastrarDependente("Maria");
        irpf.CadastrarDependente("Jose");
        assertEquals(3 * 189.59f, irpf.getDeducaoDependentes(), 0);
    }
    
    @Test
    public void testCadastrarCincoDependentes(){
        irpf.CadastrarDependente("Joao");
        irpf.CadastrarDependente("Maria");
        irpf.CadastrarDependente("Jose");
        irpf.CadastrarDependente("Maria Jose");
        irpf.CadastrarDependente("Jose Maria");
        assertEquals(5 * 189.59f, irpf.getDeducaoDependentes(), 0);
    }
}
