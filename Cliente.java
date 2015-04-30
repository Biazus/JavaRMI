package appcalculadora;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.math.BigDecimal;
import appcalculadora.Calculadora;

public class Cliente {
    public static void main(String args[]) {
        if (System.getSecurityManager() == null) {
            System.setSecurityManager(new SecurityManager());
        }
        try {
            String name = "Calculadora";
            Registry registry = LocateRegistry.getRegistry(args[0]);
            Calculadora calc = (Calculadora) registry.lookup(name);
            int result = calc.somarInt(3,2);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("ComputePi exception:");
            e.printStackTrace();
        }
    }    
}
