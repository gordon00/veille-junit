package fr.fragnier.veille.junit4.category;

import fr.fragnier.veille.junit4.category.categories.IntegrationTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(IntegrationTest.class)
public class IntegrationTestClass {

    @Test
    public void integrationTest1() {

    }

    @Test
    public void integrationTest2() {

    }
}
