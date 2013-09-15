package util
import scala.util.parsing.json.JSON;
import scala.util.parsing.json.JSONObject

class Twitter4jLib(){
	def getTweets(statusList : twitter4j.ResponseList[twitter4j.Status]){
		
		var i : Int = 0
		while(i < statusList.size()){
		    println("--------------- counter:" + i + "------------------")
			val status = statusList.get(i)
			println(status.getText())
			val tweet : Tuple2[Long, String] = (status.getId(), status.getText())
			i += 1
		}
	}
}