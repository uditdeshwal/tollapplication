package com.example.testrest.service;


import com.example.testrest.model.Discount;
import com.example.testrest.model.Item;
import com.example.testrest.response.PriceDetails;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.env.Environment;


import javax.inject.Inject;

import javax.inject.Named;
import java.io.File;
import java.util.*;

@Named
public class OrderServiceImpl {

    List<Discount> discounts = new ArrayList<>();
    List<Item> items = new ArrayList<>();
    Map<Integer, Item> itemMap = new HashMap<>();


    @Inject
    public OrderServiceImpl(Environment env) throws Exception {

        ObjectMapper objectMapper = new ObjectMapper();
        ClassLoader classLoader = this.getClass().getClassLoader();



        String discountFilePath = env.getProperty("discount.file.path");
        String itemFilePath = env.getProperty("item.file.path");
        File discountFile = new File(classLoader.getResource(discountFilePath).getFile());
        File itemFile = new File(classLoader.getResource(itemFilePath).getFile());

        discounts = objectMapper.readValue(discountFile, new TypeReference<List<Discount>>() {
        });

        items = objectMapper.readValue(itemFile, new TypeReference<List<Item>>() {
        });

        if(items!=null)
        for (Item item : items) {
            itemMap.put(item.getItemId(), item);
        }
    }


    public PriceDetails calPrice(Set<Integer> items, Set<Integer> qty, Date asOfnow) {

        List<Integer> itemsInOrder = new ArrayList<>(items);
        Map<Integer, Discount> discountMap = new HashMap<>();
        for (Discount discount : discounts) {
//            if (discount.getStartDate().before(asOfnow) && items.contains(discount.getItemId())) {
                discountMap.put(discount.getItemId(), discount);

//            }

        }

        List<Integer> qtys = new ArrayList<>(qty);


        items.stream().forEach(item -> {

        });

        int total = 0;

        for (int i = 0; i < itemsInOrder.size(); i++) {

            Integer item = itemsInOrder.get(i);
            Integer q = qtys.get(i);

            int itemPrice = itemMap.get(item).getItemPrice();
            Discount discount = discountMap.get(item);
            if (discount != null) {
                itemPrice = itemPrice - discount.getDiscount();
            }

            total += itemPrice * q;


        }


        Set<Discount> discounts = new HashSet<>(discountMap.values());


        return new PriceDetails(total, discounts);


    }

}
