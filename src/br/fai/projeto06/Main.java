package br.fai.projeto06;

public class Main {

	public static void main(String[] args) {
		
		Main app = new Main();
		app.start();

	}

	private void start() {
		String[] carros = {"civic","gol","palio","uno"};
							//0     1       2      3
		System.out.println("Posição 1: " + carros[1]);
		
		for(String carro : carros) {
			
			System.out.println("Carro: " + carro);
		}
	}
}
