//Github Repo: https://github.com/SEEengineering/SWTproject
//Software with Test Pipeline Project, Final year, GMIT
//Anuoluwapo Oguntayo, Darragh Freely, Alan Serhan, McHarrison Kouao.
//11-05-2020


package ie.calc.v1;

public class CalcRunner {
    public static void main(String[] args) {
        try {
            //UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
            new CalcConverterGUI().setVisible(true);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}