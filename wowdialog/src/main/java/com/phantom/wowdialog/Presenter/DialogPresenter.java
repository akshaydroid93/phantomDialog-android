package com.phantom.wowdialog.Presenter;

public interface DialogPresenter {

    void ValidateData();

    void Close();

    interface OnDialogListners{
        void OnFirstButtonClick();
        void OnSecondButtonClick();
        void OnThirdButtonClick(CharSequence s, int start, int before, int count);
    }
}
