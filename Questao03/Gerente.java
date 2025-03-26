public class Gerente extends Funcionario{
    public double bonus = 0.05;

    public Gerente(double bonus) {
        this.bonus = bonus;
    }

    public Gerente(String nome, Double salarioBase) {
        super(nome, salarioBase);
    }

    public double getBonus() { return bonus; }
    public void setBonus(double bonus) { this.bonus = bonus; }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + (getSalarioBase()*bonus);
    }

    @Override
    public void mostrar() {
        System.out.println("----- GERENTE -----");
        super.mostrar();
        System.out.println("Salario com bonus: " + calcularSalario());
    }
}
