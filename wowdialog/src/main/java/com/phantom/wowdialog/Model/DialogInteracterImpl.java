package com.phantom.wowdialog.Model;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.CardView;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.phantom.wowdialog.CustomViews.AvenirRomanAlertDialog;
import com.phantom.wowdialog.Pojo.wowDialog;
import com.phantom.wowdialog.Presenter.DialogPresenter;
import com.phantom.wowdialog.R;

public class DialogInteracterImpl implements DialogInteracter {

    AlertDialog alertDialog;

    @Override
    public void showDialog(final Context context, wowDialog dialog, final DialogPresenter.OnDialogListners listners) {

        AvenirRomanAlertDialog.Builder dialogBuilder = new AvenirRomanAlertDialog.Builder(context);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        final View dialogView = inflater.inflate(R.layout.custom_dialog, null);
        dialogBuilder.setView(dialogView);


        final EditText etMessageBox = dialogView.findViewById(R.id.edit1);
        final ImageView ivDone = dialogView.findViewById(R.id.ivDone);
        final ImageView ivImg = dialogView.findViewById(R.id.ivImg);
        final ImageView ivCancel = dialogView.findViewById(R.id.ivCancel);
        final TextView tvInfo = dialogView.findViewById(R.id.tvInfo);
        final TextView tvHeader = dialogView.findViewById(R.id.tvHeader);
        final View view = dialogView.findViewById(R.id.view);
        final TextView tvCancel = dialogView.findViewById(R.id.tvCancel);
        final TextView tvDone = dialogView.findViewById(R.id.tvDone);
        final CardView cvcardview = dialogView.findViewById(R.id.cvcardview);
        final RelativeLayout rvcontainer = dialogView.findViewById(R.id.rvcontainer);
        final LinearLayout llButtons = dialogView.findViewById(R.id.llButtons);
        DisplayMetrics displaymetrics = new DisplayMetrics();
        // int dp = (int) TypedValue.applyDimension( TypedValue.COMPLEX_UNIT_DIP, 250, displaymetrics )

        setPositiveButton(context, tvDone, ivDone, dialog);
        setNegativeButton(context, tvCancel, ivCancel, dialog);
        setSetHeader(context, tvHeader, dialog);
        setSetDivider(context, view, dialog);
        setMessageBox(context, etMessageBox, dialog,listners);
        final AlertDialog b = dialogBuilder.create();
        alertDialog = b;
        setCardview(context, cvcardview, rvcontainer,ivImg, dialog, b);

       /* if (dialog.getCardBackgroundColor() != 0) {
            cvcardview.setCardBackgroundColor(dialog.getCardBackgroundColor());

        }
        if (dialog.getPositiveButtonIcon() != 0) {
            ivDone.setImageResource(dialog.getPositiveButtonIcon());
            tvDone.setVisibility(View.INVISIBLE);
        }
        if (dialog.getNegativeButtonIcon() != 0) {
            ivCancel.setImageResource(dialog.getNegativeButtonIcon());
            tvCancel.setVisibility(View.INVISIBLE);
        }
        if (dialog.getButtonsGravity() != 0) {
            llButtons.setGravity(dialog.getButtonsGravity());
        }


        if (dialog.getNegativeButtonText() != null) {
            tvCancel.setText(dialog.getNegativeButtonText());
        }*/

      /*  tvInfo.setText("It seems like you have not given TraveLibro the access to your photo gallery. Kindly allow the access.");
        etMessageBox.setVisibility(View.GONE);
        tvInfo.setVisibility(View.VISIBLE);
        tvHeader.setVisibility(View.VISIBLE);
        //  txt.setText("Grant Access to Location");
        tvHeader.setText("Grant Access to Library");*/


        //    tvCancel.setText("Cancel");
        // tvCancel.setVisibility(View.GONE);

        tvCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //  b.dismiss();
                listners.OnSecondButtonClick();
            }
        });
        tvCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //  b.dismiss();
                listners.OnSecondButtonClick();
            }
        });
        tvDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             //   b.dismiss();
                listners.OnFirstButtonClick();
                // ActivityCompat.requestPermissions((Activity) context, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, MY_PERMISSIONS_REQUEST_READ_EXTERNAL_STORAGE);

            }
        });
        ivDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             //   b.dismiss();
                listners.OnFirstButtonClick();
                // ActivityCompat.requestPermissions((Activity) context, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, MY_PERMISSIONS_REQUEST_READ_EXTERNAL_STORAGE);

            }
        });


        //  b.getWindow().setBackgroundDrawableResource(R.drawable.bg_shape_rectangle_white_full_dialog);
        //  b.getWindow().getAttributes().windowAnimations = R.style.AdobeImageWidget_DialogAnimation_Fade;
        //b.getWindow().addFlags(WindowManager.LayoutParams.FLAG_BLUR_BEHIND);
        b.show();


    }

    @Override
    public void closeDialogNow() {
        alertDialog.dismiss();

    }

    private void setCardview(Context context, CardView cvcardview, RelativeLayout rvcontainer, ImageView ivImg, wowDialog dialog, AlertDialog b) {

        if (dialog.getCardContentHeight() > 190) {
            rvcontainer.getLayoutParams().height = dpToPx(context, dialog.getCardContentHeight());
        }
        if (dialog.getCardRadius() != 0) {
            cvcardview.setRadius(dialog.getCardRadius());
        }
        if (dialog.getCardBackgroundColor() != 0) {
            try {
                cvcardview.setCardBackgroundColor(context.getResources().getColor(dialog.getCardBackgroundColor()));
            } catch (Exception e) {
                try {
                    cvcardview.setCardBackgroundColor(dialog.getCardBackgroundColor());
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
                e.printStackTrace();
            }
        }
        if (dialog.getCardElevation() != 0) {
            cvcardview.setCardElevation(dialog.getCardElevation());
        }
        if (dialog.getCardHeight() > 190) {
            WindowManager.LayoutParams lp = new WindowManager.LayoutParams();
            lp.copyFrom(b.getWindow().getAttributes());
            lp.height = dpToPx(context, dialog.getCardHeight());
            b.getWindow().setAttributes(lp);
            b.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        }
        if (dialog.getCardBackgroundImage() != 0) {
            try {
               // cvcardview.setCardBackgroundColor(context.getResources().getColor(android.R.color.transparent));
                ivImg.setImageResource(dialog.getCardBackgroundImage());
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        if (dialog.getCardBackgroundImageScaleType() != null) {
            try {
                ivImg.setScaleType(dialog.getCardBackgroundImageScaleType());
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    private void setMessageBox(Context context, EditText etMessageBox, wowDialog dialog, final DialogPresenter.OnDialogListners listners) {
        if(dialog.getMessageBoxTextLimit() != 0){
            etMessageBox.setFilters(new InputFilter[] { new InputFilter.LengthFilter(dialog.getMessageBoxTextLimit()) });
        }
        if(dialog.getMessagefont() != null){
            etMessageBox.setTypeface(dialog.getMessagefont());
        }
        if(dialog.getMessageBoxTextGravity() != 0){
            etMessageBox.setGravity(dialog.getMessageBoxTextGravity());
        }
        if (dialog.getMessageBoxVisibility() != 0) {
            etMessageBox.setVisibility(dialog.getMessageBoxVisibility());
        }
        if (dialog.getMessageBoxText() != null) {
            etMessageBox.setText(dialog.getMessageBoxText());
        }
        if (dialog.getMessageBoxTextColor() != 0) {

            try {

                // tvCancel.setTextColor(context.getResources().getColor(dialog.getNegativeButtonTextColor()));
                etMessageBox.setTextColor(context.getResources().getColor(dialog.getMessageBoxTextColor()));
            }catch (Exception e){

                try {
                    etMessageBox.setTextColor(dialog.getMessageBoxTextColor());
                }catch (Exception e1){

                }
            }
          //  etMessageBox.setTextColor(dialog.getMessageBoxTextColor());
        }else {
            Toast.makeText(context, "afeEf", Toast.LENGTH_SHORT).show();
        }
        if (dialog.getMessageBoxDisplayOnly() != null) {
            etMessageBox.setFocusable(!dialog.getMessageBoxDisplayOnly());
        }
        if (dialog.getMessageBoxBackgroundDrawable() != 0) {
            etMessageBox.setBackgroundResource(dialog.getMessageBoxBackgroundDrawable());
        //    etMessageBox.getBackground().setColorFilter(Color.RED, PorterDuff.Mode.SRC_ATOP);
        }else {
            Toast.makeText(context, "afeEf", Toast.LENGTH_SHORT).show();
        }
        if (dialog.getMessageBoxTextHint() != 0) {
            etMessageBox.setHint(dialog.getMessageBoxTextHint());
        }
        if (dialog.getMessageBoxTextHintColor() != 0) {
            etMessageBox.setHintTextColor(dialog.getMessageBoxTextHintColor());
        }
        if (dialog.getMessageBoxTextSize() != 0) {
            etMessageBox.setTextSize(dialog.getMessageBoxTextSize());
        }

        etMessageBox.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                listners.OnThirdButtonClick(s,start,before,count);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }

    private void setSetDivider(Context context, View view, wowDialog dialog) {

        if (dialog.getDividerColor() != 0) {
            try {

                // tvCancel.setTextColor(context.getResources().getColor(dialog.getNegativeButtonTextColor()));
                view.setBackgroundColor(context.getResources().getColor(dialog.getDividerColor()));
            }catch (Exception e){

                try {
                    view.setBackgroundColor(dialog.getDividerColor());
                }catch (Exception e1){

                }
            }
           // view.setBackgroundColor(dialog.getDividerColor());
        }
        if (dialog.getDividerVisibility() != 0) {
            view.setVisibility(dialog.getDividerColor());
        }else {
            Toast.makeText(context, "efwef", Toast.LENGTH_SHORT).show();
        }

    }

    private void setSetHeader(Context context, TextView tvHeader, wowDialog dialog) {

        if(dialog.getHeaderfont() != null){
            tvHeader.setTypeface(dialog.getHeaderfont());
        }
        if (dialog.getHeaderText() != null) {
            tvHeader.setText(dialog.getHeaderText());
        }
        if (dialog.getHeaderTextColor() != 0) {
            try {
                tvHeader.setTextColor((ContextCompat.getColor(context, dialog.getHeaderTextColor())));
            } catch (Exception e) {
                e.printStackTrace();
                try {
                    tvHeader.setTextColor(dialog.getHeaderTextColor());
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        }
        if (dialog.getHeaderTextSize() != 0) {
            tvHeader.setTextSize(dialog.getHeaderTextSize());
        }
        if (dialog.getHeaderTextVisibility() != 0) {
            tvHeader.setVisibility(dialog.getHeaderTextVisibility());
        }
    }

    private void setPositiveButton(Context context, TextView tvDone, ImageView ivDone, wowDialog dialog) {
        if(dialog.getButtonsfont() != null){
            tvDone.setTypeface(dialog.getButtonsfont());
        }
        if (dialog.getPositiveButtonText() != null) {
            tvDone.setText(dialog.getPositiveButtonText());
        }
        if (dialog.getPositiveButtonTextColor() != 0) {
            tvDone.setTextColor(dialog.getPositiveButtonTextColor());
        }
        if (dialog.getPositiveButtonTextSize() != 0) {
            tvDone.setTextSize( dialog.getPositiveButtonTextSize());
        }
        if (dialog.getPositiveButtonIcon() != 0) {
            ivDone.setImageResource(dialog.getPositiveButtonIcon());
            ivDone.setVisibility(View.VISIBLE);
            tvDone.setVisibility(View.GONE);
        }
        if (dialog.getPositiveButtonVisibility() != 0) {
            ivDone.setVisibility(dialog.getPositiveButtonVisibility());
            tvDone.setVisibility(dialog.getPositiveButtonVisibility());
        }
        if (dialog.getPositiveButtonIconHeight() != 0) {
            ivDone.getLayoutParams().height = dpToPx(context, dialog.getPositiveButtonIconHeight());
        }
        if (dialog.getPositiveButtonIconWidth() != 0) {
            ivDone.getLayoutParams().width = dpToPx(context, dialog.getPositiveButtonIconWidth());
        }
        if (dialog.getPositiveButtonIconColor() != 0) {
            try {

                // tvCancel.setTextColor(context.getResources().getColor(dialog.getNegativeButtonTextColor()));
                ivDone.setColorFilter(context.getResources().getColor(dialog.getPositiveButtonIconColor()), android.graphics.PorterDuff.Mode.MULTIPLY);
            }catch (Exception e){

                try {
                    ivDone.setColorFilter(dialog.getPositiveButtonIconColor(), android.graphics.PorterDuff.Mode.MULTIPLY);
                }catch (Exception e1){

                }
            }
           // ivDone.setColorFilter(dialog.getPositiveButtonIconColor(), android.graphics.PorterDuff.Mode.MULTIPLY);
        }
    }

    private void setNegativeButton(Context context, TextView tvCancel, ImageView ivCancel, wowDialog dialog) {
        if(dialog.getButtonsfont() != null){
            tvCancel.setTypeface(dialog.getButtonsfont());
        }
        if (dialog.getNegativeButtonText() != null) {
            tvCancel.setText(dialog.getNegativeButtonText());
        }
        if (dialog.getNegativeButtonTextColor() != 0) {
            try {

                tvCancel.setTextColor(context.getResources().getColor(dialog.getNegativeButtonTextColor()));
            }catch (Exception e){

                try {
                    tvCancel.setTextColor(dialog.getNegativeButtonTextColor());
                }catch (Exception e1){

                }
            }
        }
        if (dialog.getNegativeButtonTextSize() != 0) {
            tvCancel.setTextSize( dialog.getNegativeButtonTextSize());
        }
        if (dialog.getNegativeButtonIcon() != 0) {
            ivCancel.setImageResource(dialog.getNegativeButtonIcon());
            ivCancel.setVisibility(View.VISIBLE);
            tvCancel.setVisibility(View.GONE);
        }
        if (dialog.getNegativeButtonVisibility() != 0) {
            ivCancel.setVisibility(dialog.getNegativeButtonVisibility());
            tvCancel.setVisibility(dialog.getNegativeButtonVisibility());
        }
        if (dialog.getNegativeButtonIconHeight() != 0) {
            ivCancel.getLayoutParams().height = dpToPx(context, dialog.getNegativeButtonIconHeight());
        }
        if (dialog.getNegativeButtonIconWidth() != 0) {
            ivCancel.getLayoutParams().width = dpToPx(context, dialog.getNegativeButtonIconWidth());
        }
        if (dialog.getNegativeButtonIconColor() != 0) {
            try {

               // tvCancel.setTextColor(context.getResources().getColor(dialog.getNegativeButtonTextColor()));
                ivCancel.setColorFilter(context.getResources().getColor(dialog.getNegativeButtonIconColor()), android.graphics.PorterDuff.Mode.MULTIPLY);
            }catch (Exception e){

                try {
                    ivCancel.setColorFilter(context.getResources().getColor(dialog.getNegativeButtonIconColor()), android.graphics.PorterDuff.Mode.MULTIPLY);
                }catch (Exception e1){

                }
            }

        }
    }

    private void Update_ui(wowDialog dialog) {
    }

    public int dpToPx(Context context, int dp) {
        return (int) (dp * context.getResources().getSystem().getDisplayMetrics().density);
    }
}
