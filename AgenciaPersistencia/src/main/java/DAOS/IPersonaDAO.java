/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAOS;

/**
 *
 * @author TeLesheo
 */
public interface IPersonaDAO {

    public void agregarPersona(PersonaDAO persona);

    public PersonaDAO consultarPersonaRFC(String RFC);

    public void insercionPersonas();
}
