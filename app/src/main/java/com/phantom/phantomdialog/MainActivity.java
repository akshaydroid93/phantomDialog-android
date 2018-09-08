package com.phantom.phantomdialog;

import android.graphics.Color;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.phantom.wowdialog.Pojo.wowDialog;
import com.phantom.wowdialog.View.DialogActivity;
import com.phantom.wowdialog.View.DialogView;

public class MainActivity extends AppCompatActivity {
    DialogActivity dialogActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        wowDialog dialog = new wowDialog.wowDialogBuilder()
                .setCardHeight(250)
                .setCardContentHeight(250)
                .setMessageBoxBackgroundDrawable(R.drawable.edittext_bg)
                .setMessageBoxTextColor(R.color.cardview_shadow_start_color)
             //   .setHeaderfont(Typeface.createFromAsset(getAssets(), "fonts/greatvibesregular.otf"))
                .setHeaderfont(ResourcesCompat.getFont(this, R.font.greatvibesregular))
                .setMessagefont(ResourcesCompat.getFont(this, R.font.greatvibesregular))
                .setButtonsfont(ResourcesCompat.getFont(this, R.font.greatvibesregular))
                .setNegativeButtonTextSize(35)
                .setMessageBoxDisplayOnly(false)
                .setMessageBoxText("hello")
                .setMessageBoxTextGravity(Gravity.TOP|Gravity.CENTER)
                .setMessageBoxTextColor(android.R.color.holo_red_dark)
                .setMessageBoxTextLimit(100)
                .setMessageBoxTextSize(30)
                .setNegativeButtonTextColor(android.R.color.holo_red_dark)
               /* .setCardWidth(100)
                .setCardRadius(50)*/
                .setCardBackgroundImage(R.drawable.images)
                .setCardBackgroundImageScaleType(ImageView.ScaleType.CENTER_CROP)
                .setCardBackgroundColor(R.color.colorPrimaryDark)
                .setPositiveButtonText("pos")
                .setNegativeButtonText("neg")
                .setHeaderText("Akshay")
                .setHeaderTextColor(Color.RED)
                .setHeaderTextSize(30)
                /*.setNegativeButtonIcon(R.drawable.error)*/
                .setNegativeButtonIconHeight(30)
                .setNegativeButtonIconWidth(30)
                .setPositiveButtonIconHeight(30)
                .setPositiveButtonIconWidth(30)
                .setDividerColor(R.color.colorAccent)
                .setDividerVisibility(View.GONE)
                .setNegativeButtonIconColor(R.color.colorAccent)
                .setPositiveButtonIconColor(android.R.color.holo_blue_dark)
                .setNegativeButtonIcon(R.drawable.error)
                .setPositiveButtonIcon(R.drawable.verified)
                .setButtonsGravity(Gravity.RIGHT)
                .showWowDialog();


            dialogActivity  = new DialogActivity(this,dialog,new DialogView.onDialogButtonClickListeners() {

            @Override
            public void onPositiveButtonClick() {

                Toast.makeText(MainActivity.this, "Button clicked !", Toast.LENGTH_SHORT).show();
                dialogActivity.closeDialog();
            }

            @Override
            public void onNegativeButtonClick() {

            }

            @Override
            public void onTextChange(CharSequence s, int start, int before, int count) {

            }
        });
dialogActivity.closeDialog();
        dialogActivity.show_toast("hello",this);





    }
}
