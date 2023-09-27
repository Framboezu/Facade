package FACD;

import javax.swing.JOptionPane;

public class Pedido {
	
	int opt;
	
	public int EscolhaPedido()
	{
		opt = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha seu pedido:\n1-Combo X-Tudo\n2-Combo X-CalaBacon"));
		
		return opt;
	}

}
