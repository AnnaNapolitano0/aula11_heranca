public class Horista extends Empregado {
    private double horas;
    private double vl_horas;
 
    //Construtor
    public Horista(String nome , String endereço, double h, double vl_horas){
        super(nome, endereço);
        horas = h;
    }
 
    //Métodos de acesso
    public double getHoras() {
        return horas;
    }
 
    public void setHoras(double horas) {
        this.horas = horas;
    }
 
    public void calcularSalario(){
        salario = horas * 50;
    }
}
