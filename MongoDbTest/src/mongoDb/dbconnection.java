package mongoDb;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class dbconnection {
	public static void main(String[] args) {
		MongoClient mongoClient = new MongoClient("localhost", 27017);
		
		MongoDatabase db = mongoClient.getDatabase("testDb");
		
		MongoCollection<Document> documentMongoCollection = db.getCollection("testCollection");
		
		BasicDBObject query = new BasicDBObject();
		query.put("title", "testTitle");
		query.put("text", "test text");
		
		List<BasicDBObject> coll = new ArrayList<>();
		
		coll.add(new BasicDBObject("title", "test"));
		coll.add(new BasicDBObject("title", "test text"));
		
		
	}
}
