package com.gerirme.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.codeslap.persistence.DatabaseSpec;
import com.codeslap.persistence.Persistence;
import com.codeslap.persistence.PersistenceConfig;
import com.gerirme.R;
import com.gerirme.model.AccountMoviment;
import com.gerirme.model.User;
import com.gerirme.repository.EntityManager;
import com.gerirme.repository.UserRepository;

public class GerirmeActivity extends Activity {

	private static long SLEEP_TIME = 2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_gerirme);
		IntentLauncher launcher = new IntentLauncher();
		launcher.start();
	}

	private class IntentLauncher extends Thread {
		public void run() {
			try {
				// Sleeping
				Thread.sleep(SLEEP_TIME * 1000);
				DatabaseSpec database = PersistenceConfig.registerSpec(1);
				database.match(User.class);
				database.match(AccountMoviment.class);
			} catch (Exception e) {
			}
			EntityManager.createEntityManager(Persistence
					.getAdapter(GerirmeActivity.this));
			Intent intent;
			if (UserRepository.hasLogin()) {
				intent = new Intent(GerirmeActivity.this,
						DashboradActivity.class);
			} else {
				intent = new Intent(GerirmeActivity.this, LoginActivity.class);

			}
			GerirmeActivity.this.startActivity(intent);
			GerirmeActivity.this.finish();
		}
	}
}
