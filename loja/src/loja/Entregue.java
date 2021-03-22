package loja;

public class Entregue extends Situacao {

	@Override
	public void abrirChamado(Pedido pedido) {
		System.out.println("chamado para pós venda");
	}
	
	

}
