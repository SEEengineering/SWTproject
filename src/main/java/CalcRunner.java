import javax.swing.*;

public class CalcRunner {
    public static void main(String[] args){
        CalcFunction f = new CalcFunction();



                while(true) {
                    String input = (JOptionPane.showInputDialog(null,"enter value"));
                    System.out.println(input);

                    if(f.check(input)==true) {
                        //f.dollarToNok(input);
                        //f.dollarToJPY(input);
                        break;
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Invalid,Try again");
                    }
                }
    }
}
