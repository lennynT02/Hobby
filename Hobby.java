package Clase9;

public class Hobby {
    public String nombreHobby;
    public double horasPorSemana;
    public Hobby(String nombreHobby, double horasPorSemana) {
        this.nombreHobby = nombreHobby;
        this.horasPorSemana = horasPorSemana;
    }
    public String getNombreHobby() {
        return nombreHobby;
    }
    public void setNombreHobby(String nombreHobby) {
        this.nombreHobby = nombreHobby;
    }
    public double getHorasPorSemana() {
        return horasPorSemana;
    }
    public void setHorasPorSemana(double horasPorSemana) {
        this.horasPorSemana = horasPorSemana;
    }
    public String Hacer_hobby() {
        return "Hobby: " + this.nombreHobby + " - Horas por semana: " + this.horasPorSemana;
    }
}
