/*
 * Copyright 2007 ZXing authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.zxing;

/**
 * Enumerates barcode formats known to this package.
 *
 * @author Sean Owen
 */
public final class BarcodeFormat {

  // No, we can't use an enum here. J2ME doesn't support it.

  /** QR Code 2D barcode format. */
  public static final BarcodeFormat QR_CODE = new BarcodeFormat("QR_CODE");

  /** DataMatrix 2D barcode format. */
  public static final BarcodeFormat DATAMATRIX = new BarcodeFormat("DATAMATRIX");

  /** UPC-E 1D format. */
  public static final BarcodeFormat UPC_E = new BarcodeFormat("UPC_E");

  /** UPC-A 1D format. */
  public static final BarcodeFormat UPC_A = new BarcodeFormat("UPC_A");

  /** EAN-8 1D format. */
  public static final BarcodeFormat EAN_8 = new BarcodeFormat("EAN_8");

  /** EAN-13 1D format. */
  public static final BarcodeFormat EAN_13 = new BarcodeFormat("EAN_13");

  /** Code 128 1D format. */
  public static final BarcodeFormat CODE_128 = new BarcodeFormat("CODE_128");

  /** Code 39 1D format. */
  public static final BarcodeFormat CODE_39 = new BarcodeFormat("CODE_39");

  /** ITF (Interleaved Two of Five) 1D format. */
  public static final BarcodeFormat ITF = new BarcodeFormat("ITF");

  private final String name;

  private BarcodeFormat(String name) {
    this.name = name;
  }

  public String toString() {
    return name;
  }

}