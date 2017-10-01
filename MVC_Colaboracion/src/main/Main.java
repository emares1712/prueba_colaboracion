/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import views.ViewColaboracion;
import models.ModelColaboracion;
import controllers.ControllerColaboracion;
/**
 *
 * @author JonatanVT
 */
public class Main {
    private static ViewColaboracion view_colaboracion;
      private static ModelColaboracion model_colaboracion;
        private static ControllerColaboracion controller_Colaboracion;
      public static void main(String jvt[]){
          model_colaboracion= new ModelColaboracion();
          view_colaboracion= new ViewColaboracion();
       controller_Colaboracion= new ControllerColaboracion(view_colaboracion, model_colaboracion);
}
}

