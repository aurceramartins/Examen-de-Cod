package examencod;

import twitter4j.TwitterException;
import javax.swing.JOptionPane;

public class ExamenCod {

    public static void main(String[] args) throws TwitterException {
        claseTwitter tweet = new claseTwitter();
        //et.gettingTimeLine();
        //tweet.consultarTweets(JOptionPane.showInputDialog("Inserta el tweet que quieras buscar"));
        tweet.hacerUnTweet(JOptionPane.showInputDialog("Puedes escribir aqui tu tweet"));
    }

}
