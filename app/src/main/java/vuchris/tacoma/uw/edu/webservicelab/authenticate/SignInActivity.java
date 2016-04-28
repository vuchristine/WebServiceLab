package vuchris.tacoma.uw.edu.webservicelab.authenticate;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import vuchris.tacoma.uw.edu.webservicelab.R;

public class SignInActivity extends AppCompatActivity implements LoginFragment.LoginInteractionListener {

    private SharedPreferences mSharedPreferences;

    //@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //load login fragment
        getSupportFragmentManager().beginTransaction()
                .add(R.id.fragment_container, new LoginFragment() )
                .commit();

        /*
        //save shared preferences
        mSharedPreferences = getSharedPreferences(getString(R.string.LOGIN_PREFS)
                , Context.MODE_PRIVATE);
        if (!mSharedPreferences.getBoolean(getString(R.string.LOGGEDIN), false)) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragment_container, new LoginFragment())
                    .commit();
        } else {
            Intent i = new Intent(this, CourseActivity.class);
            startActivity(i);
            finish();
        }

        ConnectivityManager connMgr = (ConnectivityManager)
                getActivity().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected()) {

            //Check if the login and password are valid
            //new LoginTask().execute(url);
            try {
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(
                        openFileOutput(getString(R.string.LOGIN_FILE)
                                , Context.MODE_PRIVATE));
                outputStreamWriter.write("email = " + userIdText + ";");
                outputStreamWriter.write("password = " + pwdText);
                outputStreamWriter.close();
                Toast.makeText(this,"Stored in File Successfully!", Toast.LENGTH_LONG)
                        .show();
            } catch (Exception e) {
                e.printStackTrace();
            }

            DownloadCoursesTask task = new DownloadCoursesTask();
            task.execute(new String[]{COURSE_URL});
        }
        else {
            Toast.makeText(view.getContext(),
                    "No network connection available. Cannot display courses",
                    Toast.LENGTH_SHORT) .show();

        }*/

        //return v;
        return null;
    }

    @Override
    public void login(String userId, String pwd) {
/*
        ConnectivityManager connMgr = (ConnectivityManager)
                getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected()) {
            //Check if the login and password are valid
            //new LoginTask().execute(url);
        }
        else {
            Toast.makeText(this, "No network connection available. Cannot authenticate user",
                    Toast.LENGTH_SHORT) .show();
            return;
        }

        mSharedPreferences
                .edit()
                .putBoolean(getString(R.string.LOGGEDIN), true)
                .commit();

        Intent i = new Intent(this, CourseActivity.class);
        startActivity(i);
        finish();*/
    }

/*
    public boolean onOptionsItemSelected()
    {
        if (id == R.id.action_logout) {
            SharedPreferences sharedPreferences =
                    getSharedPreferences(getString(R.string.LOGIN_PREFS), Context.MODE_PRIVATE);
            sharedPreferences.edit().putBoolean(getString(R.string.LOGGEDIN), false)
                    .commit();

            Intent i = new Intent(this, SignInActivity.class);
            startActivity(i);
            finish();
            return true;
        }

        return false;
    }*/

}
