/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class EastAsiaCountries extends Country{
    
    private String countryTerrian;

    public EastAsiaCountries() {
    }

    public EastAsiaCountries(String countryTerrian, String code, String name, float totalArea) {
        super(code, name, totalArea);
        this.countryTerrian = countryTerrian;
    }

    public String getCountryTerrian() {
        return countryTerrian;
    }

    public void setCountryTerrian(String countryTerrian) {
        this.countryTerrian = countryTerrian;
    }
    
    public void display() {
        super.display();
    }
}
