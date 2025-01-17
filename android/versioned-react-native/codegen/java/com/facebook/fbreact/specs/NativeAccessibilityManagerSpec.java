
/**
 * Copyright (c) Facebook, Inc. and its affiliates.
 *
 * This source code is licensed under the MIT license found in the LICENSE file in the root
 * directory of this source tree.
 *
 * @generated by codegen project: GenerateModuleJavaSpec.js
 *
 * @nolint
 */

package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

public abstract class NativeAccessibilityManagerSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
  public NativeAccessibilityManagerSpec(ReactApplicationContext reactContext) {
    super(reactContext);
  }

  @ReactMethod
  public abstract void getCurrentBoldTextState(Callback onSuccess, Callback onError);

  @ReactMethod
  public abstract void getCurrentGrayscaleState(Callback onSuccess, Callback onError);

  @ReactMethod
  public abstract void getCurrentInvertColorsState(Callback onSuccess, Callback onError);

  @ReactMethod
  public abstract void getCurrentReduceMotionState(Callback onSuccess, Callback onError);

  @ReactMethod
  public abstract void getCurrentReduceTransparencyState(Callback onSuccess, Callback onError);

  @ReactMethod
  public abstract void getCurrentVoiceOverState(Callback onSuccess, Callback onError);

  @ReactMethod
  public abstract void setAccessibilityContentSizeMultipliers(ReadableMap JSMultipliers);

  @ReactMethod
  public abstract void setAccessibilityFocus(double reactTag);

  @ReactMethod
  public abstract void announceForAccessibility(String announcement);
}
