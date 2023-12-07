package Clase9;

public class Dibujar extends Hobby {
    String tipoDibujo, tecnica;

    public Dibujar(String nombreHobby, double horasPorSemana, String tipoDibujo, String tecnica) {
        super(nombreHobby, horasPorSemana);
        this.tipoDibujo = tipoDibujo;
        this.tecnica = tecnica;
    }

    public String getTipoDibujo() {
        return tipoDibujo;
    }

    public String getTecnica() {
        return tecnica;
    }

    public void setTipoDibujo(String tipoDibujo) {
        this.tipoDibujo = tipoDibujo;
    }

    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }

    public void Empezar_dibujo() {
        System.out.println("Empezando a dibujar\nTipo de dibujo: " + this.tipoDibujo + "\nTecnica: " + this.tecnica);
    }
}
