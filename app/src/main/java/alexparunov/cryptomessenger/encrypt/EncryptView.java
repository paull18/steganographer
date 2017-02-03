package alexparunov.cryptomessenger.encrypt;

import android.graphics.Bitmap;

import java.io.File;

public interface EncryptView {

  String getSecretMessage();

  Bitmap getCoverImage();

  Bitmap getSecretImage();

  void initToolbar();

  void setSecretMessage(String secretMessage);

  void setCoverImage(File file);

  void setSecretImage(File file);

  void showToast(int message);

  void showProgressDialog();

  void stopProgressDialog();

  void openCamera();

  void chooseImage();

}
