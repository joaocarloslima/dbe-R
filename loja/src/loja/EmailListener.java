package loja;

public class EmailListener implements PedidoListeners{

	@Override
	public void update(Pedido pedido) {
		System.out.println("Enviando e-mail..");
	}
	
}
