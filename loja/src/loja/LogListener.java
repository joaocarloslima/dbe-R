package loja;

public class LogListener implements PedidoListeners{

	@Override
	public void update(Pedido pedido) {
		System.out.println("Registrando log");
	}

}
