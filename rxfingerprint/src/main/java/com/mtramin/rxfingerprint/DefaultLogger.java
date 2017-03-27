package com.mtramin.rxfingerprint;

import android.util.Log;

final class DefaultLogger implements RxFingerprintLogger {
	private static final String TAG = "RxFingerprint";

	@Override
	public void warn(String message) {
		Log.w(TAG, message);
	}

	@Override
	public void error(String message, Throwable throwable) {
		Log.e(TAG, message, throwable);
	}
}
