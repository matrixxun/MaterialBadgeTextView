package sample.badgeview.starry.matrixxun.com.materialbadgetextview;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.matrixxun.starry.badgetextview.MenuItemBadge;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);

        MenuItem menuItemMessage = menu.findItem(R.id.menu_message);
        MenuItemBadge.update(this, menuItemMessage,new MenuItemBadge.Builder()
                .iconDrawable(ContextCompat.getDrawable(this, R.drawable.ic_email_md))
                .iconTintColor(Color.WHITE)
                .textBackgroundColor(Color.parseColor("#EF4738"))
                .textColor(Color.WHITE));
        MenuItemBadge.getBadgeTextView(menuItemMessage).setBadgeCount(999);


        MenuItem menuItemShopCart = menu.findItem(R.id.menu_shopcart);
        MenuItemBadge.update(this, menuItemShopCart,new MenuItemBadge.Builder()
                .iconDrawable(ContextCompat.getDrawable(this, R.drawable.ic_shopping_cart_md))
                .iconTintColor(Color.WHITE)
                .textBackgroundColor(Color.parseColor("#FB8C00"))
                .textColor(Color.WHITE));
        MenuItemBadge.getBadgeTextView(menuItemShopCart).setBadgeCount(9);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }else if(id == R.id.menu_message){
            Toast.makeText(this,"Click Message Menu!", Toast.LENGTH_LONG).show();
            return true;
        }else if(id == R.id.menu_shopcart){
            Toast.makeText(this,"Click ShopCart Menu!", Toast.LENGTH_LONG).show();
            return  true;
        }

        return super.onOptionsItemSelected(item);
    }
}
