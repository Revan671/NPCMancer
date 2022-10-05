package com.example.npcmancer;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.npcmancer.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



         NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);

    }



/*
    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }*/
}
/*
---add button
<com.google.android.gms.common.SignInButton
 android:id="@+id/sign_in_button"
 android:layout_width="wrap_content"
 android:layout_height="wrap_content" />
---button stuffs
@Override
public void onClick(View v) {
    switch (v.getId()) {
        case R.id.sign_in_button:
            signIn();
            break;
    }
}

private void signIn() {
    Intent signInIntent = mGoogleSignInClient.getSignInIntent();
    startActivityForResult(signInIntent, RC_SIGN_IN);
}

@Override
public void onActivityResult(int requestCode, int resultCode, Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if (requestCode == RC_SIGN_IN) {
    Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);
        handleSignInResult(task);
    }
}

private void handleSignInResult(Task<GoogleSignInAccount> completedTask) {
    try {
        GoogleSignInAccount account = completedTask.getResult(ApiException.class);
        updateUI(account);
    } catch (ApiException e) {
        Log.w(TAG, "signInResult:failed code=" + e.getStatusCode());
        updateUI(null);
    }
}
---retrieve profile info
GoogleSignInAccount acct = GoogleSignIn.getLastSignedInAccount(getActivity());
if (acct != null) {
  String personName = acct.getDisplayName();
  String personGivenName = acct.getGivenName();
  String personFamilyName = acct.getFamilyName();
  String personEmail = acct.getEmail();
  String personId = acct.getId();
  Uri personPhoto = acct.getPhotoUrl();
}
---sign out button
@Override
public void onClick(View v) {
    switch (v.getId()) {
        case R.id.button_sign_out:
            signOut();
            break;
    }
}
---sign out stuffs
private void signOut() {
    mGoogleSignInClient.signOut()
            .addOnCompleteListener(this, new OnCompleteListener<Void>() {
                @Override
                public void onComplete(@NonNull Task<Void> task) {
                }
            }
}
---disconnect account from google
private void revokeAccess() {
    mGoogleSignInClient.revokeAccess()
            .addOnCompleteListener(this, new OnCompleteListener<Void>() {
                @Override
                public void onComplete(@NonNull Task<Void> task) {
                }
            }
}
---create sign in
GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
        .requestIdToken(getString(R.string.server_client_id))
        .requestEmail()
        .build();
---keep signed in
GoogleSignIn.silentSignIn()
    .addOnCompleteListener(
        this,
        new OnCompleteListener<GoogleSignInAccount>() {
          @Override
          public void onComplete(@NonNull Task<GoogleSignInAccount> task) {
            handleSignInResult(task);
          }
        }
---explicit sign-in
Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);
handleSignInResult(task);
---handle sign-in
private void handleSignInResult(@NonNull Task<GoogleSignInAccount> completedTask) {
    try {
        GoogleSignInAccount account = completedTask.getResult(ApiException.class);
        String idToken = account.getIdToken();

        // TODO(developer): send ID Token to server and validate

        updateUI(account);
    } catch (ApiException e) {
        Log.w(TAG, "handleSignInResult:error", e);
        updateUI(null);
    }
}
---server id validation
HttpClient httpClient = new DefaultHttpClient();
HttpPost httpPost = new HttpPost("https://npcmancer.example.com/tokensignin");

try {
  List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(1);
  nameValuePairs.add(new BasicNameValuePair("idToken", idToken));
  httpPost.setEntity(new UrlEncodedFormEntity(nameValuePairs));

  HttpResponse response = httpClient.execute(httpPost);
  int statusCode = response.getStatusLine().getStatusCode();
  final String responseBody = EntityUtils.toString(response.getEntity());
  Log.i(TAG, "Signed in as: " + responseBody);
} catch (ClientProtocolException e) {
  Log.e(TAG, "Error sending ID token to backend.", e);
} catch (IOException e) {
  Log.e(TAG, "Error sending ID token to backend.", e);
}
---google id validation
import com.google.api.client.googleapis.auth.oauth2.GoogleIdToken;
import com.google.api.client.googleapis.auth.oauth2.GoogleIdToken.Payload;
import com.google.api.client.googleapis.auth.oauth2.GoogleIdTokenVerifier;

...

GoogleIdTokenVerifier verifier = new GoogleIdTokenVerifier.Builder(transport, jsonFactory)
    // Specify the CLIENT_ID of the app that accesses the backend:
    .setAudience(Collections.singletonList(CLIENT_ID))
    // Or, if multiple clients access the backend:
    //.setAudience(Arrays.asList(CLIENT_ID_1, CLIENT_ID_2, CLIENT_ID_3))
    .build();

// (Receive idTokenString by HTTPS POST)

GoogleIdToken idToken = verifier.verify(idTokenString);
if (idToken != null) {
  Payload payload = idToken.getPayload();
  String userId = payload.getSubject();
  System.out.println("User ID: " + userId);
  String email = payload.getEmail();
  boolean emailVerified = Boolean.valueOf(payload.getEmailVerified());
  String name = (String) payload.get("name");
  String pictureUrl = (String) payload.get("picture");
  String locale = (String) payload.get("locale");
  String familyName = (String) payload.get("family_name");
  String givenName = (String) payload.get("given_name");
} else {
  System.out.println("Invalid ID token.");
}

 */
