public class Funcionario {
    private String nome;
    private Double salarioBase;

    public Funcionario(){}
    public Funcionario(String nome, Double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }
    //get
    public String getNome() { return nome; }
    public Double getSalarioBase() { return salarioBase; }
    //set
    public void setNome(String nome) { this.nome = nome; }
    public void setSalarioBase(Double salarioBase) { this.salarioBase = salarioBase; }

    public double calcularSalario(){
        return getSalarioBase();
    }

    public void mostrar(){
        System.out.println("Nome: " + getNome());
        System.out.println("Salario base: " + getSalarioBase());
    }

}
