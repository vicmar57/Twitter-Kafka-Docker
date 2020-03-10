package TwittProducer

import java.io.FileInputStream
import java.util.Properties

/**
 * A base class to handle Twitter setup needs.
 */
class TwitterBase {

  // twitter
//  var consumerKey = ""
//  var consumerSecret = ""
//  var accessToken = ""
//  var accessTokenSecret = ""

//  def getTwitterInstance: Twitter = {
//    val cb = new ConfigurationBuilder()
//    cb.setDebugEnabled(true)
//      .setOAuthConsumerKey(consumerKey)
//      .setOAuthConsumerSecret(consumerSecret)
//      .setOAuthAccessToken(accessToken)
//      .setOAuthAccessTokenSecret(accessTokenSecret)
//    return new TwitterFactory(cb.build()).getInstance
//  }


  val (consumerKey, consumerSecret, accessToken, accessTokenSecret) =
    try {
      val prop = new Properties()
      prop.load(new FileInputStream("twitter.properties"))

      (
        prop.getProperty("consumerKey"),
        new Integer(prop.getProperty("consumerSecret")),
        prop.getProperty("accessToken"),
        prop.getProperty("accessTokenSecret")
      )
    } catch { case e: Exception =>
      e.printStackTrace()
      sys.exit(1)
    }

//  def populatePropertiesFromConfigFile(propertiesFilename: String) {
//    val properties = Utils.loadPropertiesFile(propertiesFilename)
//    consumerKey = properties.getProperty("oauth.consumerKey")
//    consumerSecret = properties.getProperty("oauth.consumerSecret")
//    accessToken = properties.getProperty("oauth.accessToken")
//    accessTokenSecret = properties.getProperty("oauth.accessTokenSecret")
//    twitterUsername = properties.getProperty("twitter_username")
//    emailSendTo = properties.getProperty("email_send_to")
//    emailFrom = properties.getProperty("email_from")
//    emailSmtpHost = properties.getProperty("email_smtp_host")
//  }
}