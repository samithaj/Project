
package project;

import gnu.io.CommPortIdentifier;
import java.util.Enumeration;


public class Project {

    
    public static void main(String[] args) {
        Enumeration enu = CommPortIdentifier.getPortIdentifiers();
        
            CommPortIdentifier cpid = (CommPortIdentifier)enu.nextElement();
            System.out.println(cpid.getName());
        
    }
    
}
