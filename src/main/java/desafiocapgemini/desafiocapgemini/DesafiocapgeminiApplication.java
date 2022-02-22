package desafiocapgemini.desafiocapgemini;

import java.util.Arrays;
import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesafiocapgeminiApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(DesafiocapgeminiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o tamanho da escada: ");
		executaQuestao1(Integer.parseInt(input.nextLine()));
		System.out.println("\nDigite a senha a ser verificada: ");
		executaQuestao2(input.nextLine());
		System.out.println("\nDigite a palavra a ser verificada: ");
		executaQuestao3(input.nextLine());
		input.close();
	}

	public static void executaQuestao1(int qtd){
		CriadorDeEscadas criadorDeEscadas = new CriadorDeEscadas(qtd);

		String[] escada = criadorDeEscadas.formaEscada();
		Arrays.stream(escada).forEach(System.out::println);
	}

	public static void executaQuestao2(String senha){
		VerificadorDeSenha verificadorDeSenha = new VerificadorDeSenha(senha);

		System.out.println(verificadorDeSenha.resultado());
	}

	public static void executaQuestao3(String anagrama){
		VerificaAnagrama verificaAnagrama = new VerificaAnagrama(10);
		System.out.println(verificaAnagrama.analisa(anagrama));
	}
}
