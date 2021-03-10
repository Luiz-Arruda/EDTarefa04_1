package controller;

public class Detran_Cliente {

		private int id;
		private String nome;
		private int rg;
		private int telefone;
		private String dataNascimento;
	
		public Detran_Cliente(int id, String nome, int rg, int telefone, String dataNascimento) {
			this.id = id;
			this.nome = nome;
			this.rg = rg;
			this.telefone = telefone;
			this.dataNascimento = dataNascimento;
		}
		
		public Detran_Cliente() {
			// TODO Auto-generated constructor stub
		}

		public int getID() {
			return id;
		}
		public void setID(int id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public int getRG() {
			return rg;
		}
		public void setRG(int rg) {
			this.rg = rg;
		}
		
		public int getTelefone() {
			return telefone;
		}
		public void setTelefone(int telefone) {
			this.telefone = telefone;
		}
		
		public String getdataNascimento() {
			return dataNascimento;
		}
		public void setdataNascimento(String dataNascimento) {
			this.dataNascimento = dataNascimento;
		}
		
} // classe
