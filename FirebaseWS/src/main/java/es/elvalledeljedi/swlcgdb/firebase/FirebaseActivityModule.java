package es.elvalledeljedi.swlcgdb.firebase;

import dagger.Module;
import dagger.Provides;

/**
 * Created by jcgarcia on 13/03/2017.
 */

@Module
public class FirebaseActivityModule {
    @Provides
    public MainPresenter providesMainPresenter(){
        return new MainPresenter();
    }
}
