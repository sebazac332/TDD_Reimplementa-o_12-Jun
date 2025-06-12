package app;
public class IRPF {

    private float salario;
    private float contribuicaoPrevidenciaria;
    
    public void cadastrarSalario(float salario){
        this.salario += salario;
    }

    public float getTotalSalario(){
        return this.salario;
    }

    public void CadastrarPrevidenciaOficial(float contribuicaoPrevidenciaria){
        this.contribuicaoPrevidenciaria = contribuicaoPrevidenciaria;
    }

    public float getPrevidenciaOficial(){
        return this.contribuicaoPrevidenciaria;
    }
}
