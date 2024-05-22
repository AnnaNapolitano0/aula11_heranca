public class FolhaPGTO  {
    public static void main(String args[]){
        Mensalista men1, men2;
        Horista hora1, hora2;
 
        //Empregados mensalistas
        men1 = new Mensalista("Jose", "Rua abc", "Junior");
        men1.calcularSalario();
        men1.calcINSS();
       // exemplo de como usar o metodo imprimir, colocar .imprimir ao lado do objeto.
        men1.imprimir();
 
        men2 = new Mensalista("Ana", "Rua sem fim", "Senior");
        
        men2.calcularSalario();
        men2.calcINSS();
        men2.imprimir();
     
 
        // Empregados horistas
 
        hora1 = new Horista("Carlos", "Rua xyz", 6, 100);
        hora1.calcularSalario();
        hora1.imprimir();
    
        hora2 = new Horista("Cristina", "Rua do centro", 10, 300);
        hora2.calcularSalario();
        hora1.imprimir();
      
 
    }
}
