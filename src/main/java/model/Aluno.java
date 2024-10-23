// PACKAGES
package model;

// IMPORTS
import javax.swing.JOptionPane;

public class Aluno extends Pessoa {

   // ATTRIBUTES ===============================================================
   private String curso;

   // CONSTRUCTORS =============================================================
   public Aluno() {
      this("", 0, "");
   }
   
   public Aluno(String nome, int idade, String curso) {
      super(nome, idade);
      this.curso = curso;
   }

   // GETTER / SETTER ==========================================================
   public String getCurso() {
      return curso;
   }
   
   public void setCurso(String curso) {
      this.curso = curso;
   }

   // OTHER METHODS ============================================================
   public void cadastar() {
      super.cadastrar();
      setCurso(JOptionPane.showInputDialog(null, "CURSO", CURSO));
   }
   
   public String imprimir() {
      return super.imprimir() + "\nCURSO: " + getCurso();
   }
   
   @Override
   public String getNomeFormatado() {
      return "NOME: " + super.getNome().toUpperCase();
   }
   
}
