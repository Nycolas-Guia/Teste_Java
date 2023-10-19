import javax.swing.JOptionPane;

public class Ex2 {
    public static void main(String[] args){
        double x = 0,y = 0, z = 0, error = 0;
        do{
            do{
                try {
                    error = 0;
                    x = Double.parseDouble(JOptionPane.showInputDialog(null, "entre com o dividendo","calculadora divisão", 1));
                    y = Double.parseDouble(JOptionPane.showInputDialog(null, "entre com o divisor  ","calculadora divisão", 1));
                }catch (java.lang.NumberFormatException e1) {
                    JOptionPane.showMessageDialog(null, "erro na entrada de dados", "erro", 2);
                    error = 1;
                }
            }while(error != 0);
           
            try{
                double resultado = x / y;

            }
              catch(ArithmeticException ex){
                JOptionPane.showMessageDialog(null, "erro na entrada de dados", "erro", 2);
                error = 1;
              }

            if (y == 0){
                JOptionPane.showMessageDialog(null, "impossivel dividir por zero", "erro", 2);
                error = 1;
            }else{
                z = x / y;
                JOptionPane.showMessageDialog(null, "o valor da soma foi: " + div(x,y) );
            }
        }while(error != 0);

    }

    private static Double div(Double x1, Double x2){
        return x1/x2;
    }
}