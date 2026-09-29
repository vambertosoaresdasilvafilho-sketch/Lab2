package lab2;

public class Descanso {
    private int horasDescanso;
    private int numerosSemana;

    public Descanso(){}

    public void defineHorasDescanso(int ndescanso){
        horasDescanso = ndescanso;
    }

    public void defineNUmeroSemanas(int valor){
        numerosSemana = valor;
    }

    public String getStatusgeral(){
        if (horasDescanso / numerosSemana >= 26 ) return "Estou Descansado";
        return "Estou Cansado";
    }
}
