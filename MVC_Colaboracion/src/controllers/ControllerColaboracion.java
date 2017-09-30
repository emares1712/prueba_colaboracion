/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import views.ViewColaboracion;
import models.ModelColaboracion;
/**
 *
 * @author PC9
 */
public class ControllerColaboracion {
    ViewColaboracion view_colaboracion;
    ModelColaboracion model_colaboracion;
    public ControllerColaboracion(ViewColaboracion view_colaboracion, ModelColaboracion model_colaboracion){
        this.view_colaboracion = view_colaboracion;
        this.model_colaboracion = model_colaboracion;
        view_colaboracion.jbtn_menor.addActionListener(e -> jbtn_menor_click());
        initView();
    }

    public void initView(){
        view_colaboracion.jtf_n1.setText(String.valueOf(model_colaboracion.getN1()));
        view_colaboracion.jtf_n2.setText(String.valueOf(model_colaboracion.getN2()));
        view_colaboracion.jtf_n3.setText(String.valueOf(model_colaboracion.getN3()));
        view_colaboracion.jtf_m.setText(String.valueOf(model_colaboracion.getM()));
        view_colaboracion.setVisible(true);
    }
    public void jbtn_menor_click(){
        model_colaboracion.setN1(Integer.parseInt(view_colaboracion.jtf_n1.getText()));   
        model_colaboracion.setN2(Integer.parseInt(view_colaboracion.jtf_n2.getText()));
        model_colaboracion.setN3(Integer.parseInt(view_colaboracion.jtf_n3.getText()));   
        model_colaboracion.menor();
        model_colaboracion.jtf_m.setText(String.valueOf(view_colaboracion.getM()));
    
    }
}
