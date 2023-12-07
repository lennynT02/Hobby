package Clase9;

public class Main {
    public static void main(String[] args) {
        Dibujar dibujo1 = new Dibujar("Dibujar", 5, "Manga", "Lapiz");
        String hobbyResult = dibujo1.Hacer_hobby();
        String dibujoResult = dibujo1.Empezar_dibujo();
        System.out.println(hobbyResult + dibujoResult);
    }
}
