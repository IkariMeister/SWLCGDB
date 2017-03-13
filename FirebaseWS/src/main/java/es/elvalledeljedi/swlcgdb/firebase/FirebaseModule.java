package es.elvalledeljedi.swlcgdb.firebase;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by jcgarcia on 13/03/2017.
 */
@Module
public class FirebaseModule {

    @Provides
    @Singleton
    public FirebaseAuth provideFirebaseAuth(){
        return FirebaseAuth.getInstance();
    }

    @Provides
    @Singleton
    public FirebaseDatabase provideFirebaseDatabase(){
        return FirebaseDatabase.getInstance();
    }

    @Provides
    @Singleton
    public FirebaseStorage provideFirebaseStorage(){
        return FirebaseStorage.getInstance();
    }
}
