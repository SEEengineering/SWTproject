package ie.calc.v1;

import java.util.StringTokenizer;

public class EngNotation {
    private int PREFIX_OFFSET;
    private String[] PREFIX_ARRAY;
    private double engValue;
    private String eng;
    public EngNotation(double calcInput, String[] prefix_array,int prefix_offset ) {
        if(calcInput < 0)
            throw new IllegalArgumentException("Must be greater than 0");
        else
            this.engValue = calcInput;
        if(prefix_array.length < 1)
            throw new IllegalArgumentException("Must be greater than 1");
        else
            this.PREFIX_ARRAY = prefix_array;
        if(prefix_offset < 0)
            throw new IllegalArgumentException("Must be greater than 0");
        else
            this.PREFIX_OFFSET = prefix_offset;
        eng = convert(engValue, decimalPoint());
    }

    public String convert(double val, int dp) {
        if (val == 0) return String.format("%." + dp + "f", 0.0);

        double posVal = (val<0) ? -val : val;
        double log10 = Math.log10(posVal);

        int count = (int) Math.floor(log10/3);

        int index = count + PREFIX_OFFSET;

        val /= Math.pow(10, count * 3);

        if (index >= 0 && index < PREFIX_ARRAY.length)
        {
            return String.format("%." + dp + "f%s", val, PREFIX_ARRAY[index]);
        }
        else
        {
            return String.format("%." + dp + "fe%d", val, count * 3);
        }
    }

    public int decimalPoint () {
        String input = String.valueOf(getEngValue());
        if(input.contains(".")) {
            int n2;
            StringTokenizer t=new StringTokenizer(input,".");
            t.nextToken();
            String s2=t.nextToken();
            n2=s2.length();
            if(n2!=1)
                if(s2.charAt(s2.length()-1)=='0')
                    n2=s2.length()-1;
            return n2;
        }
        return 0;
    }

    public String getEng() {
        return eng;
    }

    public double getEngValue() {
        return engValue;
    }
}
