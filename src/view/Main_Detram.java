package view;

import javax.swing.JOptionPane;

import controller.Detran_Gestão;

public class Main_Detram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ops = 0;
		int tamanho = 0;
		int id;
		String nome;
		int rg;
		int telefone;
		String dataNascimento;
		
		Detran_Gestão gestão = new Detran_Gestão();
				
		while (ops != 9) {
			 ops = Integer.parseInt(JOptionPane.showInputDialog("Selecione \n1- Status Fila & Pilha \n2-Cadastro \n3- Ver fila \n4- Remover \n5 - Ver Fila \n9-Sair  "));  
			
			 switch(ops) {
			
			case 1:
				if (gestão.Fila_Cheia() == false) {
				System.out.println( "status fila " + gestão.Fila_Cheia());
				}
				if (gestão.Pilha_Cheia() == false) {
				System.out.println( "status Pilha " + gestão.Fila_Cheia());
				}
				break;
		
			case 2:
			
				if (gestão.Fila_Cheia() == false) {
					id = Integer.parseInt(JOptionPane.showInputDialog("Digite a Identidade: "));
					nome = JOptionPane.showInputDialog("Digite o nome: ");
					rg = Integer.parseInt(JOptionPane.showInputDialog("Digite o RG: "));
					telefone = Integer.parseInt(JOptionPane.showInputDialog("Digite o Telefone: "));
					dataNascimento = JOptionPane.showInputDialog("Digite a data de nascimento: ");
					gestão.AdicionaCadastroFila(id, nome, rg, telefone, dataNascimento);			
//					System.out.println( "status fila" + gestão.Fila_Cheia());
				
				}
				else {
					JOptionPane.showMessageDialog(null, "A Fila está Cheia");
				}
				break;
				
			case 3:
				gestão.ExibirFila();
				break;
				
			case 4:
				gestão.RemoveFila();
				break;
	
			case 5:
				gestão.ExibirPilha();
				break;
				
			case 9:
					JOptionPane.showMessageDialog(null,"Saindo");
					break;
				default:
					JOptionPane.showMessageDialog(null,"Opção Inválida");
			}
		
		}	// while
	} // main
} // classe


