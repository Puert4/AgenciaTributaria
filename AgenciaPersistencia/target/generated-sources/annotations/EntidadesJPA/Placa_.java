package EntidadesJPA;

import EntidadesJPA.EstadoPlaca;
import EntidadesJPA.Vehiculo;
import java.util.Calendar;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-04-04T10:07:35", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Placa.class)
public class Placa_ extends Tramite_ {

    public static volatile SingularAttribute<Placa, EstadoPlaca> estadoPlaca;
    public static volatile SingularAttribute<Placa, Vehiculo> vehiculo;
    public static volatile SingularAttribute<Placa, Calendar> fechaRecepcion;
    public static volatile SingularAttribute<Placa, String> seriePlacas;

}