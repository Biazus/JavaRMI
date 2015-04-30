package appcalculadora;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import appcalculadora.Calculadora;


public class Servidor implements Calculadora {

    public Servidor(){
        super();
    }

    public int somarInt(int val1, int val2){
        return val1+val2;
    }
    public int multiplicarInt(int val1, int val2){
        return val1*val2;
    }

	public static void main(String args[]) {
        if (System.getSecurityManager() == null)
            System.setSecurityManager(new SecurityManager());
	    try {
            String name = "Calculadora";
            Calculadora calc = new Servidor();
            Calculadora stub =
                (Calculadora) UnicastRemoteObject.exportObject(calc, 0);
            Registry registry = LocateRegistry.getRegistry();
            registry.rebind(name, stub);
            System.out.println("ComputeEngine bound");
        } catch (Exception e) {
            System.err.println("ComputeEngine exception:");
            e.printStackTrace();
        }
		
	}
}

//public int somarInt(int val1, int val2)
//public int multiplicarInt(int val1, int val2)
