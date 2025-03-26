public class Cachorro extends Animal{
    public Cachorro() {}
    public Cachorro(String nome) { super(nome); }

    @Override
    public void fazerSom() {
        super.fazerSom();
        System.out.println("O cachorro "+ getNome() + " late");
    }
}
