package questão6;
//FALTA ARMAZENAR NOS ARRAYS
import java.util.Scanner;
public class Perguntas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  // Reading from System.in
		int pergunta, acerto=0, erro=0;
		String nome;
		int[] arrayRepostas = {4,3,1};
		String[] arrayPerguntas =  {"Qual o maior planeta do sistema solar?",
									"Quem foi a primeira pessoa a observar os anéis de Saturno?",
									"Qual a distancia da terra a lua?"};
		String[] arrayOpcoes = {" 1)Plutão \n 2)Terra \n 3)Marte \n 4)Júpter ",
								" 1)Plutão \n 2)Aristóteles \n 3)Galileu Galilei \n 4)Pitágoras ",
								" 1)384.400 km \n 2)100.000 km \n 3)390.000 km \n 4)467.000 km  "};
		
		//Cabeçalho
		System.out.println("Quiz: Sistema solar");
		
		//Entrada
		System.out.print("Digite seu nome para começar: ");
		nome = sc.nextLine(); // Scans the next token of the input as an int.
		System.out.println("\n");
		
		//Um for que percorre cada posição de cada array, 
		//fazendo sua respectiva pergunta e comparando com a resposta do array
		for(int counter = 0; counter < 3; counter ++) {
			System.out.println(arrayPerguntas[counter]);
			System.out.println(arrayOpcoes[counter]);
			System.out.print("Digite o número da sua resposta: ");
			pergunta = sc.nextInt();
			//Diz se você errou e adiciona 1 a variavel contadora
			if(pergunta ==arrayRepostas[counter]) {
				System.out.println("Você acertou :)\n");
				acerto++;
			}else {
				System.out.println("Você errou :(\n");
				erro++;
			}
		}
		System.out.println(nome+" \nVocê teve "+acerto+" acerto(s) e "+erro+" erro(s)");
		sc.close();
	}
}
