package constant;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem;
import com.trivialworks.boost.AccountActivity;
import com.trivialworks.boost.HelperRegisterActivity;
import com.trivialworks.boost.R;
import com.trivialworks.boost.RequestListActivity;

/**
 * Created by adament on 23/5/16.
 */
public class BaseActivity extends Activity implements View.OnClickListener {

    public Activity context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context=this;

    }

    public void goToActivity(Class<?> classActivity, Bundle bundle) {

        Intent intent = new Intent(context, classActivity);
        if (bundle != null) {
            intent.putExtra("android.intent.extra.INTENT", bundle);
        }

        context.startActivity(intent);
        context.overridePendingTransition(R.anim.animation_enter_from_right, R.anim.animation_leave_out_to_left);
    }



    protected void gotoActivityWithfinish(Class<?> classActivity, Bundle bundle) {

        Intent intent = new Intent(context, classActivity);
        if (bundle != null) {

            intent.putExtra("android.intent.extra.INTENT", bundle);
        }
        context.startActivity(intent);
        context.finish();
        context.overridePendingTransition(R.anim.animation_enter_from_right, R.anim.animation_leave_out_to_left);
    }



    @Override
    public void onBackPressed() {

        // TODO Auto-generated method stub
        super.onBackPressed();
        context.finish();
        overridePendingTransition(R.anim.exit_animation_enter_from_right, R.anim.exit_animation_leave_to_right);
    }



    protected boolean checkNetworkConnection() {
        ConnectivityManager connectivityManager = (ConnectivityManager) context
                .getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }


    protected void showToastS(String text) {
        Toast t = Toast.makeText(context, text, Toast.LENGTH_SHORT);

        t.show();
    }




    public void setPrefrence(String key, String value) {
        SharedPreferences prefrence = context.getSharedPreferences("Stylist", 0);
        SharedPreferences.Editor editor = prefrence.edit();
        editor.putString(key, value);
        editor.commit();
    }

    public String getPrefrence(String key) {
        SharedPreferences prefrence = context.getSharedPreferences("Stylist", 0);
        String data = prefrence.getString(key, "");
        return data;
    }

    public Boolean getPrefrenceBool(String key) {
        SharedPreferences prefrence = context.getSharedPreferences("Stylist", 0);
        Boolean data = prefrence.getBoolean(key, false);
        return data;
    }

    public void setPrefrenceBool(String key, Boolean value) {
        SharedPreferences prefrence = context.getSharedPreferences("Stylist", 0);
        SharedPreferences.Editor editor = prefrence.edit();
        editor.putBoolean(key, value);
        editor.commit();
    }



    public void clearSharedPreferences() {

        SharedPreferences prefrence = context.getSharedPreferences("Stylist", 0);
        SharedPreferences.Editor editor = prefrence.edit();
        editor.clear();
        editor.commit();
    }



    protected void backClick() {
        ImageView backBtn = (ImageView) this.findViewById(R.id.headerBackButton);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finishActivity();

            }
        });
    }


    protected void finishActivity() {

        hideSoftKeyboard(context);
        context.finish();
        overridePendingTransition(R.anim.exit_animation_enter_from_right, R.anim.exit_animation_leave_to_right);
    }


    public static void hideSoftKeyboard(Activity activity) {
        try {
            InputMethodManager inputManager = (InputMethodManager) activity
                    .getSystemService(Context.INPUT_METHOD_SERVICE);
            if (activity.getCurrentFocus().getWindowToken() != null) {
                inputManager.hideSoftInputFromWindow(activity.getCurrentFocus()
                        .getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }



    protected void setHeading(String heading) {
        TextView headerTitle = (TextView) this.findViewById(R.id.headerHeading);
        headerTitle.setText(heading);

    }

    @Override
    public void onClick(View v) {

    }


    //Adding tab

    protected void addTab(int item){

        AHBottomNavigation bottomNavigation = (AHBottomNavigation) findViewById(R.id.bottom_navigation);

// Create items
        AHBottomNavigationItem item1 = new AHBottomNavigationItem(R.string.tab_helper, R.drawable.helper_selected_icon, R.color.color_fb_blue);
        AHBottomNavigationItem item2 = new AHBottomNavigationItem(R.string.tab_request, R.drawable.request_selected_icon, R.color.color_fb_blue);
        AHBottomNavigationItem item3 = new AHBottomNavigationItem(R.string.tab_account, R.drawable.account_selected_icon, R.color.color_fb_blue);

// Add items
        bottomNavigation.addItem(item1);
        bottomNavigation.addItem(item2);
        bottomNavigation.addItem(item3);

// Set background color
        bottomNavigation.setDefaultBackgroundColor(Color.parseColor("#FEFEFE"));

// Disable the translation inside the CoordinatorLayout
        bottomNavigation.setBehaviorTranslationEnabled(false);

// Change colors
        bottomNavigation.setAccentColor(Color.parseColor("#F63D2B"));
        bottomNavigation.setInactiveColor(Color.parseColor("#747474"));

// Force to tint the drawable (useful for font with icon for example)
        bottomNavigation.setForceTint(true);

// Force the titles to be displayed (against Material Design guidelines!)
        bottomNavigation.setForceTitlesDisplay(true);

// Use colored navigation with circle reveal effect
        bottomNavigation.setColored(true);

// Set current item programmatically
        bottomNavigation.setCurrentItem(item);

// Customize notification (title, background, typeface)
        bottomNavigation.setNotificationBackgroundColor(Color.parseColor("#F63D2B"));

// Add or remove notification for each item
        bottomNavigation.setNotification("4", 1);
        bottomNavigation.setNotification("", 1);

// Set listener
        bottomNavigation.setOnTabSelectedListener(new AHBottomNavigation.OnTabSelectedListener() {
            @Override
            public void onTabSelected(int position, boolean wasSelected) {
                // Do something cool here...

                switch (position){

                    case 0:gotoActivityWithfinish(HelperRegisterActivity.class,null);
                        break;

                    case 1:gotoActivityWithfinish(RequestListActivity.class,null);
                        break;

                    case 2:gotoActivityWithfinish(AccountActivity.class,null);
                        break;
                }
            }
        });
    }




    //class to use image with text using HTML


   public class ImageGetter implements Html.ImageGetter {

        public Drawable getDrawable(String source) {
            int id;
            if (source.equals("small_plus_icon_html.jpg")) {
                id = R.drawable.small_plus_icon_html;

            }else if (source.equals("point_gray_icon.jpg")) {
                id = R.drawable.point_gray_icon;
            }
            else {
                return null;
            }

            Drawable d = getResources().getDrawable(id);
            d.setBounds(0,0,d.getIntrinsicWidth(),d.getIntrinsicHeight());
            return d;
        }
    };

}
