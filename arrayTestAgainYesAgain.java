package test;

import java.util.Arrays;
import java.util.Scanner;

public class arrayTestAgainYesAgain {
	
	public static int[][] Agregar (int [][] array, Scanner sc) {
		int count=0;
		
		System.out.print("Inserte un departamento:" +
		"\n1-Ropa		2-Deportes		3-Juguetería");
			int dep = sc.nextInt() -1;
		
		System.out.print("Inserte un mes (en número).");
				int mes = sc.nextInt() -1;
				
		if (array [dep][mes] !=0) {
			System.out.println("Este mes ya está registrado. No es necesario insertar datos.");
				} else {
					System.out.println("Inserte los ingresos del mes.");
					array[dep][mes]= sc.nextInt();
				}
		return array;
		
	}
	
	public static int[][] Elim (int[][]array, Scanner sc) {
		
		System.out.print("Inserte el departamento del cual quiere eliminar ingresos:" +
		"\n1-Ropa		2-Deportes		3-Juguetería");
			int dep = sc.nextInt() -1;
		
		System.out.print("Inserte el número del mes que desea eliminar.");
				int mes = sc.nextInt() -1;
		
		array[dep][mes]=0;		
		return array;
	}
	
	
	public static void Search (int[][]array, String[] months, Scanner sc) {
		
		System.out.print("Inserte un departamento:" +
		"\n1-Ropa		2-Deportes		3-Juguetería");
			int dep = sc.nextInt() -1;
		
		System.out.print("Inserte un mes (en número).");
				int mes = sc.nextInt() -1;
			
		System.out.println("Los ingresos del mes "+months[mes]+" son: "+array[dep][mes]);

	}
	
	
	public static void main (String [] args) {
		
        Scanner sc = new Scanner(System.in);
		
		String [] months = {"ene", "feb", "mar", "ab", "may", "jun", "jul", "aug", "sep", "oct", "nov", "dec"};
		String [] depars = {"RopaMujer", "Deportes", "Juguetes"};
		int [] [] ventas = {{10,9,8,2,3,4,5,8,0,0,0,0}, {1,2,3,4,5,6,7,8,9,10,11,12}, {5,6,10,9,8,7,6,5,4,3,2,1}};
		
		System.out.printf("\t");
		for (int e=0; e<months.length; e++) {
			System.out.printf("\t"+ months[e]);
		}
		
		System.out.println();
		 for(int i=0;i<ventas.length;i++) {
			 System.out.printf(depars[i]);
			 for(int j=0;j<ventas[i].length;j++) {
				 System.out.printf("%8d",ventas[i][j]);
				 if (j==ventas[i].length-1) {
					System.out.println(); 
				 		}
	            	}
	        }
		int count=1;
		do {
		ventas=Agregar(ventas,sc);
		ventas= Elim(ventas, sc);

		System.out.printf("\t");
		for (int e=0; e<months.length; e++) {
			System.out.printf("\t"+ months[e]);
		}
		
		System.out.println();
		 for(int i=0;i<ventas.length;i++) {
			 System.out.printf(depars[i]);
			 for(int j=0;j<ventas[i].length;j++) {
				 System.out.printf("%8d",ventas[i][j]);
				 if (j==ventas[i].length-1) {
					System.out.println(); 
				 		}
	            	}
	        }count++;
		}while (count<=1);
		
		Search(ventas,months,sc);
	}

}
