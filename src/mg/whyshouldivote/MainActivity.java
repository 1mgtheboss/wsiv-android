package mg.whyshouldivote;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class MainActivity extends Activity {
	
	private AdView adView;
	private InterstitialAd interstitial;
	private static final String AD_UNIT_ID_1 = "ca-app-pub-2738757694043962/7916486931";
	private static final String AD_UNIT_ID_2 = "ca-app-pub-2738757694043962/3346686539";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		// Create an ad.
	    adView = new AdView(this);
	    adView.setAdSize(AdSize.BANNER);
	    adView.setAdUnitId(AD_UNIT_ID_1);
	    
	 // Add the AdView to the view hierarchy. The view will have no size
	    // until the ad is loaded.
	    RelativeLayout layout = (RelativeLayout) findViewById(R.id.rl);
	    RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
	            LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
	    params.addRule(RelativeLayout.BELOW, findViewById(R.id.button1).getId());
	    params.addRule(RelativeLayout.CENTER_HORIZONTAL);
	    
	    layout.addView(adView,params);
	    
	    
	 // Create an ad request. Check logcat output for the hashed device ID to
	    // get test ads on a physical device.
	    AdRequest adRequest = new AdRequest.Builder().build();;
	    
	 // Start loading the ad in the background.
	    adView.loadAd(adRequest);
	    
	    
	 // Create the interstitial.
	    interstitial = new InterstitialAd(this);
	    interstitial.setAdUnitId(AD_UNIT_ID_2);


	    	interstitial.setAdListener(new AdListener() {
	        @Override
	        public void onAdLoaded() {
	          
	        	displayInterstitial();

	          
	        }
	        @Override
	        public void onAdFailedToLoad(int errorCode) {
	          
	        }
	    });
		
	    // Create ad request.
	    AdRequest adRequest1 = new AdRequest.Builder().build();
	    // Begin loading your interstitial.
	    interstitial.loadAd(adRequest1);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	  public void onResume() {
	    super.onResume();
	    if (adView != null) {
	      adView.resume();
	    }
	  }

	  @Override
	  public void onPause() {
	    if (adView != null) {
	      adView.pause();
	    }
	    super.onPause();
	  }
	  
	  /** Called before the activity is destroyed. */
	  @Override
	  public void onDestroy() {
	    // Destroy the AdView.
	    if (adView != null) {
	      adView.destroy();
	    }
	    super.onDestroy();
	  }
	  
	// Invoke displayInterstitial() when you are ready to display an interstitial.
		  public void displayInterstitial() {
		    if (interstitial.isLoaded()) {
		      interstitial.show();
		    }
		  }


	public void know(View view) {
	    // Do something in response to button
		Intent intent = new Intent(this, ExplanationActivity.class);
		startActivity(intent);
	}
}
