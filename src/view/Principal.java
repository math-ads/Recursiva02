package view;

import controller.MenorValor;
public class Principal {

	public static void main( String[]args) {
		
	int vet[]={4,2,16,12,3};
	MenorValor menval= new MenorValor();
	int tamanho= vet.length;
	int menor= vet[tamanho-1];
	int resp= menval.menor(menor, tamanho, vet);
	System.out.println(resp);
	
}
}