package com.company;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import ru.binbank.efirdatahub.entities.TableResponse;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) throws IOException {
        //InputStream input = new FileInputStream("TestFiles/ListRatings_short.json");
        InputStream input = new FileInputStream("TestFiles/ListRatings.json");

        ObjectMapper om = new ObjectMapper();
        om.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
	    TableResponse tableResponse = om.readValue(input, TableResponse.class);

	    System.out.print("done");


    }
}
