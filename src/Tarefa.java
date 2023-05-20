import javax.swing.JOptionPane;

public class Tarefa {
    public static void main(String[] args) {
        double salario = Double.parseDouble( JOptionPane.showInputDialog("Informe seu salario?"));
        JOptionPane.showMessageDialog(null, "Seu salario é: "+salario);
        if (salario<1320 && salario>0){
            JOptionPane.showMessageDialog(null,"Salario abaixo do minimo");
        }else if (salario>=1320){
            JOptionPane.showMessageDialog(null,"Salario acima do minimo");
        }else if(salario<0){
            JOptionPane.showMessageDialog(null,"Trabalho escravo");

    }
}
}