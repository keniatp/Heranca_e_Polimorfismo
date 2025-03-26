public class Desenvolvedor extends Funcionario{
    private Double aumento = 0.10;

    public Double getAumento() { return aumento; }
    public void setAumento(Double aumento) { this.aumento = aumento; }

    public Desenvolvedor(Double aumento) {
        this.aumento = aumento;
    }

    public Desenvolvedor(String nome, Double salarioBase) {
        super(nome, salarioBase);
    }

    public double calcularSalario() {
        return getSalarioBase() + (getSalarioBase()*aumento);
    }

    @Override
    public void mostrar() {
        System.out.println("----- DESENVOLVEDOR -----");
        super.mostrar();
        System.out.println("Salario com aumento: " + calcularSalario());
    }
}
