package com.phantom.wowdialog.View;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.phantom.wowdialog.Model.DialogInteracterImpl;
import com.phantom.wowdialog.Pojo.wowDialog;
import com.phantom.wowdialog.Presenter.DialogPresenter;
import com.phantom.wowdialog.Presenter.DialogPresenterImpl;
import com.phantom.wowdialog.R;

public class DialogActivity extends AppCompatActivity implements DialogView,DialogView.onDialogButtonClickListeners{

    Context context;
    DialogPresenter dialogPresenter;
    DialogView.onDialogButtonClickListeners onDialogButtonClickListeners;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
    }

    public DialogActivity(Context context, wowDialog dialog, onDialogButtonClickListeners onDialogButtonClickListeners) {
        this.context = context;
        this.onDialogButtonClickListeners = onDialogButtonClickListeners;
        dialogPresenter = new DialogPresenterImpl(context, new DialogInteracterImpl() ,dialog, onDialogButtonClickListeners );

    }

    public void show_toast(String s, Context context){

      //  Toast.makeText(context, "hehehehe", Toast.LENGTH_SHORT).show();
        dialogPresenter.ValidateData();
    }

    @Override
    public void onSuccess() {

    }

    @Override
    public void onFailuer() {

    }

    @Override
    public void onPositiveButtonClick() {

    }

    @Override
    public void onNegativeButtonClick() {

    }

    @Override
    public void onTextChange(CharSequence s, int start, int before, int count) {

    }

    public void closeDialog(){
        dialogPresenter.Close();
    }
}
