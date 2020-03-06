package cl.desafiolatam.casadagger;

import cl.desafiolatam.casadagger.model.Casa;
import dagger.Component;

@Component
public interface AppComponent {
    Casa getCasa();
}