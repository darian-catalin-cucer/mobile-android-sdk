class MainActivity : AppCompatActivity() {

    private lateinit var bannerAdView: AdView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bannerAdView = AdView(this)
        bannerAdView.adSize = AdSize.BANNER
        bannerAdView.adUnitId = "your_banner_ad_unit_id"

        val adRequest = AdRequest.Builder().build()
        bannerAdView.loadAd(adRequest)

        ad_container.addView(bannerAdView)
    }

    override fun onDestroy() {
        bannerAdView.destroy()
        super.onDestroy()
    }
}
