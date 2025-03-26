public class Main {
    public static void main(String[] args) {
        Veiculo veiculo[] = {new Carro(), new Bicicleta()};

        for (Veiculo veiculo1 : veiculo){
            veiculo1.mover();
        }
    }
}
