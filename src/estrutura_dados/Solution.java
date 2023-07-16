package estrutura_dados;

import java.time.LocalDate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution {

	LinkedList<String> pilhas = new LinkedList<>();
	static Map<String, List<String>> mapaEspecies = new HashMap<String, List<String>>();

	public static void main(String[] args) {

		mapaEspecies.put("gato", List.of("Siamês", "Angorá", "SRD"));
		mapaEspecies.put("cachorro", List.of("Fila brasileiro", "Dogue alemão", "Dogue alemão"));

//		Scanner myObj = new Scanner(System.in); // Create a Scanner object
//		String nomeLivro = myObj.nextLine(); // Read user input
//		System.out.println(disponibilidade_livro(nomeLivro));
//
//		double a[];
//
//		a = new double[4];
//		// java double array initialization
//		a[0] = 100000d;
//		a[1] = 300000d;
//		a[2] = 400000d;
//		a[3] = 786777d;
//
//		System.out.println(pontuacao_final_boliche(a));

		List<Integer> idadeAlunos = List.of(20, 22, 22, 22, 23, 1, 2, 4, 16, 18, 18, 19);

		// System.out.println(quantidade_alunos_pode_votar(idadeAlunos));

		LinkedList<String> languages = new LinkedList<>();

		// add elements in LinkedList
		languages.add("Java");
		languages.add("Python");
		languages.add("JavaScript");
		languages.add("Kotlin");

		// System.out.println(colocar_na_prateleira(languages));

		ArrayDeque<String> deque = new ArrayDeque<>();
		deque.addFirst("Python");
		deque.addLast("Java");

		// System.out.println(primeira_apresentacao(deque));
		// System.out.println(entregar_pedido(deque));

		System.out.println(acervo_pet_shop("gato"));

		LinkedList<String> agua = new LinkedList<String>();
		agua.add("Filtragem");
		agua.add("Polimento");
		agua.add("Beber");

		System.out.println(etapa_filtragem_agua(agua));
		List<Integer> idadeAlunosArray = new ArrayList(Arrays.asList(idadeAlunos));

		System.out.println(ordenacao_loteria(idadeAlunosArray));

		System.out.println(camisa_jogadores(List.of("Adao", "Gilnei", "Kaique", "Kaique2", "Kaique3", "Kaique4",
				"Kaique5", "Kaique6", "Kaique7", "Kaique8", "Kaique9", "Kaique10")));

		System.out.println(valida_entrega_cidade("Contagem"));

		System.out.println(identificador_para_alunos(List.of("Adao", "Gilnei", "Kaique", "Kaique2", "Kaique3",
				"Kaique4", "Kaique5", "Kaique6", "Kaique7", "Kaique8", "Kaique9", "Kaique10")));

		System.out.println(remove_valores_duplicados(idadeAlunosArray));
		
		System.out.println(candidatas_sub_20(idadeAlunosArray));
	}

	public static double pontuacao_final_boliche(double[] pontuacao) {
		double total = 0;
		for (int i = 0; i < pontuacao.length; i++) {
			total = total + pontuacao[i];
		}
		return total;

	}

	public static boolean disponibilidade_livro(String nomeLivro) {

		List<String> livros = List.of("Viagem ao Fim da Noite", "O Livro do Desassossego", "Pantagruel", "Guerra e Paz",
				"No caminho de Swann", "Grandes Esperanças");
		return livros.stream().anyMatch(a -> a.equals(nomeLivro));

	}

	public static double informar_vencedor(double[] pontuacao) {

		double maior = 0;
		for (int i = 0; i < pontuacao.length; i++) {
			if (pontuacao[i] > maior) {
				maior = pontuacao[i];
			}
		}
		return maior;
	}

	public static Integer quantidade_alunos_pode_votar(List<Integer> idade_alunos) {
		List<Integer> listMaioresIdade = idade_alunos.stream().filter(a -> a >= 16).collect(Collectors.toList());
		return listMaioresIdade.size();
	}

	public static String colocar_na_prateleira(LinkedList<String> pilhaLivros) {
		LinkedList<String> livros_na_prateleira = new LinkedList<String>();
		livros_na_prateleira.add(pilhaLivros.get(0));
		pilhaLivros.remove(0);
		return livros_na_prateleira.get(0);
	}

	public static String primeira_apresentacao(ArrayDeque<String> deque) {
		return deque.getFirst();
	}

	public static String entregar_pedido(ArrayDeque<String> pedidos) {
		String deque = pedidos.getFirst();
		pedidos.removeFirst();
		return deque;
	}

	public static String situacao_escolar(List<Number> notas) {
		double total = 0;
		for (Number nota : notas) {
			total += nota.doubleValue();
		}
		double media = total / notas.size();

		return media >= 6 ? "Aprovado" : "Reprovado";
	}

	public static List<String> acervo_pet_shop(String especie) {
		Map<String, List<String>> mapaEspecies = new HashMap<String, List<String>>();
		mapaEspecies.put("gato", List.of("Siamês", "Angorá", "SRD"));
		mapaEspecies.put("cachorro", List.of("Fila brasileiro", "Dogue alemão", "Dogue alemão"));

		String chave = null;
		for (String valor : mapaEspecies.keySet()) {
			if (especie.equals(valor)) {
				chave = valor;
			}
		}
		return mapaEspecies.get(chave);
	}

	public static Map<LocalDate, List<Double>> transacoes_outubro() {
		Map<LocalDate, List<Double>> transacoes = new HashMap<LocalDate, List<Double>>();
		transacoes.put(LocalDate.of(2022, 10, 01), List.of(10.90, 22.50));
		transacoes.put(LocalDate.of(2022, 10, 02), List.of(14.90, 86.50));
		transacoes.put(LocalDate.of(2022, 10, 03), List.of(67.90, 46.50, 12.24));

		return transacoes;
	}

	public static List<Integer> ordenacao_loteria(List<Integer> valores_sorteados) {
		Collections.sort(valores_sorteados);
		// Collections.sort(valores_sorteados);
		return valores_sorteados;
	}

	public static Hashtable<Integer, String> camisa_jogadores(List<String> jogadores) {
		Hashtable<Integer, String> hashtable = new Hashtable<>();
		int cont = 1;
		for (String jogador : jogadores) {
			hashtable.put(cont++, jogador);
		}
		return hashtable;
	}

	public static String etapa_filtragem_agua(LinkedList<String> materiais_filtragem) {

		return materiais_filtragem.getLast();
	}

	public static boolean valida_entrega_cidade(String cidade) {
		Map<String, List<String>> mapaEspecies = new HashMap<String, List<String>>();
		mapaEspecies.put("São Paulo", List.of("São Paulo", " Osasco,", "Guarulhos"));
		mapaEspecies.put("Rio de Janeiro", List.of("Niterói", "Petrópolis", "São Gonçalo"));
		mapaEspecies.put("Minas Gerais", List.of("Belo Horizonte", "Contagem"));

		for (String valor : mapaEspecies.keySet()) {
			List<String> values = mapaEspecies.get(valor);
			for (String v : values) {
				if (cidade.equals(v)) {
					return true;
				}
			}
		}
		return false;
	}

	public static Hashtable<Integer, String> identificador_para_alunos(List<String> alunos) {
		Hashtable<Integer, String> hashtable = new Hashtable<>();
		int cont = 0;
		for (String aluno : alunos) {
			hashtable.put(cont++, aluno);
		}
		return hashtable;
	}

	public static HashSet<Integer> remove_valores_duplicados(List<Integer> valoresSorteados) {
		HashSet<Integer> listSemRepetidos = new HashSet<Integer>(valoresSorteados);
		return listSemRepetidos;
	}

	public static List<Integer> candidatas_sub_20(List<Integer> idade_candidatas) {

		return idade_candidatas.stream().filter(x -> x > 20).collect(Collectors.toList());
	}

}
