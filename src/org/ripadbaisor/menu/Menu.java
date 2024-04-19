package org.ripadbaisor.menu;
import javax.swing.*;

public class Menu {
  public void mostrarMenu(){
    
      String opcionUsuario = "";
      do {
      opcionUsuario = JOptionPane.showInputDialog("""
        1. Añadir Restaurante    
        2. Editar Restaurante    
        3. Mostrar Restaurantes    
        4. Eliminar Restaurantes    
        Q. Salir del programa     
      """);
      if (opcionUsuario != null) {
        casoUsuario(opcionUsuario);
        // opcionUsuario.toUpperCase();
      }
    } while (opcionUsuario != null && (!opcionUsuario.contains("Q")));
  }

  public void casoUsuario(String opcionUsuario){
    
    switch (opcionUsuario) {
      case "1":
        aniadirRestaurante();
        break;
      case "2":
        editarRestaurante();
        break;
      case "3":
        mostrarRestaurante();
        break;
      case "4":
        eliminarRestaurante();
        break;
      case "Q":
        JOptionPane.showMessageDialog(null, "Hasta luego!");
        break;
      default:
        JOptionPane.showMessageDialog(null, "Opción inválida");
        System.out.println("Dato mal introducido");
        break;
    }
  }
  
}