public class Main {
    public static void main(String[] args) {
        Pagamento pagamento[] = {new PagamentoCartao(), new PagamentoDinheiro()};
        
        for (Pagamento pagamento2 : pagamento) {
            pagamento2.realizarPagamento();
        }

    }
}
