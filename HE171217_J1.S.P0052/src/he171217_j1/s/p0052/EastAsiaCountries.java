package he171217_j1.s.p0052;

/**
 *
 * @author Dell
 */
public class EastAsiaCountries extends Country implements Comparable <EastAsiaCountries> {
    private String countryTerrain;

    public EastAsiaCountries() {
    }

    public EastAsiaCountries(String countryTerrain) {
        this.countryTerrain = countryTerrain;
    }

    public EastAsiaCountries( String countryCode, String countryName, float totalArea,String countryTerrain) {
        super(countryCode, countryName, totalArea);
        this.countryTerrain = countryTerrain;
    }

    public String getCountryTerrain() {
        return countryTerrain;
    }

    public void setCountryTerrain(String countryTerrain) {
        this.countryTerrain = countryTerrain;
    }

    @Override
    public void display() {
        System.out.printf("%-10s %-15s %-15s %-15s\n",super.countryCode , super.countryName, super.totalArea, this.countryTerrain);
    }

    @Override
    public int compareTo(EastAsiaCountries o) {
        return this.countryName.compareToIgnoreCase(o.countryName);
    }

    
    
}
