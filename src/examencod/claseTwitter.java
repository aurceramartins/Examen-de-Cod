package examencod;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;
public class claseTwitter {

    Twitter mitwitter;

    public claseTwitter() {
        ConfigurationBuilder cb = new ConfigurationBuilder();

        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("VoSmbUz4KtX6LWMADG2wjcai4")
                .setOAuthConsumerSecret("l6UmkUXGVp7kARYmNGB0of5PsVuelFaokEm9rI4v5Fsjb9KZ7U")
                .setOAuthAccessToken("3055290010-QWLhHK12ERY0t18MVAXQk4EfINP44CO9LtFP2Xq")
                .setOAuthAccessTokenSecret("JsDAHOzJOk0YPlXQn56WOM6zpzei2nKvd4m1VerbVT2Gf");
        TwitterFactory tf = new TwitterFactory(cb.build());
        mitwitter = tf.getInstance();
    }

}
