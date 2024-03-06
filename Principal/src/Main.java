public class Main extends Fonecedor {
    public static void main(String[] args) {
        Fonecedor fornecedor = new Fonecedor();
        Fonecedor cpf = new Fonecedor();



        Pagamento pagamento1 = new Pagamento("Empresa A", 4893);
        Pagamento pagamento2 = new Pagamento("Empresa A", 15623);
        Pagamento pagamento3 = new Pagamento("Empresa A", 15623);
        Pagamento pagamento4 = new Pagamento("Empresa A", 15623);

        System.out.println("Fornecedor: " + fornecedor.nome);
        System.out.println("CPF: " + cpf.cpf);
        System.out.println("Pagamento 1: " + pagamento1.valor);
        System.out.println("Pagamento 2: " + pagamento2.valor);
        System.out.println("Pagamento 3: " + pagamento3.valor);
        System.out.println("Pagamento 4: " + pagamento4.valor);

    }
}