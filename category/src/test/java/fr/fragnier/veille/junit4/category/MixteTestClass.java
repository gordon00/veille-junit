package fr.fragnier.veille.junit4.category;

import fr.fragnier.veille.junit4.category.categories.IntegrationTest;
import fr.fragnier.veille.junit4.category.categories.UnitTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class MixteTestClass {

    @Test
    @Category(IntegrationTest.class)
    public void integrationTest3() {

    }

    @Test
    @Category(UnitTest.class)
    public void unitTest3() {

    }
}
