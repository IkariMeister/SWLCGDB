package es.elvalledeljedi.swlcgdb.firebase.auth;

import android.support.annotation.NonNull;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import javax.inject.Inject;

/**
 * Created by jcgarcia on 13/03/2017.
 */

public class AuthController implements FirebaseAuth.AuthStateListener {
    private final FirebaseAuth mFirebaseAuth;

    @Inject
    public AuthController(FirebaseAuth pFirebaseAuth){
        this.mFirebaseAuth = pFirebaseAuth;
    }

    @Override
    public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
//        FirebaseUser user = firebaseAuth.getCurrentUser();
//        if (user != null) {
//            // User is signed in
//            onSignedInInitialize(user.getDisplayName());
//        } else {
//            // User is signed out
//            onSignedOutCleanup();
//            startActivityForResult(
//                    AuthUI.getInstance()
//                            .createSignInIntentBuilder()
//                            .setIsSmartLockEnabled(false)
//                            .setProviders(
//                                    AuthUI.EMAIL_PROVIDER,
//                                    AuthUI.GOOGLE_PROVIDER)
//                            .build(),
//                    RC_SIGN_IN);
//        }
    }

        private void onSignedOutCleanup() {
//            mUsername = ANONYMOUS;
//            mMessageAdapter.clear();
//            detachDatabaseReadListener();
        }
        private void onSignedInInitialize(String username) {
//            mUsername = username;
//            attachDatabaseReadListener();
        }
}
