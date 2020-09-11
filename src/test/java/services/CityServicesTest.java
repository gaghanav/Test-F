package services;

import junit.framework.TestCase;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CityServicesTest {
    @Test
    public void whenInputCityNameIsTrueShouldReturnListSizeMoreThanZero() throws IOException {
        CityServices cityServicesTest = new CityServices();
        List<String> test = new ArrayList<String>();
        test.add("Pulau Punjung");
        assertEquals(test.size(),cityServicesTest.getCitiesByInputString("pulxu pqnjzng").size());
    }
}