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

    static ArrayList<String> Tellist = new ArrayList<>();
    static ArrayList<String> KledingList = new ArrayList<>();

    private static void connection() {
        BsonArray quantityArray = new BsonArray();
        ConnectionString connectionString = new ConnectionString("mongodb+srv://webshop:techgrounds@cluster0.ligsm.mongodb.net/webshop?retryWrites=true&w=majority");
        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(connectionString)
                .build();
        MongoClient mongoClient = MongoClients.create(settings);
        MongoDatabase database = mongoClient.getDatabase("webshop");
        MongoCollection<Document> collection = database.getCollection("webshop_data");
        Tellist.add("iphone");
        KledingList.add("Gucci");
        Document teldoc = new Document().append("telefoons", Tellist);
        Document kledingdoc = new Document().append("kleding", KledingList);
        collection.insertOne(kledingdoc);
        collection.insertOne(teldoc);
    }

    public static void main(String[] args) {
        connection();
    }
}
