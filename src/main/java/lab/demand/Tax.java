package lab.demand;

public class Tax {

    public double calculateTax(String country, double n) {
        if (country.equals("PE") && n==-1.0) {
            return 0.18;
        } else if (country.equals("BR") && n==-1.0) {
            return 0.12;
        } else if(n==-1.0){
            return 0.0;
        }
    }
    return n;
}
