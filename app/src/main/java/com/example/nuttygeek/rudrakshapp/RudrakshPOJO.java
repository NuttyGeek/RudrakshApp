package com.example.nuttygeek.rudrakshapp;

/**
 * Created by nuttygeek on 14/8/17.
 */

public class RudrakshPOJO {

    private String mukhi;
    private String planet;
    private String god;
    private String mantra;
    private int sno;
    private String mantraHindi;

    public RudrakshPOJO(int sno,String mukhi,String planet,String god,String mantra,String mantraHindi) {
        super();
        this.mukhi=mukhi;
        this.sno=sno;
        this.planet=planet;
        this.god=god;
        this.mantra=mantra;
        this.mantraHindi=mantraHindi;
    }

    public String getMantraHindi() {

        return mantraHindi;
    }

    public void setMantraHindi(String mantraHindi) {
        this.mantraHindi = mantraHindi;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getMantra() {
        return mantra;
    }

    public void setMantra(String mantra) {
        this.mantra = mantra;
    }

    public String getMukhi() {
        return mukhi;
    }

    public void setMukhi(String mukhi) {
        this.mukhi = mukhi;
    }

    public String getPlanet() {
        return planet;
    }

    public void setPlanet(String planet) {
        this.planet = planet;
    }

    public String getGod() {
        return god;
    }

    public void setGod(String god) {
        this.god = god;
    }
}
