package com.phantom.wowdialog.Presenter;

import android.content.Context;

import com.phantom.wowdialog.Model.DialogInteracterImpl;
import com.phantom.wowdialog.Pojo.wowDialog;
import com.phantom.wowdialog.View.DialogView;

public class DialogPresenterImpl implements DialogPresenter, DialogPresenter.OnDialogListners{

    Context  context;
    DialogInteracterImpl dialogInteracter;
    DialogView.onDialogButtonClickListeners listeners;
    wowDialog dialog;


    public DialogPresenterImpl(Context context, DialogInteracterImpl dialogInteracter, wowDialog dialog, DialogView.onDialogButtonClickListeners onDialogButtonClickListeners) {
        this.context = context;
        this.dialogInteracter = dialogInteracter;
        this.listeners = onDialogButtonClickListeners;
        this.dialog = dialog;
    }

    @Override
    public void ValidateData() {
        dialogInteracter.showDialog(context,dialog,this);

    }

    @Override
    public void Close() {
        dialogInteracter.closeDialogNow();
    }

    @Override
    public void OnFirstButtonClick() {
        listeners.onPositiveButtonClick();

    }

    @Override
    public void OnSecondButtonClick() {
        listeners.onNegativeButtonClick();
    }

    @Override
    public void OnThirdButtonClick(CharSequence s, int start, int before, int count) {
        listeners.onTextChange( s,  start,  before,  count);
    }
}
