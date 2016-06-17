 
package pe.egcc.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import org.primefaces.model.chart.PieChartModel;
 
@ManagedBean
@RequestScoped
public class NotaController {

    private int nota1;
    private int nota2;
    private int nota3;
    private int nota4;
    private PieChartModel pieModel;
    private boolean formulario = true;
    
    public boolean isFormulario() {
        return formulario;
    }

    public PieChartModel getPieModel() {
        return pieModel;
    }

    public void setPieModel(PieChartModel pieModel) {
        this.pieModel = pieModel;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }

    public int getNota4() {
        return nota4;
    }

    public void setNota4(int nota4) {
        this.nota4 = nota4;
    }
    
    public void doGraficar() {
        
        pieModel = new PieChartModel();
        
        pieModel.set("Nota 1", nota1);
        pieModel.set("Nota 2", nota2);
        pieModel.set("Nota 3", nota3);
        pieModel.set("Nota 4", nota4);
        
        pieModel.setTitle("GRAFICO");
        pieModel.setLegendPosition("e");
        pieModel.setFill(false);
        pieModel.setShowDataLabels(true);
        pieModel.setDiameter(150);
        
        formulario = false;
    }
    
    public void doRetornar(){
        formulario = true;
    }
    
}
