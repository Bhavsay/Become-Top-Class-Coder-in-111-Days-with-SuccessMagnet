import java.util.ArrayList;

class Solution {
    public ArrayList<Float> divisionWithPrecision(float a, float b) {
        ArrayList<Float> result = new ArrayList<>();

        float div = a / b;

        
        String val1 = String.valueOf(div).replaceAll("0*$", "").replaceAll("\\.$", "");
        String val2 = String.format("%.3f", div);

        result.add(Float.parseFloat(val1));
        result.add(Float.parseFloat(val2));

        return result;
    }
}
