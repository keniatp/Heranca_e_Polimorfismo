public class Main {
    public static void main(String[] args) {
        System.out.println("----- FUNCIONARIO -----'");
        Funcionario funcionario = new Funcionario("Amanda", 3000.00);
        funcionario.mostrar();

        Gerente gerente = new Gerente("Maria", 2000.00);
        gerente.mostrar();

        Desenvolvedor desenvolvedor = new Desenvolvedor("Carla", 3500.00);
        desenvolvedor.mostrar();
    }
}
