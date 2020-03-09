package br.fai.projeto06;

public class Main {

	public static void main(String[] args) {
		
		Main app = new Main();
		app.start();

	}

	private void start() {
		String[] carros = {"civic","gol","palio","uno"};
							//0     1       2      3
		//System.out.println("Posição 1: " + carros[1]);
		
		for(String carro : carros) {
			
			System.out.println("Carro: " + carro);
		}
		
		System.out.println("--------");
		

		
		carros[1] = "L200";
		for(String carro : carros) {
			
			System.out.println("Carro: " + carro);
		}
		
		int tamanhoDoNovoArray = carros.length + 1;
		
		String[] novoArrayDeCarros =
				new String[tamanhoDoNovoArray];
		
		for(int i = 0; i < carros.length; i++) {
			String carro = carros[i];
			novoArrayDeCarros[i] = carro;
			
		}
		novoArrayDeCarros [tamanhoDoNovoArray - 1] = "gol";
		for(String carro : novoArrayDeCarros) {
			
			System.out.println("Carro: " + carro);
			}
		
		}
		
		 
	}

