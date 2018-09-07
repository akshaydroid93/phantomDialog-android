package com.phantom.wowdialog.Pojo;

import android.graphics.Typeface;
import android.widget.ImageView;

public class wowDialog {

    private Typeface Headerfont;
    private Typeface Messagefont;
    private Typeface Buttonsfont;

    private int cardRadius;
    private int cardElevation;
    private int cardBackgroundColor;
    private int cardHeight;
    private int cardContentHeight;
    private int cardWidth;
    private int cardMargin;
    private int cardBackgroundImage;
    private ImageView.ScaleType cardBackgroundImageScaleType;


    private String messageBoxText;
    private int messageBoxTextHint;
    private int messageBoxTextHintColor;
    private int messageBoxTextSize;
    private int messageBoxTextColor;
    private int messageBoxTextLimit;
    private int messageBoxTextGravity;
    private int messageBoxVisibility;
    private int messageBoxBackgroundDrawable;
    private Boolean messageBoxDisplayOnly;


    private int dividerColor;
    private int dividerVisibility;


    private String headerText;
    private int headerTextSize;
    private int headerTextColor;
    private int headerTextVisibility;


    private int positiveButtonIcon;
    private int positiveButtonVisibility;
    private int positiveButtonIconHeight;
    private int positiveButtonIconWidth;
    private int positiveButtonIconColor;
    private String positiveButtonText;
    private int positiveButtonTextColor;
    private int positiveButtonTextSize;


    private int negativeButtonIcon;
    private int negativeButtonVisibility;
    private int negativeButtonIconHeight;
    private int negativeButtonIconWidth;
    private int negativeButtonIconColor;
    private String negativeButtonText;
    private int negativeButtonTextColor;
    private int negativeButtonTextSize;


    private int buttonsGravity;

    public wowDialog(wowDialogBuilder dialogBuilder) {
        this.Headerfont = dialogBuilder.Headerfont;
        this.messageBoxTextLimit = dialogBuilder.messageBoxTextLimit;
        this.Messagefont = dialogBuilder.Messagefont;
        this.Buttonsfont = dialogBuilder.Buttonsfont;
        this.cardRadius = dialogBuilder.cardRadius;
        this.cardElevation = dialogBuilder.cardElevation;
        this.cardBackgroundColor = dialogBuilder.cardBackgroundColor;
        this.cardHeight = dialogBuilder.cardHeight;
        this.cardContentHeight = dialogBuilder.cardContentHeight;
        this.cardWidth = dialogBuilder.cardWidth;
        this.cardMargin = dialogBuilder.cardMargin;
        this.cardBackgroundImage = dialogBuilder.cardBackgroundImage;
        this.cardBackgroundImageScaleType = dialogBuilder.cardBackgroundImageScaleType;
        this.messageBoxText = dialogBuilder.messageBoxText;
        this.messageBoxTextHint = dialogBuilder.messageBoxTextHint;
        this.messageBoxTextHintColor = dialogBuilder.messageBoxTextHintColor;
        this.messageBoxTextSize = dialogBuilder.messageBoxTextSize;
        this.messageBoxTextColor = dialogBuilder.messageBoxTextColor;
        this.messageBoxVisibility = dialogBuilder.messageBoxVisibility;
        this.messageBoxBackgroundDrawable = dialogBuilder.messageBoxBackgroundDrawable;
        this.messageBoxDisplayOnly = dialogBuilder.messageBoxDisplayOnly;
        this.dividerColor = dialogBuilder.dividerColor;
        this.dividerVisibility = dialogBuilder.dividerVisibility;
        this.headerText = dialogBuilder.headerText;
        this.headerTextSize = dialogBuilder.headerTextSize;
        this.headerTextColor = dialogBuilder.headerTextColor;
        this.headerTextVisibility = dialogBuilder.headerTextVisibility;
        this.positiveButtonIcon = dialogBuilder.positiveButtonIcon;
        this.positiveButtonVisibility = dialogBuilder.positiveButtonVisibility;
        this.positiveButtonIconHeight = dialogBuilder.positiveButtonIconHeight;
        this.positiveButtonIconWidth = dialogBuilder.positiveButtonIconWidth;
        this.positiveButtonIconColor = dialogBuilder.positiveButtonIconColor;
        this.positiveButtonText = dialogBuilder.positiveButtonText;
        this.positiveButtonTextColor = dialogBuilder.positiveButtonTextColor;
        this.positiveButtonTextSize = dialogBuilder.positiveButtonTextSize;
        this.negativeButtonIcon = dialogBuilder.negativeButtonIcon;
        this.negativeButtonVisibility = dialogBuilder.negativeButtonVisibility;
        this.negativeButtonIconHeight = dialogBuilder.negativeButtonIconHeight;
        this.negativeButtonIconWidth = dialogBuilder.negativeButtonIconWidth;
        this.negativeButtonIconColor = dialogBuilder.negativeButtonIconColor;
        this.negativeButtonText = dialogBuilder.negativeButtonText;
        this.negativeButtonTextColor = dialogBuilder.negativeButtonTextColor;
        this.negativeButtonTextSize = dialogBuilder.negativeButtonTextSize;
        this.buttonsGravity = dialogBuilder.buttonsGravity;
        this.messageBoxTextGravity = dialogBuilder.messageBoxTextGravity;
    }




    public wowDialog(int cardRadius, int cardElevation, int cardBackgroundColor, int cardHeight, int cardWidth, int cardMargin) {
        this.cardRadius = cardRadius;
        this.cardElevation = cardElevation;
        this.cardBackgroundColor = cardBackgroundColor;
        this.cardHeight = cardHeight;
        this.cardWidth = cardWidth;
        this.cardMargin = cardMargin;
    }

    public int getMessageBoxTextLimit() {
        return messageBoxTextLimit;
    }

    public void setMessageBoxTextLimit(int messageBoxTextLimit) {
        this.messageBoxTextLimit = messageBoxTextLimit;
    }

    public int getMessageBoxTextGravity() {
        return messageBoxTextGravity;
    }

    public void setMessageBoxTextGravity(int messageBoxTextGravity) {
        this.messageBoxTextGravity = messageBoxTextGravity;
    }

    public int getCardBackgroundImage() {
        return cardBackgroundImage;
    }

    public void setCardBackgroundImage(int cardBackgroundImage) {
        this.cardBackgroundImage = cardBackgroundImage;
    }

    public int getCardContentHeight() {
        return cardContentHeight;
    }

    public void setCardContentHeight(int cardContentHeight) {
        this.cardContentHeight = cardContentHeight;
    }

    public int getMessageBoxTextHint() {
        return messageBoxTextHint;
    }

    public void setMessageBoxTextHint(int messageBoxTextHint) {
        this.messageBoxTextHint = messageBoxTextHint;
    }

    public int getMessageBoxTextHintColor() {
        return messageBoxTextHintColor;
    }

    public void setMessageBoxTextHintColor(int messageBoxTextHintColor) {
        this.messageBoxTextHintColor = messageBoxTextHintColor;
    }

    public Boolean getMessageBoxDisplayOnly() {
        return messageBoxDisplayOnly;
    }

    public void setMessageBoxDisplayOnly(Boolean messageBoxDisplayOnly) {
        this.messageBoxDisplayOnly = messageBoxDisplayOnly;
    }

    public int getCardRadius() {
        return cardRadius;
    }

    public void setCardRadius(int cardRadius) {
        this.cardRadius = cardRadius;
    }

    public int getCardElevation() {
        return cardElevation;
    }

    public void setCardElevation(int cardElevation) {
        this.cardElevation = cardElevation;
    }

    public int getCardBackgroundColor() {
        return cardBackgroundColor;
    }

    public void setCardBackgroundColor(int cardBackgroundColor) {
        this.cardBackgroundColor = cardBackgroundColor;
    }

    public int getCardHeight() {
        return cardHeight;
    }

    public void setCardHeight(int cardHeight) {
        this.cardHeight = cardHeight;
    }

    public int getCardWidth() {
        return cardWidth;
    }

    public void setCardWidth(int cardWidth) {
        this.cardWidth = cardWidth;
    }

    public int getCardMargin() {
        return cardMargin;
    }

    public void setCardMargin(int cardMargin) {
        this.cardMargin = cardMargin;
    }

    public String getMessageBoxText() {
        return messageBoxText;
    }

    public void setMessageBoxText(String messageBoxText) {
        this.messageBoxText = messageBoxText;
    }

    public int getMessageBoxTextSize() {
        return messageBoxTextSize;
    }

    public void setMessageBoxTextSize(int messageBoxTextSize) {
        this.messageBoxTextSize = messageBoxTextSize;
    }

    public int getMessageBoxTextColor() {
        return messageBoxTextColor;
    }

    public void setMessageBoxTextColor(int messageBoxTextColor) {
        this.messageBoxTextColor = messageBoxTextColor;
    }

    public int getMessageBoxVisibility() {
        return messageBoxVisibility;
    }

    public void setMessageBoxVisibility(int messageBoxVisibility) {
        this.messageBoxVisibility = messageBoxVisibility;
    }

    public int getMessageBoxBackgroundDrawable() {
        return messageBoxBackgroundDrawable;
    }

    public void setMessageBoxBackgroundDrawable(int messageBoxBackgroundDrawable) {
        this.messageBoxBackgroundDrawable = messageBoxBackgroundDrawable;
    }

    public int getDividerColor() {
        return dividerColor;
    }

    public void setDividerColor(int dividerColor) {
        this.dividerColor = dividerColor;
    }

    public int getDividerVisibility() {
        return dividerVisibility;
    }

    public void setDividerVisibility(int dividerVisibility) {
        this.dividerVisibility = dividerVisibility;
    }

    public String getHeaderText() {
        return headerText;
    }

    public void setHeaderText(String headerText) {
        this.headerText = headerText;
    }

    public int getHeaderTextSize() {
        return headerTextSize;
    }

    public void setHeaderTextSize(int headerTextSize) {
        this.headerTextSize = headerTextSize;
    }

    public int getHeaderTextColor() {
        return headerTextColor;
    }

    public void setHeaderTextColor(int headerTextColor) {
        this.headerTextColor = headerTextColor;
    }

    public int getHeaderTextVisibility() {
        return headerTextVisibility;
    }

    public void setHeaderTextVisibility(int headerTextVisibility) {
        this.headerTextVisibility = headerTextVisibility;
    }

    public int getPositiveButtonIcon() {
        return positiveButtonIcon;
    }

    public void setPositiveButtonIcon(int positiveButtonIcon) {
        this.positiveButtonIcon = positiveButtonIcon;
    }

    public int getPositiveButtonVisibility() {
        return positiveButtonVisibility;
    }

    public void setPositiveButtonVisibility(int positiveButtonVisibility) {
        this.positiveButtonVisibility = positiveButtonVisibility;
    }

    public int getPositiveButtonIconHeight() {
        return positiveButtonIconHeight;
    }

    public void setPositiveButtonIconHeight(int positiveButtonIconHeight) {
        this.positiveButtonIconHeight = positiveButtonIconHeight;
    }

    public int getPositiveButtonIconWidth() {
        return positiveButtonIconWidth;
    }

    public void setPositiveButtonIconWidth(int positiveButtonIconWidth) {
        this.positiveButtonIconWidth = positiveButtonIconWidth;
    }

    public int getPositiveButtonIconColor() {
        return positiveButtonIconColor;
    }

    public void setPositiveButtonIconColor(int positiveButtonIconColor) {
        this.positiveButtonIconColor = positiveButtonIconColor;
    }

    public String getPositiveButtonText() {
        return positiveButtonText;
    }

    public void setPositiveButtonText(String positiveButtonText) {
        this.positiveButtonText = positiveButtonText;
    }

    public int getPositiveButtonTextColor() {
        return positiveButtonTextColor;
    }

    public void setPositiveButtonTextColor(int positiveButtonTextColor) {
        this.positiveButtonTextColor = positiveButtonTextColor;
    }

    public int getPositiveButtonTextSize() {
        return positiveButtonTextSize;
    }

    public void setPositiveButtonTextSize(int positiveButtonTextSize) {
        this.positiveButtonTextSize = positiveButtonTextSize;
    }

    public int getNegativeButtonIcon() {
        return negativeButtonIcon;
    }

    public void setNegativeButtonIcon(int negativeButtonIcon) {
        this.negativeButtonIcon = negativeButtonIcon;
    }

    public int getNegativeButtonVisibility() {
        return negativeButtonVisibility;
    }

    public void setNegativeButtonVisibility(int negativeButtonVisibility) {
        this.negativeButtonVisibility = negativeButtonVisibility;
    }

    public int getNegativeButtonIconHeight() {
        return negativeButtonIconHeight;
    }

    public void setNegativeButtonIconHeight(int negativeButtonIconHeight) {
        this.negativeButtonIconHeight = negativeButtonIconHeight;
    }

    public int getNegativeButtonIconWidth() {
        return negativeButtonIconWidth;
    }

    public void setNegativeButtonIconWidth(int negativeButtonIconWidth) {
        this.negativeButtonIconWidth = negativeButtonIconWidth;
    }

    public int getNegativeButtonIconColor() {
        return negativeButtonIconColor;
    }

    public void setNegativeButtonIconColor(int negativeButtonIconColor) {
        this.negativeButtonIconColor = negativeButtonIconColor;
    }

    public String getNegativeButtonText() {
        return negativeButtonText;
    }

    public void setNegativeButtonText(String negativeButtonText) {
        this.negativeButtonText = negativeButtonText;
    }

    public int getNegativeButtonTextColor() {
        return negativeButtonTextColor;
    }

    public void setNegativeButtonTextColor(int negativeButtonTextColor) {
        this.negativeButtonTextColor = negativeButtonTextColor;
    }

    public int getNegativeButtonTextSize() {
        return negativeButtonTextSize;
    }

    public void setNegativeButtonTextSize(int negativeButtonTextSize) {
        this.negativeButtonTextSize = negativeButtonTextSize;
    }

    public int getButtonsGravity() {
        return buttonsGravity;
    }

    public void setButtonsGravity(int buttonsGravity) {
        this.buttonsGravity = buttonsGravity;
    }

    public ImageView.ScaleType getCardBackgroundImageScaleType() {
        return cardBackgroundImageScaleType;
    }

    public void setCardBackgroundImageScaleType(ImageView.ScaleType cardBackgroundImageScaleType) {
        this.cardBackgroundImageScaleType = cardBackgroundImageScaleType;
    }

    public Typeface getHeaderfont() {
        return Headerfont;
    }

    public void setHeaderfont(Typeface headerfont) {
        Headerfont = headerfont;
    }

    public Typeface getMessagefont() {
        return Messagefont;
    }

    public void setMessagefont(Typeface messagefont) {
        Messagefont = messagefont;
    }

    public Typeface getButtonsfont() {
        return Buttonsfont;
    }

    public void setButtonsfont(Typeface buttonsfont) {
        Buttonsfont = buttonsfont;
    }

    public static class wowDialogBuilder {

        private Typeface Headerfont;
        private Typeface Messagefont;
        private Typeface Buttonsfont;

        private int cardRadius;
        private int cardElevation;
        private int cardBackgroundColor;
        private int cardHeight;
        private int cardWidth;
        private int cardMargin;
        private int cardContentHeight;
        private int cardBackgroundImage;
        private ImageView.ScaleType cardBackgroundImageScaleType;

        private String messageBoxText;
        private int messageBoxTextHint;
        private int messageBoxTextHintColor;
        private int messageBoxTextSize;
        private int messageBoxTextLimit;
        private int messageBoxTextColor;
        private int messageBoxTextGravity;
        private int messageBoxVisibility;
        private int messageBoxBackgroundDrawable;

        private Boolean messageBoxDisplayOnly;


        private int dividerColor;
        private int dividerVisibility;


        private String headerText;
        private int headerTextSize;
        private int headerTextColor;
        private int headerTextVisibility;


        private int positiveButtonIcon;
        private int positiveButtonVisibility;
        private int positiveButtonIconHeight;
        private int positiveButtonIconWidth;
        private int positiveButtonIconColor;
        private String positiveButtonText;
        private int positiveButtonTextColor;
        private int positiveButtonTextSize;


        private int negativeButtonIcon;
        private int negativeButtonVisibility;
        private int negativeButtonIconHeight;
        private int negativeButtonIconWidth;
        private int negativeButtonIconColor;
        private String negativeButtonText;
        private int negativeButtonTextColor;
        private int negativeButtonTextSize;
        private int buttonsGravity;

        public wowDialogBuilder() {
        }

        public wowDialogBuilder setMessageBoxTextLimit(int messageBoxTextLimit) {
            this.messageBoxTextLimit = messageBoxTextLimit;
            return this;
        }

        public wowDialogBuilder setMessageBoxTextGravity(int messageBoxTextGravity) {
            this.messageBoxTextGravity = messageBoxTextGravity;
            return this;
        }

        public wowDialogBuilder setCardRadius(int cardRadius) {
            this.cardRadius = cardRadius;
            return this;
        }

        public wowDialogBuilder setCardElevation(int cardElevation) {
            this.cardElevation = cardElevation;
            return this;
        }

        public wowDialogBuilder setCardBackgroundColor(int cardBackgroundColor) {
            this.cardBackgroundColor = cardBackgroundColor;
            return this;
        }

        public wowDialogBuilder setCardHeight(int cardHeight) {
            this.cardHeight = cardHeight;
            return this;
        }

        public wowDialogBuilder setCardWidth(int cardWidth) {
            this.cardWidth = cardWidth;
            return this;
        }

        public wowDialogBuilder setCardMargin(int cardMargin) {
            this.cardMargin = cardMargin;
            return this;
        }

        public wowDialog showWowDialog() {
            // isValidateEmployeeData();
            return new wowDialog(this);
        }

        public wowDialogBuilder setPositiveButtonIcon(int positiveButtonIcon) {
            this.positiveButtonIcon = positiveButtonIcon;
            return this;
        }

        public wowDialogBuilder setNegativeButtonIcon(int negativeButtonIcon) {
            this.negativeButtonIcon = negativeButtonIcon;
            return this;
        }

        public wowDialogBuilder setButtonsGravity(int buttonsGravity) {
            this.buttonsGravity = buttonsGravity;
            return this;
        }

        public wowDialogBuilder setNegativeButtonText(String negativeButtonText) {
            this.negativeButtonText = negativeButtonText;
            return this;
        }

        public wowDialogBuilder setPositiveButtonText(String positiveButtonText) {
            this.positiveButtonText = positiveButtonText;
            return this;
        }


        public wowDialogBuilder setDividerColor(int dividerColor) {
            this.dividerColor = dividerColor;
            return this;
        }

        public wowDialogBuilder setDividerVisibility(int dividerVisibility) {
            this.dividerVisibility = dividerVisibility;
            return this;
        }

        public wowDialogBuilder setHeaderText(String headerText) {
            this.headerText = headerText;
            return this;
        }

        public wowDialogBuilder setHeaderTextSize(int headerTextSize) {
            this.headerTextSize = headerTextSize;
            return this;
        }

        public wowDialogBuilder setHeaderTextColor(int headerTextColor) {
            this.headerTextColor = headerTextColor;
            return this;
        }

        public wowDialogBuilder setHeaderTextVisibility(int headerTextVisibility) {
            this.headerTextVisibility = headerTextVisibility;
            return this;
        }

        public wowDialogBuilder setPositiveButtonVisibility(int positiveButtonVisibility) {
            this.positiveButtonVisibility = positiveButtonVisibility;
            return this;
        }

        public wowDialogBuilder setPositiveButtonIconHeight(int positiveButtonIconHeight) {
            this.positiveButtonIconHeight = positiveButtonIconHeight;
            return this;
        }

        public wowDialogBuilder setPositiveButtonIconWidth(int positiveButtonIconWidth) {
            this.positiveButtonIconWidth = positiveButtonIconWidth;
            return this;
        }

        public wowDialogBuilder setPositiveButtonIconColor(int positiveButtonIconColor) {
            this.positiveButtonIconColor = positiveButtonIconColor;
            return this;
        }

        public wowDialogBuilder setPositiveButtonTextColor(int positiveButtonTextColor) {
            this.positiveButtonTextColor = positiveButtonTextColor;
            return this;
        }

        public wowDialogBuilder setNegativeButtonVisibility(int negativeButtonVisibility) {
            this.negativeButtonVisibility = negativeButtonVisibility;
            return this;
        }

        public wowDialogBuilder setNegativeButtonIconHeight(int negativeButtonIconHeight) {
            this.negativeButtonIconHeight = negativeButtonIconHeight;
            return this;
        }

        public wowDialogBuilder setNegativeButtonIconWidth(int negativeButtonIconWidth) {
            this.negativeButtonIconWidth = negativeButtonIconWidth;
            return this;
        }

        public wowDialogBuilder setNegativeButtonIconColor(int negativeButtonIconColor) {
            this.negativeButtonIconColor = negativeButtonIconColor;
            return this;
        }

        public wowDialogBuilder setNegativeButtonTextColor(int negativeButtonTextColor) {
            this.negativeButtonTextColor = negativeButtonTextColor;
            return this;
        }

        public wowDialogBuilder setMessageBoxText(String messageBoxText) {
            this.messageBoxText = messageBoxText;
            return this;
        }

        public wowDialogBuilder setMessageBoxTextSize(int messageBoxTextSize) {
            this.messageBoxTextSize = messageBoxTextSize;
            return this;
        }

        public wowDialogBuilder setMessageBoxTextColor(int messageBoxTextColor) {
            this.messageBoxTextColor = messageBoxTextColor;
            return this;
        }

        public wowDialogBuilder setMessageBoxVisibility(int messageBoxVisibility) {
            this.messageBoxVisibility = messageBoxVisibility;
            return this;
        }

        public wowDialogBuilder setMessageBoxBackgroundDrawable(int messageBoxBackgroundDrawable) {
            this.messageBoxBackgroundDrawable = messageBoxBackgroundDrawable;
            return this;
        }

        public wowDialogBuilder setPositiveButtonTextSize(int positiveButtonTextSize) {
            this.positiveButtonTextSize = positiveButtonTextSize;
            return this;
        }

        public wowDialogBuilder setNegativeButtonTextSize(int negativeButtonTextSize) {
            this.negativeButtonTextSize = negativeButtonTextSize;
            return this;
        }

        public wowDialogBuilder setMessageBoxTextHint(int messageBoxTextHint) {
            this.messageBoxTextHint = messageBoxTextHint;
            return this;
        }

        public wowDialogBuilder setMessageBoxTextHintColor(int messageBoxTextHintColor) {
            this.messageBoxTextHintColor = messageBoxTextHintColor;
            return this;
        }

        public wowDialogBuilder setMessageBoxDisplayOnly(Boolean messageBoxDisplayOnly) {
            this.messageBoxDisplayOnly = messageBoxDisplayOnly;
            return this;
        }

        public wowDialogBuilder setCardContentHeight(int cardContentHeight) {
            this.cardContentHeight = cardContentHeight;
            return this;
        }

        public wowDialogBuilder setCardBackgroundImage(int cardBackgroundImage) {
            this.cardBackgroundImage = cardBackgroundImage;
            return this;
        }

        public wowDialogBuilder setCardBackgroundImageScaleType(ImageView.ScaleType cardBackgroundImageScaleType) {
            this.cardBackgroundImageScaleType = cardBackgroundImageScaleType;
            return this;
        }

        public wowDialogBuilder setHeaderfont(Typeface headerfont) {
            Headerfont = headerfont;
            return this;
        }

        public wowDialogBuilder setMessagefont(Typeface messagefont) {
            Messagefont = messagefont;
            return this;
        }

        public wowDialogBuilder setButtonsfont(Typeface buttonsfont) {
            Buttonsfont = buttonsfont;
            return this;
        }
    }
}


