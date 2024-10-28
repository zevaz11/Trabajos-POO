package controllers;

import com.google.gson.Gson;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;
import database.DB;
import models.Todo;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

public class TodoController implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException{
        System.out.println(exchange.getRequestURI());

        String response = listTodos().toString();
        exchange.sendResponseHeaders(200, response.length());
        OutputStream os = exchange.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }
    public JSONObject listTodos() {
        JSONObject response = new JSONObject();
        response.put("data", DB.data.getJSONArray("todos"));
        response.put("result", "succesful");
        return response;
    }
}

