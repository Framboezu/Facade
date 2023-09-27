package FACD;

import javax.swing.JOptionPane;

public class Combo {
	
	private Burguer burguer = new Burguer();
	private Bebida bebida = new Bebida();
	private Sobremesa sobremesa = new Sobremesa();
	
	public void ComboUm()
	{
		burguer.setDec("X-Tudo");
		burguer.setPreco(20);
		burguer.setGrama(300);
		bebida.setDec("Coca-Cola");
		bebida.setPreco(10);
		bebida.setMl(500);
		sobremesa.setDec("Sorvete");
		sobremesa.setPreco(15);
		sobremesa.setTamanho("Médio");
	}
	
	public void ComboDois()
	{
		burguer.setDec("X-CalaBacon");
		burguer.setPreco(15);
		burguer.setGrama(200);
		bebida.setDec("Pepsi");
		bebida.setPreco(8);
		bebida.setMl(500);
		sobremesa.setDec("Pudim");
		sobremesa.setPreco(13);
		sobremesa.setTamanho("Pequeno");
	}
	
	public void MostraCombo()
	{
		JOptionPane.showMessageDialog(null, "Combo Escolhido:\nBurguer: \n" + "Nome: " + burguer.getDec()
		+ "\nPreço: " +  burguer.getPreco()+ "\nGrama: " + burguer.getGrama() + "\n\nBebida: \nNome: " + bebida.getDec()
		+ "\nPreço: " + bebida.getPreco() + "\nMls: " + bebida.getMl() + "\n\nSobremesa: \nNome: " + sobremesa.getDec()
		+ "\nPreço: " + sobremesa.getPreco() + "\nTamanho: " + sobremesa.getTamanho());
	}

}
