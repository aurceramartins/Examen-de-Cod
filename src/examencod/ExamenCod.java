package examencod;

import twitter4j.TwitterException;
import javax.swing.JOptionPane;

public class ExamenCod {

    public static void main(String[] args) throws TwitterException {
        claseTwitter tweet = new claseTwitter();
        tweet.gettingTimeLine();
        //tweet.consultarTweets(JOptionPane.showInputDialog(""));
        //tweet.hacerUnTweet(JOptionPane.showInputDialog(""));
    }

}
