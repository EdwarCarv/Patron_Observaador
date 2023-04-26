/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package patrones_01;

/**
 *
 * @author Carvajal
 */
public interface ISujeto {
    void Registrado(Observador o);

    void NoRegistrado(Observador o);

    void NotificacionHaObservadores();
}
