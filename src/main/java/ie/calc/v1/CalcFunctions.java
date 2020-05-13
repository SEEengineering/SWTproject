package ie.calc.v1;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class CalcFunctions {
    DecimalFormat df = new DecimalFormat("#.##");
    public double val;

    public CalcFunctions() {
        df.setRoundingMode(RoundingMode.CEILING);
    }

    public double EuroTopound(double Minput){
        return Minput * 0.88;
    }

    public String EuroToJPY(double Minput){
       return df.format(Minput * 117.03);

    }

    public String EuroToUS(double Minput){
        return df.format(Minput * 1.10);
    }

    public String EuroToBitcoin(double Minput){
        return df.format(Minput / 7784.37);
    }

    public double EuroToAustraliandollar(double Minput) {
        return Minput * 1.68;
    }

    public String GramsToPounds(double Minput) {
        df = new DecimalFormat("#.######");
        return df.format(Minput / 454);
    }

    public String GramsToStone(double Minput) {
        df = new DecimalFormat("#.####");
        return df.format(Minput / 6350);
    }

    public String GramsToOunce(double Minput) {
        df = new DecimalFormat("#.####");
        return df.format(Minput / 28.35);
    }
    public String GramsToEngFormat(double Minput) {
        String[] prefixArray = {"mg", "g", "kg"};
        int prefixOffset = 1;
        return new EngNotation(Minput,prefixArray,prefixOffset).getEng();
    }

    public String LitresToGallons(double Minput) {
        df = new DecimalFormat("#.####");
        return df.format(Minput / 4.546);
    }

    public String LitresToPints(double Minput) {
        df = new DecimalFormat("#.####");
        return df.format(Minput * 1.76);
    }
    public String LitresToOunces(double Minput) {
        df = new DecimalFormat("#.####");
        return df.format(Minput * 35.195);

    }

    public String LitresToCubicFoot(double Minput) {
        df = new DecimalFormat("#.####");
        return df.format(Minput / 28.317);
    }

    public String LitresToEng(double Minput) {
        String[] prefixArray = {"ml", "l", "kl"};
        int prefixOffset = 1;
        return new EngNotation(Minput,prefixArray,prefixOffset).getEng();
    }

    public String KmToMetres(double Minput) {
        df = new DecimalFormat("#.####");
        return df.format(Minput * 1000);
    }

    public String KmToMiles(double Minput) {
        df = new DecimalFormat("#.######");
        return df.format(Minput / 1.609);
    }

    public String KmToYards(double Minput) {
        df = new DecimalFormat("#.##");
        return df.format(Minput * 1094);
    }

    public String KmToFeet(double Minput) {
        df = new DecimalFormat("#.##");
        return df.format(Minput * 3281);
    }

    public String KmToInches(double Minput) {
        df = new DecimalFormat("#.##");
        return df.format(Minput * 39370);
    }

    public String KmToEngFormat(double Minput) {
        String[] prefixArray = {"m", "km", "km"};
        int prefixOffset = 1;
        return new EngNotation(Minput,prefixArray,prefixOffset).getEng();
    }

    public double getVal() {
        return val;
    }

    public void setVal(double val) {
        this.val = val;
    }
}
