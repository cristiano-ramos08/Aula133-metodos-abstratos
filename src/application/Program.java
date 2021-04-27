package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		List<Shape> list = new ArrayList<>();//sempre colocar a classe generica (Shape) quando usar polimorfismo, assim essa classe
		//aceitar� dados de todas as sub-classes.
		
		System.out.print("Enter the o number of shapes");
		int n = sc.nextInt();
			
		for(int i = 1; i <= n; i++) {
			System.out.print("Shape "+i+ " data: ");
			System.out.print("Rectangle or clicle (r/c)? ");
			char tipo = sc.next().charAt(0);
			System.out.print("BLACK/BLUE/RED: ");
			Color color = Color.valueOf(sc.next());
			if(tipo == 'r') {
				System.out.print("Width:");
				double width = sc.nextDouble();
				System.out.print("Heigth ");
				double height = sc.nextDouble();				
				list.add(new Rectangle(color, width, height));
				
			}
			else {
				System.out.print("Radius ");
					double radius = sc.nextDouble();
				
				list.add(new Circle(color, radius));
			}
			
			
		}
		System.out.println();
		System.out.println("SHAPE AREAS:");
		
		for (Shape sh : list) {
			System.out.printf(String.format("%.2f%n", sh.area()));
		}
	}

}