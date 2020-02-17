//package com.example.testrest.request;
//
//import com.example.testrest.model.Discount;
//import com.example.testrest.model.Item;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.sun.jersey.api.client.Client;
//import com.sun.jersey.api.client.ClientResponse;
//import com.sun.jersey.api.client.WebResource;
//
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//import java.util.Date;
//
//public class PostClient {
//
//    public static void main(String[] args) throws Exception {
//        DateFormat simple = new SimpleDateFormat("dd_MMM_yyyy_HH:mm:ss");
//
//        Date date = new Date();
//        System.out.println(simple.format(date));
//        User user = new User("niharikaiec@gmail.com","100","niharika");
//        Calendar calendar = Calendar.getInstance();
//        calendar.add(Calendar.YEAR,5);
//        Discount discount = new Discount(1, 123, Calendar.getInstance().getTime(),calendar.getTime(),5);
//
//        Item item = new Item(123,100);
//        ObjectMapper objectMapper = new ObjectMapper();
//       System.out.println( objectMapper.writeValueAsString(discount));
//
//       System.out.println(objectMapper.writeValueAsString(user));
//
//     //  User userN =objectMapper.readValue(objectMapper.writeValueAsString(user), User.class);
//      //  objectMapper.readValue(new File(""), new TypeReference<List<User>>(){});
//       System.out.println();
//
//        Client client = Client.create();
//
//        WebResource webResource = client
//                .resource("http://localhost:9082/v1/api/user");
//
//       String input = "{\"email\":\"niharikaiec@gmail.com\",\"age\":\"100\",\"name\":\"niharika\"}";
//
//        ClientResponse response = webResource.type("application/json")
//                .post(ClientResponse.class,input);
//
//        if (response.getStatus() != 201) {
//            throw new RuntimeException("Failed : HTTP error code : "
//                    + response.getStatus());
//        }
//
//        System.out.println("Output from Server .... \n");
//        User output = response.getEntity(User.class);
//        System.out.println(output);
//
//
//
//
//
//
//
//    }
//}
//package com.example.testrest.request;
//
//import com.example.testrest.model.Discount;
//import com.example.testrest.model.Item;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.sun.jersey.api.client.Client;
//import com.sun.jersey.api.client.ClientResponse;
//import com.sun.jersey.api.client.WebResource;
//
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//import java.util.Date;
//
//public class PostClient {
//
//    public static void main(String[] args) throws Exception {
//        DateFormat simple = new SimpleDateFormat("dd_MMM_yyyy_HH:mm:ss");
//
//        Date date = new Date();
//        System.out.println(simple.format(date));
//        User user = new User("niharikaiec@gmail.com","100","niharika");
//        Calendar calendar = Calendar.getInstance();
//        calendar.add(Calendar.YEAR,5);
//        Discount discount = new Discount(1, 123, Calendar.getInstance().getTime(),calendar.getTime(),5);
//
//        Item item = new Item(123,100);
//        ObjectMapper objectMapper = new ObjectMapper();
//       System.out.println( objectMapper.writeValueAsString(discount));
//
//       System.out.println(objectMapper.writeValueAsString(user));
//
//     //  User userN =objectMapper.readValue(objectMapper.writeValueAsString(user), User.class);
//      //  objectMapper.readValue(new File(""), new TypeReference<List<User>>(){});
//       System.out.println();
//
//        Client client = Client.create();
//
//        WebResource webResource = client
//                .resource("http://localhost:9082/v1/api/user");
//
//       String input = "{\"email\":\"niharikaiec@gmail.com\",\"age\":\"100\",\"name\":\"niharika\"}";
//
//        ClientResponse response = webResource.type("application/json")
//                .post(ClientResponse.class,input);
//
//        if (response.getStatus() != 201) {
//            throw new RuntimeException("Failed : HTTP error code : "
//                    + response.getStatus());
//        }
//
//        System.out.println("Output from Server .... \n");
//        User output = response.getEntity(User.class);
//        System.out.println(output);
//
//
//
//
//
//
//
//    }
//}
