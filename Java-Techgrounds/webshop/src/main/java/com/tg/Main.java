package com.tg;

import com.mongodb.*;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.BsonArray;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static ArrayList<String> list = new ArrayList<>();

    private static void connection() {
        BsonArray quantityArray = new BsonArray();
        ConnectionString connectionString = new ConnectionString("mongodb+srv://webshop:techgrounds@cluster0.ligsm.mongodb.net/webshop?retryWrites=true&w=majority");
        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(connectionString)
                .build();
        MongoClient mongoClient = MongoClients.create(settings);
        MongoDatabase database = mongoClient.getDatabase("webshop");
        MongoCollection<Document> collection = database.getCollection("webshop_data");
        list.add("iphone");
        Document doc = new Document().append("telefoons", list);
        collection.insertOne(doc);
    }

    public static void main(String[] args) {
        connection();
    }
}
