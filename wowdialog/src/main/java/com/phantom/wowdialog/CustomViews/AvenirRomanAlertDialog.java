package com.phantom.wowdialog.CustomViews;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.support.v7.app.AlertDialog;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.TextView;

public class AvenirRomanAlertDialog extends AlertDialog {

    public static final String ANDROID_SCHEMA = "http://schemas.android.com/apk/res/android";

    public AvenirRomanAlertDialog(Context context) {
        super(context);

        applyCustomFont(context);
    }



    private void applyCustomFont(Context context) {
       // Typeface customFont = FontCache.getTypeface("AvenirLTStd-Roman.otf", context);
      /*  Typeface customFont = FontCache.getTypeface("JennaSue.ttf", context);
        this.setOnShowListener(new DialogInterface.OnShowListener() {

            @Override
            public void onShow(DialogInterface dialog) {
                AlertDialog alertDialog = (AlertDialog) dialog;
                Button button = alertDialog.getButton(DialogInterface.BUTTON_POSITIVE);
                button.setTypeface(customFont);

                button = alertDialog.getButton(DialogInterface.BUTTON_NEGATIVE);
                button.setTypeface(customFont);

                button = alertDialog.getButton(DialogInterface.BUTTON_NEUTRAL);
                button.setTypeface(customFont);
            }
        });*/

    }



}
