package com.amaker.ch07.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
/**
 * 
 * @author ����־
 * RPC ����
 */
public class MainActivity extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		Intent intent = new Intent();
		// ����Intent Action ����
		intent.setAction("com.amaker.ch09.app.action.MY_REMOTE_SERVICE");
		// �󶨷���
		startService(intent);
	}
	
}