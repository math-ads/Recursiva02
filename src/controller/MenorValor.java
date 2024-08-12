package controller;

public class MenorValor {

	public MenorValor() {
		super();
	}
	public int menor(int menor, int tamanho, int vet[]) {
		if(tamanho -1 == 0) {
			/*
			 * a condição de parada feita para parar quando todo o vetor tiver sido lido, no caso 
			 * ele está sendo lido de trás para frente e acaba quando chegar no 0 
			 */
		return menor;
		} else {
			if (menor> vet[tamanho-1]) {
				menor= vet[tamanho-1];
			}
			return menor(menor, tamanho-1,vet);
			
		}
	/* os dados "coletados" passam para o controller e o vetor é lido de trás para frente, com
	 * o tamanho sendo usado meramente como indice, nesse caso inclusive o vetor não precisava diminuir
	 * artificialmente, mas achar o tamanho é util para encontrar o ultimo indice
		
		*/
		

	}

	}
