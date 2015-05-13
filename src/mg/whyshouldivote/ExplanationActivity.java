package mg.whyshouldivote;

import java.util.Random;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class ExplanationActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_explanation);
		// Show the Up button in the action bar.
		setupActionBar();
		String explanations[]={"A study conducted by Transparency International in year 2005 found that more than 62% of Indians had firsthand experience of paying bribes or influence peddling to get jobs done in public offices successfully.",
				" In its study conducted in year 2008, Transparency International reports about 40% of Indians had firsthand experience of paying bribes or using a contact to get a job done in public office.",
				"In 2012 India has ranked 94th out of 176 countries in Transparency International's Corruption Perceptions Index.",
				"Most of the largest sources of corruption in India are entitlement programmes and social spending schemes enacted by the Indian government. Examples include Mahatma Gandhi National Rural Employment Guarantee Act and National Rural Health Mission. Other daily sources of corruption include India's trucking industry which is forced to pay billions in bribes annually to numerous regulatory and police stops on its interstate highways.",
				"Indian media has widely published allegations of corrupt Indian citizens stashing trillions of dollars in Swiss banks. Swiss authorities, however, deny these allegations.",
				"As of December 2008, 120 of India's 523 parliament members were accused of crimes, under India's First Information Report procedure wherein anyone can allege another of committing a crime.",
				"2G spectrum scam:\n2G spectrum scam was a scam involving politicians and government officials in India illegally undercharging mobile telephone companies for frequency allocation licenses, which they would then use to create 2G spectrum subscriptions for cell phones. The shortfall between the money collected and the money that the law mandated to be collected is estimated to be 1766.45 billion (US$29 billion), as valued by the Comptroller and Auditor General of India based on 3G and BWA spectrum auction prices in 2010.",
				"2010 Commonwealth Games scam:\nA number of concerns and controversies surfaced before the 2010 Commonwealth Games in New Delhi, India, which received widespread media coverage both in India (the host nation) and internationally.",
				"Adarsh Housing Society scam:\nThe Adarsh Housing Society is a posh, 31 storey building constructed on prime real estate in Colaba, Mumbai, allegedly for the welfare of war widows and personnel of India’s Ministry of Defence. Over a period of several years, politicians, bureaucrats and military officers conspired to bend several rules concerning land ownership, zoning, floor space index and membership to get themselves flats allotted in this cooperative society at below-market rates.The scam was unearthed in November 2010 which forced the then Chief Minister of Maharashtra, Ashok Chavan, to resign.",
				"Indian coal allocation scam:\nCoal allocation scam or Coalgate, as referred by the media, is a political scandal concerning the Indian government's allocation of the nation's coal deposits to public sector entities (PSEs) and private companies by Prime Minister Manmohan Singh. In a draft report issued in March 2012, the Comptroller and Auditor General of India (CAG) office accused the Government of India of allocating coal blocks in an inefficient manner during the period 2004–2009. Over the Summer of 2012, the opposition BJP lodged a complaint resulting in a Central Bureau of Investigation probe into whether the allocation of the coal blocks was in fact influenced by corruption.",
				"Taxes and bribes are common between state borders; Transparency International estimates that truckers pay annually 222 billion (US$ 4.5 billion) in bribes.According to a 2007 World Bank published report, the travel time for a Delhi-Mumbai trip can be reduced by about 2 days per trip if the corruption and associated regulatory stoppages to extract bribes was eliminated.",
				"Cash-for-votes scandal:\nThe cash-for-votes scandal is a scandal in which the United Progressive Alliance, the majority-holding parliamentary-party alliance of India led by Sonia Gandhi, allegedly bribed Bhartiya Janta Party MPs in order to survive a confidence vote on 22 July 2008. The vote in the Lok Sabha arose after the Communist Party of India (Marxist)-led Left Front withdrew support from the government, who wanted to pursue an Indo-US nuclear deal.",
				"Illegal iron ore mining in Karnataka:\nRising global iron-ore prices driven by Chinese demand brought focus to the iron ore rich Bellary region of Karnataka. This iron ore is alleged to have been illegally mined after paying a minuscule royalty to the government.",
				"Corruption in tendering processes and awarding contracts:\nA 2006 report claimed state-funded construction activities in Uttar Pradesh, such as road building, were dominated by construction mafias, which are groupings of corrupt public works officials, materials suppliers, politicians and construction contractors.",
				"Corruption caused problems in government funded projects are not limited to the state of Uttar Pradesh. According to The World Bank, aid programmes are beset by corruption, bad administration and under-payments. As an example, the report cites only 40% of grain handed out for the poor reaches its intended target. The World Bank study finds that the public distribution programmes and social spending contracts have proven to be a waste due to corruption.",
				"Corruption in government hospitals:\nIn Government Hospitals, corruption is associated with non-availability/duplication of medicines, getting admission, consultations with doctors and availing diagnostic services.he National Rural Health Mission programme has been clouded by a large-scale corruption scandal in which top government appointed officials were arrested, several of whom died under mysterious circumstances including one in prison. Corruption, waste and fraud-related losses from this government programme has been alleged to be  100 billion (US$2 billion).",
				"Corruption in Science and technology:\nCSIR, the Council of Scientific and Industrial Research, has been flagged in ongoing efforts to root out corruption in India. Despite being established with the directive to do translational research and create real technologies, CSIR has been accused of transforming into a ritualistic, overly-bureaucratic organisation that does little more than churn out papers.",
				"Corruption in Income Tax Dept.\nThere have been several cases of collusion of officials of the income tax department of India for preferential tax treatment and relaxed prosecutions in exchange for bribes.",
				"Iron ore mining scandal:\nIn August 2011, an iron ore mining scandal became a media focus in India. In September 2011, Janardhana Reddy – an elected member of Karnataka's legislative assembly – was arrested on charges of corruption and illegal mining of iron ore in his home state of Karnataka.",
				"Corruption in Driver Licensing:\nA study conducted between 2004 and 2005 found that India's driver licensing procedure was a hugely distorted bureaucratic process and allows drivers to be licensed despite their low driving ability through promoting the usage of agents. Individuals with high willingness to pay make a significant payment above the official fee and most of these extra payments are made to agents, who act as an intermediary between bureaucrats and applicants.",
				"Professor Bibek Debroy and Laveesh Bhandari claim in their book Corruption in India: The DNA and RNA that the public officials in India may be cornering as much as  921 billion ($18.42 billion), or 1.26 per cent of the GDP, through corruption.",
				"A 2011 KPMG study reports India's real estate, telecommunications and government-run social development projects as the three top most corruption plagued sectors. The study found India's defence, information technology industry and energy sectors are the most competitive and least corruption prone sectors.",
				"CMS India claims in its 2010 India Corruption Study report that socio-economically weaker section of the Indian society is most adversely affected by government corruption – these include the rural and urban poor. The study additionally claims that corruption perception nationwide has decreased between 2005 to 2010. Over the 5-year period, significantly more number of people from the middle class as well as the poorest segments of Indian society surveyed, in all parts of the India, claimed government corruption had dropped over time, and they had lesser direct experiences with demands for bribes.",
				"Black money:\nA November 2010 report from the Washington-based Global Financial Integrity estimates that over a 60-year period, India lost US$213 billion in illicit financial flows beginning in 1948; adjusted for inflation, this is estimated to be 462 billion in 2010 dollars, or about $8 billion per year ($7 per capita per year). The report also estimated the size of India's underground economy at approximately US$640 billion at the end of 2008 or roughly 50% of the nation's GDP.",
				"Corruption in Judiciary:\nAccording to Transparency International, judicial corruption in India is attributable to factors such as \"delays in the disposal of cases, shortage of judges and complex procedures, all of which are exacerbated by a preponderance of new laws\".",
				"Corruption in Armed Forces:\nThe Indian Armed Forces have witnessed corruption involving senior armed forces officers from the Indian Army, Indian Navy and Indian Air Force. A number of scandals in the 2000–2010 period damaged the military's reputation; such scandals included skimming of armed forces money, re-selling of government property, and faking combat missions."
				
				
		};
				
		
		Random randomNumber=new Random();
		int n=(randomNumber.nextInt(explanations.length));
		TextView textView = (TextView) findViewById(R.id.textView1);
		textView.setText(explanations[n]+"\n");
		
		
	}

	/**
	 * Set up the {@link android.app.ActionBar}, if the API is available.
	 */
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	private void setupActionBar() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
			getActionBar().setDisplayHomeAsUpEnabled(true);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.explanation, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
