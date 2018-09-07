package com.phantom.wowdialog.Model;

import android.content.Context;

import com.phantom.wowdialog.Pojo.wowDialog;
import com.phantom.wowdialog.Presenter.DialogPresenter;

public interface DialogInteracter {

    void showDialog(Context context, wowDialog dialog, DialogPresenter.OnDialogListners listners);
    void closeDialogNow();
}
