// CPACKAGES
package principal;

// IMPORTS
import model.Aluno;
import model.Professor;

public class Principal {

   public static void main(String[] args) {
      Aluno Elias = new Aluno();
      Elias.cadastar();
      System.out.println(Elias.imprimir());
      System.out.println(Elias.getNomeFormatado());
         
      Professor Jose = new Professor();
      Jose.cadastrar();
      System.out.println(Jose.imprimir());
      System.out.println(Jose.getNomeFormatado());
   }

}
