package shoe116.moga
import twitter._

object App {
  def main(args: Array[String]) {
    print("moga test")
    //Trend.trends(1118370)
    //Tweet.post("this message is posted by scala")
    val mogaStatus = Tweet.getTimelineById(Tweet.mogaId)
    Tweet.createTweetList(mogaStatus)
  }
}
