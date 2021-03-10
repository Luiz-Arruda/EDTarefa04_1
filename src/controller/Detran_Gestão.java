package controller;

import javax.swing.JOptionPane;

public class Detran_Gestão {
	
	private int tamanho;
	private Detran_Cliente[] dados;
//	private Detran_Cliente[] removido;
	private Detran_Cliente[] remove;
	
	
	public Detran_Gestão() {
		tamanho = 0;
		dados = new Detran_Cliente[5];
//		removido = new Detran_Cliente[5];
		remove = new Detran_Cliente[5];
		
	}
	
	
	public boolean Fila_Cheia () {				// ok validar fila cheia
		if( tamanho == dados.length){
			return true;
		}
		return false;
	}
	
	public boolean Pilha_Cheia() {				// ok validar pilha cheia
		if( tamanho == remove.length){
			return true;
		}
		return false;
	}
	
	
	// opção 2
	public void AdicionaCadastroFila(int id, String nome, int rg, int telefone, String dataNascimento) {
		Detran_Cliente cliente = new Detran_Cliente(id,nome,rg,telefone,dataNascimento);	
		if (tamanho < dados.length) {
			dados[tamanho] = cliente;
			tamanho++;
			System.out.println("ok");
		} 
		else {
			JOptionPane.showMessageDialog(null, " Erro, a lista cheia");
		}
	} // adicionar cadastro fila
	
	
	public void ExibirFila() {    // opção 3
	System.out.println(System.lineSeparator().repeat(50));
		if ( tamanho != 0) {
			for (int i = 0; i < tamanho; i ++) {
				System.out.println("ID: "+ dados[i].getID() +" Nome: "+ dados[i].getNome() +" RG" + dados[i].getTelefone()+" Data Nascimento" + dados[i].getdataNascimento());
			}
		} else {
			JOptionPane.showMessageDialog(null,"A Fila está vazia");
		}
	} // exibir Cadastro fila
	
	
	public void RemoveFila() {		// opção 4
		int Id = dados[0].getID();
		String name = dados[0].getNome();
		int rgs = dados[0].getRG();
		int telefones = dados[0].getTelefone();
		String dtNascimento = dados[0].getdataNascimento();
		if (dados.length >= 1 && tamanho > 0) {
			JOptionPane.showMessageDialog(null,"Livro removido do final : " + dados[0].getNome());
			for(int i = 1; i < tamanho; i++) {
				dados[i - 1] = dados[i];
			}
			tamanho --;
		} else {
			JOptionPane.showMessageDialog(null,"A Fila está vazia");
		}
		
		AdicionaPilha(Id, name, rgs, telefones, dtNascimento);
	} // remover cadastro fila
	
	public void AdicionaPilha(int id, String nome, int rg, int telefone, String dataNascimento) {
		Detran_Cliente cliente = new Detran_Cliente(id,nome,rg,telefone,dataNascimento);	
		if (tamanho < remove.length) {
			remove[tamanho] = cliente;
			tamanho++;
			System.out.println(" Pilha ok");
		} else {
			JOptionPane.showMessageDialog(null, " Erro, a pilha cheia");
		}
		if ( tamanho != 0) {
			for (int i = 0; i < tamanho; i ++) {
				System.out.println("ID: "+ remove[i].getID() +" Nome: "+ remove[i].getNome() +" RG: " + remove[i].getRG() + " Telefone: " + remove[i].getTelefone() +" Dt: " + remove[i].getdataNascimento() );
			}}
	} // adicionar cadastro pila
	

	
	public void ExibirPilha() {
		System.out.println(System.lineSeparator().repeat(50));
			if ( tamanho != 0) {
				for (int i = 0; i < tamanho; i ++) {
					System.out.println("ID: "+ remove[i].getID() +" Nome: "+ remove[i].getNome() +" RG: " + remove[i].getRG() + " Telefone: " + remove[i].getTelefone() +" Dt: " + remove[i].getdataNascimento() );
				}
			} else {
				JOptionPane.showMessageDialog(null,"A Fila está vazia");
			}
		} // exibir Cadastro fila
	

} // classe
