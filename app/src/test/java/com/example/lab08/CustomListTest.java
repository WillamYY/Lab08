package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City edmonton = new City("Edmonton", "AB");
        list.addCity(edmonton);

        // This will fail initially because hasCity() doesn't exist
        assertTrue(list.hasCity(edmonton));
    }

    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList();
        City toronto = new City("Toronto", "ON");
        list.addCity(toronto);
        list.deleteCity(toronto);
        assertFalse(list.hasCity(toronto)); // should fail initially
    }


}
