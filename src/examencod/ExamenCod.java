package examencod;

import twitter4j.TwitterException;
import javax.swing.JOptionPane;

public class ExamenCod {

    /**
     * Description : El programa tiene tres metodos que los llamamos desde el
     * main uno el getting timeline que busca los mensajes de twitter publicados
     * el metodo consultarTweets le introduces un string y busca todo lo
     * relacionado con ese -string y el metodo hacerUnTweet puedes mandar tweets
     * desde el e+simplemente tienes que escribirlo.
     *
     * @author Alex Urcera version: 1.0
     */
    public static void main(String[] args) throws TwitterException {
        /**
         * @param args the command line arguments
         */
        claseTwitter tweet = new claseTwitter();
        //tweet.gettingTimeLine();
        //tweet.consultarTweets(JOptionPane.showInputDialog("Inserta el tweet que quieras buscar"));
        tweet.hacerUnTweet(JOptionPane.showInputDialog("Puedes escribir aqui tu tweet"));
    }

}
