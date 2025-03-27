# Herança e Polimorfismo
## DESENVOLVIMENTO DE SISTEMAS
## INSTRUTOR: PAULO ROBERTO MARTINS
Atividade desenvolvida para o curso desenvolvimento de sistema do SENAI CTTI, instruida pelo pofessor Paulo Roberto


## Enunciados
### Questao 01
Crie uma classe chamada Animal que tenha um atributo nome e um método fazerSom(), que imprime "Som genérico de animal". Depois, crie uma classe Cachorro que herda de Animal e
sobrescreve o método fazerSom() para imprimir "O cachorro late". No método main(), crie um objeto do tipo Cachorro e chame o método fazerSom().

### Questao 02
Crie uma classe Veiculo com um método mover(), que imprime "O veículo está se movendo" Em seguida, crie duas classes Carro e Bicicleta, ambas herdando de Veiculo. Sobrescreva o método
mover() para que Carro imprima "O carro está se movendo rapidamente" e Bicicleta imprima "A bicicleta está se movendo lentamente". No main(), crie um vetor de Veiculo com um Carro e uma
Bicicleta e percorra o vetor chamando mover() para cada um.

### Questao 03
Crie uma hierarquia de classes para representar funcionários de uma empresa. A classe Funcionario deve ter os atributos nome e salarioBase, além de um método calcularSalario(), que retorna o salarioBase.
Crie duas classes derivadas:
1. Gerente: recebe um bonus adicional ao salário.
2. Desenvolvedor: recebe um aumento de 10% sobre o salarioBase.
No main(), crie um Funcionario, um Gerente e um Desenvolvedor, defina seus salários e exiba os valores calculados pelo método calcularSalario().

### Questao 04
Crie um sistema que represente diferentes formas de pagamento usando herança e polimorfismo.
1. Crie uma classe base chamada Pagamento com um método realizarPagamento() que imprime "Processando pagamento...
2. Crie duas classes derivadas:
o PagamentoCartao que sobrescreve realizarPagamento() para imprimir "Pagamento com cartão aprovado!".
o PagamentoDinheiro que sobrescreve realizarPagamento() para imprimir "Pagamento em dinheiro recebido!".
3. No main(), crie um vetor de Pagamento que contenha objetos de PagamentoCartao e
PagamentoDinheiro e use um laço para chamar realizarPagamento() para cada um.
