package ie.calc.v1;

import javax.swing.*;

public class CalcFunctions {
    public boolean check(String input){
        try{
        double x = Double.parseDouble(input);
        if (x>=10 || x<0);
        return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public void EuroTopound(double Minput){
        double pound = Minput * 0.88 ;
        JOptionPane.showMessageDialog(null,"Amount of GBP:" + pound+" £");
    }

    public void EuroToJPY(double Minput){
        double JPY = Minput * 117.03;
        JOptionPane.showMessageDialog(null,"Amount of JPY:" + JPY +" kr");
    }

    public void EuroToUS(double Minput){
        double US = Minput * 1.10;
        JOptionPane.showMessageDialog(null,"Amount of USD:" + US +" $");
    }

    public void EuroToBitcoin(double Minput){
        double Bitcoin = Minput / 7784.37;
        JOptionPane.showMessageDialog(null,"Amount of BTC:" + Bitcoin +" ฿");
    }

    public void EuroToAustraliandollar(double Minput){
        double AustralianDollar = Minput * 1.68;
        JOptionPane.showMessageDialog(null,"Amount of AUS:" + AustralianDollar +" a$");
    }

    public void GramsToPounds(double Minput) {
        double pound = Minput / 454;
        JOptionPane.showMessageDialog(null,"Mass in Pounds: " + pound +" lbs");
    }

    public void GramsToStone(double Minput) {
        double stone = Minput / 6350;
        JOptionPane.showMessageDialog(null,"Mass in Stone: " + stone +" st");
    }
    public void GramsToOunce(double Minput) {
        double ounce = Minput / 28.35;
        JOptionPane.showMessageDialog(null,"Mass in Ounce: " + ounce +" oz");
    }
    public void GramsToEngFormat(double Minput) {
        JOptionPane.showMessageDialog(null,"Grams in engineering notation: " +
                new EngNotation(Minput).getEng());
    }




    public void LitresToGallons(double Minput) {
        double gallons = Minput / 4.546;
        JOptionPane.showMessageDialog(null,"Litres in Gallons: " + gallons +" gallons");
    }

    public void LitresToPints(double Minput) {
        double pint = Minput * 1.76;
        JOptionPane.showMessageDialog(null,"Litres in Pints: " + pint +" pints");
    }
    public void LitresToOunces(double Minput) {
        double ounce = Minput * 35.195;
        JOptionPane.showMessageDialog(null,"Litres in Ounces: " + ounce +" ounces");
    }

    public void LitresToCubicFoot(double Minput) {
        double cubicFoot = Minput / 28.317;
        JOptionPane.showMessageDialog(null,"Litres in Cubic feet: " + cubicFoot +" cubic feet");
    }

    public void LitresToEng(double Minput) {
        JOptionPane.showMessageDialog(null,"Grams in engineering notation: " +
                new EngNotation(Minput).getEng());
    }




    public void KmToMetres(double Minput) {
        double Metres = Minput * 1000;
        JOptionPane.showMessageDialog(null,"Km in Metres: " + Metres +" Metres");
    }

    public void KmToMiles(double Minput) {
        double Miles = Minput / 1.609;
        JOptionPane.showMessageDialog(null,"Km in Miles: " + Miles +" Miles");
    }

    public void KmToYards(double Minput) {
        double Yards = Minput * 1094;
        JOptionPane.showMessageDialog(null,"Km in Yards: " + Yards +" Yards");
    }

    public void KmToFeet(double Minput) {
        double Feet = Minput * 3281;
        JOptionPane.showMessageDialog(null,"Km in Feet: " + Feet +" Feet");
    }

    public void KmToInches(double Minput) {
        double Inches = Minput * 39370;
        JOptionPane.showMessageDialog(null,"Km in Inches: " + Inches +" Inches");
    }

    public void KmToEngFormat(double Minput) {
        JOptionPane.showMessageDialog(null,"Km in engineering notation: " +
                new EngNotation(Minput).getEng());
    }



}
