package heranca.extend;

public class Funcionario extends Pessoa{
    private double salario;
        
    public Funcionario(double salario){
        this.salario = salario;
    }
    
    public void exibir(){
        System.out.println("funcionario--------------------");
        super.exibir();
        System.out.println("salario: " + getSalario());
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }


    public double getSalario() {
        return salario;
    }
}
