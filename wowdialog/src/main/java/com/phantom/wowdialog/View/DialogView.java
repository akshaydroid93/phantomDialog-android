package com.phantom.wowdialog.View;

public interface DialogView {

    void onSuccess();
    void onFailuer();
    interface onDialogButtonClickListeners{
        void onPositiveButtonClick();
        void onNegativeButtonClick();
        void onTextChange(CharSequence s, int start, int before, int count);
    }
}
