package Locadora;
import java.util.Scanner;

public class Main {
	private static Scanner myc = new Scanner(System.in);
	private static Scanner myc2 = new Scanner(System.in);
	private static Scanner myc3 = new Scanner(System.in);
	
	public static String controller(String c) {
		String resposta = "comando inválido";
		if(c.equalsIgnoreCase("1")) {
			
			System.out.println("Digite o usuername:");
			String user = myc2.next();
			System.out.println("Digite a senha:");
			String password = myc2.next();
			resposta = Gerente();
			return resposta;
		}else if(c.equalsIgnoreCase("2")) {
			System.out.println("Digite o usuername:");
			String user = myc2.next();
			System.out.println("Digite a senha:");
			String password = myc2.next();
			resposta = Operador();
		}else if(c.equalsIgnoreCase("3")) {
			resposta = "Você escolheu a opção 3";
			return resposta;
		}
		return resposta;
	}
	
	public static String Gerente() {
		String resposta = "Logado como gerente";
		System.out.println(resposta);
		String command = "";
		while(!command.equalsIgnoreCase("10")) {
			
			System.out.println("Digite a opcao:");
			command = myc3.next();
			if(command.equalsIgnoreCase("1")) {
				resposta = "1 - Cadastrar produto";
				
			}else if(command.equalsIgnoreCase("2")) {
				resposta = "2 - Cadastrar Cliente";
				
			}else if(command.equalsIgnoreCase("3")) {
				resposta = "3 - Cadastrar Operador";
				
			}
			else if(command.equalsIgnoreCase("4")) {
				resposta = "4 - Listar produtos";
				
			}
			else if(command.equalsIgnoreCase("5")) {
				resposta = "5 - Listar clientes";
				
			}
			else if(command.equalsIgnoreCase("6")) {
				resposta = "6 - Listar operadores";
				
			}
			else if(command.equalsIgnoreCase("7")) {
				resposta = "7 - Procurar produto";
				
			}
			else if(command.equalsIgnoreCase("8")) {
				resposta = "8 - Procurar cliente";
				
			}
			else if(command.equalsIgnoreCase("9")) {
				resposta = "9 - Procurar operador";
				
			}else if(command.equalsIgnoreCase("10")) {
				resposta = "10 - sair";
				return resposta;
			}
			System.out.println(resposta);
		}
		
		System.out.println("Digite a opcao:");
		return resposta;
	}
	
	public static String Operador() {
		String resposta = "Logado como operador";
		System.out.println(resposta);
		String command = "";
		while(!command.equalsIgnoreCase("6")) {
			
			System.out.println("Digite a opcao:");
			command = myc3.next();
			if(command.equalsIgnoreCase("1")) {
				resposta = "1 - Fazer locação";
				
			}else if(command.equalsIgnoreCase("2")) {
				resposta = "2 - Dar baixa em locação";
				
			}else if(command.equalsIgnoreCase("3")) {
				resposta = "3 - Excluir locação";
				
			}
			else if(command.equalsIgnoreCase("4")) {
				resposta = "4 - Procurar produto";
				
			}
			else if(command.equalsIgnoreCase("5")) {
				resposta = "5 - Procurar cliente";
				
			}
			else if(command.equalsIgnoreCase("6")) {
				resposta = "6 - Sair";
				return resposta;
			}
		}
		
		System.out.println("Digite a opcao:");
		return resposta;
	}
	

	public static void main(String[] args) {
		String command = "";
		
		while(!command.equalsIgnoreCase("3")) {
			
		    
			System.out.println("Bem-vindo, escolha o perfil abaixo: \n"
					+ "1.Gerente \n"
					+ "2.Operador de Sistema \n"
					+ "3.Sair \n"
					);
			System.out.println("Digite a opcao:");
			 command= myc.next();
			 System.out.println(controller(command));
	 }

	}

}
