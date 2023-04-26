/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patrones_01;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Carvajal
 */

public class Sujeto implements ISujeto{
    List<Observador> ListaDeObservadores = new ArrayList<Observador>();
    private int _flag;

    public int getFlag() {
        return _flag;
    }

    public void setFlag(int _flag) {
        this._flag = _flag;
        NotificacionHaObservadores();
    }

    @Override
    public void Registrado(Observador o) {
        ListaDeObservadores.add(o);
    }

    @Override
    public void NoRegistrado(Observador o) {
        ListaDeObservadores.remove(o);
    }

    @Override
    public void NotificacionHaObservadores() {
        for (int i = 0; i < ListaDeObservadores.size(); i++) {
            ListaDeObservadores.get(i).update();
        }
    }
}
