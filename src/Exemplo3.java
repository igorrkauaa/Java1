import javax.swing.JOptionPane;

public class Exemplo3 {
    public static void main(String[] args) {
         String opc = JOptionPane.showInputDialog("Informe um curso: \n1 - Java \n2 - Javascript");
         opc = opc.toLowerCase();
        if(opc.equals("1") || opc.equals("java")){
            JOptionPane.showInternalMessageDialog(null,"BACKEND");
        }else if(opc.equals("2") || opc.equals("javascript")){
            JOptionPane.showMessageDialog(null,"FRONTEND");
        }else{
                JOptionPane.showMessageDialog(null,"Opção invalida");



        }
    }
    
}
