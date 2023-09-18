/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package john.figurasgeometricasgui;

/**
 *
 * @author johnferneymontoyaramirez
 */
public class TrianguloRectangulo {
	int base;
	int altura;

	TrianguloRectangulo (int base, int altura) {
		this.base = base;
		this.altura = altura;
	}

	double calcularArea () {
		return (base * altura / 2);
	}

	double calcularPerimetro () {
		return (base + altura + calcularHipotenusa());
	}

	double calcularHipotenusa () {
		return Math.pow(base * base + altura * altura, 0.5);
	}

	String determinarTipoTriangulo() {
		if ((base == altura) && (base == calcularHipotenusa())
			&& (altura == calcularHipotenusa())) {
			return "ES UN TRIANGULO EQUILATERO";
		} else if ((base != altura) && (base != calcularHipotenusa())
			&& (altura != calcularHipotenusa())) {
			return "ES UN TRIANGULO ESCALENO";
		} else {
			return "ES UN TRIANGULO ISOCELES";
		}
	}
}
