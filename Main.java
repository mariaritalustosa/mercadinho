public class Main{
    public static void main(String[] args) {
       Item item1 = new Item(1, "Arroz", 6.34);
       Item item2 = new Item(2, "Feijão", 10.28);
       Item item3 = new Item(3, "Peito de frango", 15.89);

       Carrinho carrinho = new Carrinho();

       carrinho.adicionarItem(item1);
       carrinho.adicionarItem(item3);
       carrinho.adicionarItem(item2);

       carrinho.removerItem(2);

       carrinho.ValorCompraTotal();
    }
}