package FACD;

public class Main {
	
	public static void main (String args[])
	{
		Pedido pedido = new Pedido();
		Combo combo = new Combo();
		
		if(pedido.EscolhaPedido() == 1)
		{
			combo.ComboUm();
		}
		else
		{
			combo.ComboDois();
		}
		
		combo.MostraCombo();
	}

}
