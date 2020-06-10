
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Vector;

/**
 *
 * @author tndkh_000
 */
public class Loantype {
    public String loanName;
    public int iRate;
    public int creditSpread;
    public String benchMarkType;

    public Loantype() {
    }

    public Loantype(String loanName, int iRate, int creditSpread, String benchMarkType) {
        this.loanName = loanName;
        this.iRate = iRate;
        this.creditSpread = creditSpread;
        this.benchMarkType = benchMarkType;
    }

    @Override
    public String toString() {
        return "Loantype{" + "loanName=" + loanName + ", iRate=" + iRate + '}';
    }
    public Vector toVector2() {
        Vector v = new Vector();

        v.add(loanName);
        v.add(iRate);
        v.add(benchMarkType);
        v.add(creditSpread);
       

        return v;

    }
    public Vector toVector() {
        Vector v = new Vector();

        v.add(loanName);
       
       

        return v;

    }
}
