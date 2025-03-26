/* Crie uma classe chamada Heranca01.Animal que tenha um atributo nome e um método fazerSom(), que
*imprime "Som genérico de animal". Depois, crie uma classe Heranca01.Cachorro que herda de Heranca01.Animal e
*sobrescreve o método fazerSom() para imprimir "O cachorro late&quot" No método main(), crie um
*objeto do tipo Heranca01.Cachorro e chame o método fazerSom().
*/
public class Animal {
    private String nome;

    public Animal(){}

    public Animal(String nome) {
        this.nome = nome;
    }

    //get e sets
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public void fazerSom(){
        System.out.println("Som genérico do animal");
    }

}
