package iphone;

import aparelhoTelefonico.AparelhoTelefonico;
import navegadorInternet.NavegadorInternet;
import reprodutorMusical.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

	public void tocar() {
		System.out.println("Tocando");
		
	}

	public void pausar() {
		System.out.println("Pausando");
		
	}

	public void selecionarMusica(String musica) {
		System.out.println("Selecionando música");
		
	}

	public void exibirPagina(String url) {
		System.out.println("Exibindo música");
		
	}

	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba");
		
	}

	public void atualizarPagina() {
		System.out.println("Atualizando página");
		
	}

	public void ligar(String numero) {
		System.out.println("Ligando");
		
	}

	public void atender() {
		System.out.println("Atendendo");
		
	}

	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz");
		
	}

	
	
}
