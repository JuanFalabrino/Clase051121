
package fasfoodcefp;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class FASFOODCEFP {

    public static void main(String[] args) {
      
     ImageIcon icon = new ImageIcon("src/Imagenes/fast-food.png");
     ImageIcon h = new ImageIcon("src/Imagenes/h.png");
     ImageIcon ff = new ImageIcon("src/Imagenes/ff.png");
     ImageIcon bb = new ImageIcon("src/Imagenes/bb.png");
     ImageIcon pedido = new ImageIcon("src/Imagenes/pedido.png");
     ImageIcon p = new ImageIcon("src/Imagenes/p.png");
    
     
     JOptionPane.showMessageDialog(null,"","FASTFOOD-CFPN36",JOptionPane.INFORMATION_MESSAGE,icon);
     String Nombre = JOptionPane.showInputDialog(null,"Ingrese su Nombre ");
     String pago []  = {"Efectivo","Tarjeta Debito","Tarjeta Credito","Efectivo"};
     Object pa =JOptionPane.showInputDialog(null,"Seleccione Forma de Pago","FASTFOOD-CFPN36",JOptionPane.QUESTION_MESSAGE,p,pago,pago[0]);   
     
     
     //Listado de producto
     String Hamburgesas []  = {"Simple (Lechuga y tomate)","Medium (Simple + jamon y queso)","Explosiva (Medium + huevo y panceta)","Simple (Lechuga y tomate)"};
     String PapasF []  = {"Chicas","Mediana","Grandes","Chicas"};
     String Bebidas []  = {"Chica","Mediana","Explosiva (Medium + huevo y panceta)","Simple (Lechuga y tomate)"};
     
     
     Object Hm =JOptionPane.showInputDialog(null,"Seleccione la Hamburguesa","FASTFOOD-CFPN36",JOptionPane.QUESTION_MESSAGE,h,Hamburgesas,Hamburgesas[0]);   
     Object PF =JOptionPane.showInputDialog(null,"Seleccione la Papas Fritas","FASTFOOD-CFPN36",JOptionPane.QUESTION_MESSAGE,ff,PapasF,PapasF[0]);   
     Object BB =JOptionPane.showInputDialog(null,"Seleccione la Bebida","FASTFOOD-CFPN36",JOptionPane.QUESTION_MESSAGE,bb,Bebidas,Bebidas[0]);   
      
        
      JOptionPane.showMessageDialog(null,  "\n Sr/Sra : " + Nombre +
                                            "\n Su forma de pago es : " + pago +
                                            "\n Su Hamurguesa es: " + Hm +
                                            "\n Su Papas Fritas es: " + PF +
                                            "\n Su Bebida es: " + BB + "\n\nGracias por su Visita", "FASTFOOD-CFPN36", JOptionPane.INFORMATION_MESSAGE,pedido);
     
        
    }
    
}
