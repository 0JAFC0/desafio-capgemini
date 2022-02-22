package desafiocapgemini.desafiocapgemini;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import desafiocapgemini.VerificadorDeSenha;

@SpringBootApplication
public class DesafiocapgeminiApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(DesafiocapgeminiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//executaQuestao1(6);
		executaQuestao2("Ya3");
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
}
