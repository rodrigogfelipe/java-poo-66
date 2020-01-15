/*Fazer um programa para ler os valores da largura e altura de um retângulo. Em seguida, mostrar na tela o 
 * valor de sua área, perímetro e diagonal. Usar uma classe como mostrado no projeto ao lado.
*/
package entities;

public class Rectangle {

	public double width;
	public double height;

	/* Declarando os metados */
	public double area() {
		return width * height;
	}

	public double Perimeter() {
		return (width * height) + 2.0;
	}

	public double Diagonal() {
		return Math.sqrt(Math.pow(width, 2.0) + Math.pow(height, 2.0));

	}

	@Override
	public String toString() {
		return "Area= "
				+ String.format("%.2f", area())
				+"\n"
				+ "Perimeter= "
				+ String.format("%.2f", Perimeter())
				+"\n"
				+ "Diagonal= "
				+ String.format("%.2f", Diagonal());
	}

}
