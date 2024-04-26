package br.cesul.lista04.ex03;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class BarbecueTest {

    private Barbecue barbecue;

    @BeforeEach
    public void setup(){
        this.barbecue =  new Barbecue(5,2,1);
    }
    @Test
     public void getConsumeMeet(){
        assertEquals(2.7,barbecue.getMeatConsume());
     }
    @Test
     public void getConsumeBeer(){
        assertEquals(3.0,barbecue.getBeerConsume());
     }
    @AfterEach
    public void tearDown(){
        this.barbecue = null;
    }
}
